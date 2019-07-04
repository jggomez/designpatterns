package co.devhack.patterns.observer

fun main(args: Array<String>) {

    val streamData = arrayListOf(1, 2, 3, 4, 5)
    val observable = Observable<Int>()

    val observer1 = { data: Int -> println("Observer 1: $data") }
    val observer2 = { data: Int -> println("Observer 2: ${data * 2}") }
    val observer3 = { data: Int -> println("Observer 3: ${data * 3}") }

    observable.subscribe(observer1)
    observable.subscribe(observer2)
    observable.subscribe(observer3)

    streamData.forEachIndexed { index, i ->
        Thread.sleep(2000)
        println("************ Nueva data: $i ***********")
        observable.notify(i)

        // Cancelar suscripción despues del dato No. 3
        if (index == 2) {
            println("<<<<< Cancelando suscripción del observador 2 >>>>>")
            observable.unsubscribe(observer2)
        }

    }
}

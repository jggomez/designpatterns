package co.devhack.patterns.observer

class Observer<T> {

    // Apilador
    private val observers: MutableList<(data: T) -> Unit> = arrayListOf()

    fun notify(valor: T) { observers.forEach { it(valor) } }

    // Adiciona función a el arreglo
    fun subscribe(subFunc: (data: T) -> Unit) {
        observers.add(subFunc)
    }

    // Función que elimina un observador.
    fun unsubscribe (subFun: (data: T) -> Unit) {
        observers.remove(subFun)
    }
}

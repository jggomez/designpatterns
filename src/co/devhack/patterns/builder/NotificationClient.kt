package co.devhack.patterns.builder

fun main(args: Array<String>) {

    val notification = NotificationDialog.Builder("Workshop de AS")
            .addTitle("Info de AS")
            .build()

    println(notification.show())
}
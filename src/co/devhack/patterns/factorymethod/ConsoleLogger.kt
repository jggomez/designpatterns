package co.devhack.patterns.factorymethod

class ConsoleLogger : Logger {
    override fun log(message: String) =
            println(message)
}
package co.devhack.patterns.decorator

class ConsoleLogger : Logger {
    override fun log(message: String) {
        println(message)
    }

}
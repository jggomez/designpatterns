package co.devhack.patterns.decorator

// Concrete Component
class ConsoleLogger : Logger {
    override fun log(message: String) =
            println(message)
}
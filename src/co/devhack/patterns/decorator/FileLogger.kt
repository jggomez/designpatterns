package co.devhack.patterns.decorator

// Concrete Component
class FileLogger : Logger {
    override fun log(message: String) =
            println("print en archivo")
}
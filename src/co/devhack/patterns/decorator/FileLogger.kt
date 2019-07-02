package co.devhack.patterns.decorator

class FileLogger : Logger {
    override fun log(message: String) {
        println("print en archivo")
    }
}
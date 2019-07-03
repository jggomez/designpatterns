package co.devhack.patterns.factorymethod

class FileLogger : Logger {
    override fun log(message: String) =
            println("print en archivo")
}
package co.devhack.patterns.factorymethod

class LoggerFactory {

    private fun isFileLoggingEnabled(): Boolean {
        // You can query a data base o config file o property
        return false
    }

    fun getLogger() =
            when (isFileLoggingEnabled()) {
                true -> FileLogger()
                false -> ConsoleLogger()
            }
}

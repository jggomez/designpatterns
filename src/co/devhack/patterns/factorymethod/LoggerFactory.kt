package co.devhack.patterns.factorymethod

class LoggerFactory {

    private fun isFileLoggingEnabled(): Boolean {
        // You can query a data base o config file o property
        return true
    }

    fun getLogger() =
            when (isFileLoggingEnabled()) {
                true -> FileLogger()
                false -> ConsoleLogger()
            }
}

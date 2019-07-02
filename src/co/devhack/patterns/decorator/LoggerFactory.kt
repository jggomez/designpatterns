package co.devhack.patterns.decorator

class LoggerFactory {

    private fun isFileLoggingEnabled(): Boolean {
        return false
    }

    fun getLogger() =
            when (isFileLoggingEnabled()) {
                true -> FileLogger()
                false -> ConsoleLogger()
            }

}
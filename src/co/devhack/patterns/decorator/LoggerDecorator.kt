package co.devhack.patterns.decorator

open class LoggerDecorator(
        private val logger: Logger
) : Logger {

    override fun log(message: String) {
        logger.log(message)
    }

}
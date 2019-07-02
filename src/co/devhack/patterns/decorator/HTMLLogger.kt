package co.devhack.patterns.decorator

class HTMLLogger(
        private val logger: Logger
) : LoggerDecorator(logger) {

    override fun log(message: String) {
        logger.log(makeHTML(message))
    }

    private fun makeHTML(message: String) =
            "<html><body><h1>$message</h1></body></html>"
}
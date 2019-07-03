package co.devhack.patterns.decorator

class EncryptLogger(
        private val logger: Logger
) : LoggerDecorator(logger) {

    override fun log(message: String) =
            logger.log(encrypt(message))

    private fun encrypt(message: String) =
            "${message.substring(message.length - 1)} " +
                    "${message.substring(0, message.length - 1)}\""

}
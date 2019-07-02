package co.devhack.patterns.decorator

fun main(args: Array<String>) {

    val factory = LoggerFactory()
    val logger = factory.getLogger()

    val htmDecorator = HTMLLogger(logger)
    htmDecorator.log("Workshop de AS")

    val encryptLogger = EncryptLogger(logger)
    encryptLogger.log("Workshop de AS")

}
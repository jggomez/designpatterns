package co.devhack.patterns.strategy

fun main(args: Array<String>) {
    val encryptLogger = EncryptLogger()

    encryptLogger.setEncryptionStrategy(EncryptMethod1())
    encryptLogger.log("Workshop de AS")

    encryptLogger.setEncryptionStrategy(EncryptMethod2())
    encryptLogger.log("Workshop de AS")

}
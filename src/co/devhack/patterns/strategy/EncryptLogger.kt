package co.devhack.patterns.strategy

class EncryptLogger {

    private lateinit var encryptionStrategy: EncryptionStrategy

    fun log(message: String) =
            println(encrypt(message))

    private fun encrypt(message: String) =
            encryptionStrategy.encrypt(message)

    fun setEncryptionStrategy(encryptionStrategy: EncryptionStrategy) {
        this.encryptionStrategy = encryptionStrategy
    }
}
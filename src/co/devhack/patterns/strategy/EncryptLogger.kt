package co.devhack.patterns.strategy

class EncryptLogger {

    private lateinit var encryptionStrategy: EncryptionStrategy

    fun log(message: String) {
        val messageEncrypt = encrypt(message)
        println(messageEncrypt)
    }

    private fun encrypt(message: String) =
            encryptionStrategy.encrypt(message)

    fun setEncryptionStrategy(encryptionStrategy: EncryptionStrategy) {
        this.encryptionStrategy = encryptionStrategy
    }
}
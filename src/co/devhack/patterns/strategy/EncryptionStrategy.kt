package co.devhack.patterns.strategy

interface EncryptionStrategy {

    fun encrypt(data: String): String

}
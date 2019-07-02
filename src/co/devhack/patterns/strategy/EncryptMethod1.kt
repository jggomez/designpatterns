package co.devhack.patterns.strategy

class EncryptMethod1 : EncryptionStrategy {

    override fun encrypt(data: String): String {
        // Execute a encrypt method
        return "**** $data *****"
    }
}
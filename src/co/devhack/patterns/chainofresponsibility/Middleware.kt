package co.devhack.patterns.chainofresponsibility

abstract class Middleware {

    private var next: Middleware? = null

    fun linkWith(next: Middleware): Middleware {
        this.next = next
        return next
    }

    abstract fun check(data: Data): Boolean

    fun checkNext(data: Data): Boolean = next?.check(data) ?: true

}

data class Data(
        val email: String,
        val password: String
)
package co.devhack.patterns.chainofresponsibility

class UserExistsMiddleware : Middleware() {
    override fun check(data: Data): Boolean {
        val userRegistered = true // validate if the user is registered
        if (!userRegistered)
            return false
        println("Passed UserExistsMiddleware")
        return checkNext(data)
    }
}
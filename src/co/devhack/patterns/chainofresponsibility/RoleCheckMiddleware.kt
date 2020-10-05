package co.devhack.patterns.chainofresponsibility

class RoleCheckMiddleware : Middleware() {
    override fun check(data: Data): Boolean {
        if (data.email == "admin@devhack.co")
            return true

        println("Passed RoleCheckMiddleware")
        return checkNext(data)
    }
}
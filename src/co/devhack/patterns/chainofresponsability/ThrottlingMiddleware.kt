package co.devhack.patterns.chainofresponsability

class ThrottlingMiddleware(
        private val requestPerMinute: Int
) : Middleware() {

    override fun check(data: Data): Boolean {
        val request = 10 // calculate request
        if (request > requestPerMinute) {
            println("Request limit exceeded! STOP")
        }
        println("Passed ThrottlingMiddleware")
        return checkNext(data)
    }
}

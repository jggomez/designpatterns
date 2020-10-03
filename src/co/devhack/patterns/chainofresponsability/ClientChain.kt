package co.devhack.patterns.chainofresponsability

fun main(args: Array<String>) {
    val middleware = ThrottlingMiddleware(15).apply {
        linkWith(UserExistsMiddleware())
                .linkWith(RoleCheckMiddleware())
    }

    middleware.check(Data(
            "juan@devhack.co",
            "123456789"
    ))
}

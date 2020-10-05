package co.devhack.patterns.chainofresponsibility

fun main(args: Array<String>) {
    val middleware = ThrottlingMiddleware(5).apply {
        linkWith(UserExistsMiddleware())
                .linkWith(RoleCheckMiddleware())
    }

    middleware.check(Data(
            "admin@devhack.co",
            "123456789"
    ))
}

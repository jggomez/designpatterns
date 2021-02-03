package co.devhack.patterns.templatemethod

class UserRepositoryImp {

    private val user: User by lazy {
        User("Juan Guillermo", "Guanajuato 45", "32234555")
    }

    fun getUserById(userId: String): User {
        println("Getting the user with id $userId")
        return user
    }
}

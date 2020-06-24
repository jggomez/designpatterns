package co.devhack.patterns.state

interface State {
    fun doAction(chain: Chain)
}

class LoginState : State {
    override fun doAction(chain: Chain) {
        println("User is in login state")
        // it can has a conditional to change state
        chain.state = RegisterState()
    }
}

class RegisterState : State {
    override fun doAction(chain: Chain) {
        println("User is in register state")
        chain.state = LogoutState()
    }
}

class LogoutState : State {
    override fun doAction(chain: Chain) {
        println("User is in logout state")
    }
}

data class Chain(var state: State? = LoginState()) {
    fun pull() {
        state?.doAction(this)
    }
}


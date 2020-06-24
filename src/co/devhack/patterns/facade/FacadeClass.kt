package co.devhack.patterns.facade

class ManagementQuestion {
    fun createQuestions() {
        println("Creating question")
    }
}

class ManagementAnswers {
    fun evaluateAnswer(answer: String): Boolean {
        println("Evaluating answer => $answer")
        return true
    }
}

class ManagementNextWordLearn {
    fun getNextWord(answer: String) {
        println("Next word")
    }
}

class ProcessLearn(
        private val managementQuestion: ManagementQuestion,
        private val managementAnswers: ManagementAnswers,
        private val managementNextWordLearn: ManagementNextWordLearn) {

    fun createQuestion() {
        managementQuestion.createQuestions()
    }

    fun processAnswer(answer: String) {
        if (managementAnswers.evaluateAnswer(answer)) {
            managementNextWordLearn.getNextWord(answer)
        }
    }
}
package co.devhack.patterns.facade

fun main(args: Array<String>) {

    val facade = facadeDI()
    facade.createQuestion()
    val resp = readLine() ?: ""
    facade.processAnswer(resp)
}

fun facadeDI() = ProcessLearn(
        ManagementQuestion(),
        ManagementAnswers(),
        ManagementNextWordLearn()
)
package co.devhack.patterns.state

fun main(args: Array<String>) {
    val context = Chain()

    context.pull()
    context.pull()
    context.pull()
}
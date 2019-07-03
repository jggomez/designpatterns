package co.devhack.patterns.singleton

object ConnectionDataBase {

    var connectionString = ""

    fun getSettingData(): String {
        println("Use connectionString")
        return "Setting Data"
    }

}
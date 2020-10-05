package co.devhack.patterns.singleton

fun main(args: Array<String>) {

    ConnectionDataBase.connectionString = "Connection String"
    val data = ConnectionDataBase.getSettingData()
    print(data)
}
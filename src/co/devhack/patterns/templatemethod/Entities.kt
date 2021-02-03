package co.devhack.patterns.templatemethod

data class User(val name: String, val address: String, val cellPhone: String)

data class Invoice(val items: List<InvoiceItem>, val totalValue: Double, val taxes: Double, val userName: String,
                   val userId: String)

data class InvoiceItem(val nomProduct: String, val value: Double)
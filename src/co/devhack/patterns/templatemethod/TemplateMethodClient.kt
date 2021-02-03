package co.devhack.patterns.templatemethod

fun main(args: Array<String>) {
    val userRepositoryImp = UserRepositoryImp()
    val invoiceRepositoryImp = InvoiceRepositoryImp()
    val userId = "1436780980"
    val items = listOf(
            InvoiceItem("Jean", 100.0),
            InvoiceItem("TV", 500.0),
            InvoiceItem("PC", 1000.0)
    )

    lateinit var calculateInvoiceClient: InvoiceProcessTemplate

    calculateInvoiceClient = CalculateInvoiceGoldClient(userRepositoryImp, invoiceRepositoryImp)
    calculateInvoiceClient.invoiceProcess(userId, items)

    calculateInvoiceClient = CalculateInvoiceSilverClient(userRepositoryImp, invoiceRepositoryImp)
    calculateInvoiceClient.invoiceProcess(userId, items)
}
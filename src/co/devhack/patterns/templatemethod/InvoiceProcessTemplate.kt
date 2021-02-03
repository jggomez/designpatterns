package co.devhack.patterns.templatemethod

abstract class InvoiceProcessTemplate(
        private val userRepositoryImp: UserRepositoryImp,
        private val invoiceRepositoryImp: InvoiceRepositoryImp
) {

    abstract fun calculateInvoice(items: List<InvoiceItem>): Double

    abstract fun calculateTaxes(totalValue: Double): Double

    fun invoiceProcess(userId: String, items: List<InvoiceItem>) {
        val user = userRepositoryImp.getUserById(userId)
        val total = calculateInvoice(items)
        val taxes = calculateTaxes(total)
        invoiceRepositoryImp.save(Invoice(
                items = items,
                totalValue = total,
                taxes = taxes,
                userName = user.name,
                userId = userId
        ))
    }
}
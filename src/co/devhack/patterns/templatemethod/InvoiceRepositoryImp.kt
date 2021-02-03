package co.devhack.patterns.templatemethod

class InvoiceRepositoryImp {
    fun save(invoice: Invoice) {
        println("Saving Invoice... ${invoice.totalValue}")
    }
}

package co.devhack.patterns.templatemethod

class CalculateInvoiceGoldClient(
        userRepositoryImp: UserRepositoryImp,
        invoiceRepositoryImp: InvoiceRepositoryImp
) : InvoiceProcessTemplate(userRepositoryImp, invoiceRepositoryImp) {

    companion object {
        const val TAX_PERCENTAGE_GOLD_CLIENT = 5
    }

    override fun calculateInvoice(items: List<InvoiceItem>) =
            items.map { item -> item.value }.reduce { acc, itemValue -> acc + itemValue }

    override fun calculateTaxes(totalValue: Double) = (totalValue * TAX_PERCENTAGE_GOLD_CLIENT) / 100
}

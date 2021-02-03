package co.devhack.patterns.templatemethod

class CalculateInvoiceSilverClient(
        userRepositoryImp: UserRepositoryImp,
        invoiceRepositoryImp: InvoiceRepositoryImp
) : InvoiceProcessTemplate(userRepositoryImp, invoiceRepositoryImp) {

    companion object {
        const val TAX_PERCENTAGE_SILVER_CLIENT = 10
        const val DISCOUNT_SILVER_CLIENT = 5
    }

    override fun calculateInvoice(items: List<InvoiceItem>): Double {
        val total = items.map { item -> item.value }.reduce { acc, itemValue -> acc + itemValue }
        val discountValue = (total * DISCOUNT_SILVER_CLIENT) / 100
        return total - discountValue
    }

    override fun calculateTaxes(totalValue: Double) = (totalValue * TAX_PERCENTAGE_SILVER_CLIENT) / 100
}

class Casher {
    fun calculateBill(products: List<Product>, offers: List<Offer>): PaymentBill{
        var bill: PaymentBill = PaymentBill(0.0)
        val amount = products.sumByDouble { it.productType.price.value }
        bill.addToAmount(amount)
        offers.forEach { it.applyOnProduct(products, bill) }
        return bill
    }
}
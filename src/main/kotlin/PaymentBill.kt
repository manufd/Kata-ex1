data class PaymentBill(var totalAmount: Double) {

    fun reduceByAmount(amount: Price): PaymentBill{
        totalAmount = totalAmount - amount.value;
        println("tolto: ${amount.value}")
        return this
    }

    fun addToAmount(amount: Double): PaymentBill{
        println("added: $amount")
        this.totalAmount = amount
        return this
    }
}
class Offer(val predicate: (List<Product>)-> Boolean, val action: (PaymentBill)-> PaymentBill) {

    fun applyOnProduct(products: List<Product>, bill: PaymentBill){
        if(predicate(products)) action(bill)

    }

}
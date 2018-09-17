fun main(args : Array<String>) {

    val products = mutableListOf(
            Product(productType = ProductType.B),
            Product(productType = ProductType.B),
            Product(productType = ProductType.B),
            Product(productType = ProductType.A),
            Product(productType = ProductType.A),
            Product(productType = ProductType.A),
            Product(productType = ProductType.A),
            Product(productType = ProductType.C),
            Product(productType = ProductType.C),
            Product(productType = ProductType.C),
            Product(productType = ProductType.C)

    )
    val offers = OffersFactory.createOffers()

    val casher = Casher()


    val calculatedBill = casher.calculateBill(products, offers)
    println(calculatedBill)

}
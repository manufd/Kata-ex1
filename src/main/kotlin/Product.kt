data class Product (var id: Int = 121, val productType: ProductType){
    init{
        allocateId += 1
        id = Product.Companion.allocateId
    }

    companion object {
        var allocateId: Int = 1
    }

}
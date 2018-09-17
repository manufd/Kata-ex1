package predicates

import Product
import ProductType

class PredicateB: Predicate<List<Product>> {
    override fun predicate(products: List<Product>): Boolean =
        (products.count { it.productType == ProductType.C } > 10)

}
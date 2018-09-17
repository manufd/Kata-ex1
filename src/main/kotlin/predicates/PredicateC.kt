package predicates

import Product
import ProductType

class PredicateC : Predicate<List<Product>> {

    override fun predicate(products: List<Product>)=
            (products.count { it.productType == ProductType.C } > 21)


}
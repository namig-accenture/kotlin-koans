// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product>{

    val allOrders = this.customers.flatMap { it.orders }

    val allProducts = allOrders.flatMap { it.products }.toSet()

    return allProducts.filter {product ->
        customers.fold(true){
            doHave, customer ->
            doHave && customer.orders.flatMap(Order::products).contains(product)
        }
    }.toSet()
}


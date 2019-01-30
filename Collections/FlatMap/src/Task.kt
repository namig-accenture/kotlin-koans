// Return all products this customer has ordered
fun Customer.getOrderedProducts(): Set<Product> =
        this.orders.flatMap(Order::products).toSet()

// Return all products that were ordered by at least one customer
fun Shop.getAllOrderedProducts(): Set<Product> =
        this.customers.flatMap(Customer::getOrderedProducts).toSet()

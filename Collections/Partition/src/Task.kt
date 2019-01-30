// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> =
    this.customers.partition {
        val deliverCount = it.orders.count(Order::isDelivered)
        val undeliverCount = it.orders.size - deliverCount
        return@partition undeliverCount > deliverCount
    }.first.toSet()

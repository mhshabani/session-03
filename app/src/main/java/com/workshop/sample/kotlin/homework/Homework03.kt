package com.workshop.sample.kotlin.homework

fun getCityThatMostCustomersAreFrom(shop: Shop): City? {
    val customerCountOfEachCity = mutableMapOf<City, Int>()
    shop.customers.forEach { customer ->
        var count = customerCountOfEachCity[customer.city]
        if (count == null) {
            count = 0
        }
        customerCountOfEachCity.set(customer.city, count + 1)
    }
    return customerCountOfEachCity.maxBy { it.value }?.key
}

fun getCustomerWithMaximumNumberOfOrders(shop: Shop): Customer? {
    var maxOrderCount = Int.MIN_VALUE
    var customerWithMaxOrder: Customer? = null
    shop.customers.forEach { customer ->
        if (customer.orders.size > maxOrderCount)
            customerWithMaxOrder = customer
        maxOrderCount = customer.orders.size
    }
    return customerWithMaxOrder
}

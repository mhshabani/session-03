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
    customerCountOfEachCity.maxBy { it.value }
    return null
}

fun getCustomerWithMaximumNumberOfOrders(): Customer? {
    //TODO
    return null
}

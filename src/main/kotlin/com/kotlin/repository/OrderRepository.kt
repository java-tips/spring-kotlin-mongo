package com.kotlin.repository

import com.kotlin.model.Order
import com.kotlin.model.StatusType
import org.springframework.data.mongodb.repository.MongoRepository

interface OrderRepository : MongoRepository<Order, String> {

    fun findByStatus( status: StatusType ): List<Order>

}
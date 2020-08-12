package com.kotlin.service

import com.kotlin.model.Order
import com.kotlin.model.StatusType
import com.kotlin.repository.OrderRepository
import org.springframework.stereotype.Service

@Service
class OrderService(private val orderRepository: OrderRepository) {

    fun findAll(): List<Order> = orderRepository.findAll()

    fun findByStatus(status: StatusType): List<Order> = orderRepository.findByStatus(status)

    fun save(order: Order): Order = orderRepository.save(order)

}
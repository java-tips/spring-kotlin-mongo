package com.kotlin.controller

import com.kotlin.model.Order
import com.kotlin.model.StatusType
import com.kotlin.service.OrderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("v1/order")
class OrderController (@Autowired private val service: OrderService) { // @Autowired it's not mandatory

    @GetMapping
    fun getAll(): ResponseEntity<List<Order>> {
        return ResponseEntity.ok(service.findAll())
    }

    @GetMapping("/{status}")
    fun findByStatus(@PathVariable("status") status: StatusType): ResponseEntity<List<Order>> {
        return ResponseEntity.ok(service.findByStatus(status))
    }

    @PostMapping
    fun save(@RequestBody order: Order): ResponseEntity<Order> {
        return ResponseEntity.ok(service.save(order))
    }

    @DeleteMapping
    fun delete(@RequestBody order: Order): ResponseEntity<Order> {
        return ResponseEntity.ok(service.save(order))
    }

}
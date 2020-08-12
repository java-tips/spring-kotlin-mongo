package com.kotlin.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping

@RestController
@RequestMapping(value = ["v1/"])
class InitController {

    @GetMapping("/ping")
    fun ping(): ResponseEntity<String> = ResponseEntity.ok("pong");

}
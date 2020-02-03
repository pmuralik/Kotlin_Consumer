package com.pramati.poc.consumer.worker

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ConsumerController {

    @GetMapping("/")
    fun index() = "This is Consumer Application"


}
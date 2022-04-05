package com.learnSpringFramework.demo.sample.enterprise.flow.web

import com.learnSpringFramework.demo.sample.enterprise.flow.business.BusinessService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

//Sending response in right format
@RestController
class Controller {

    @Autowired
    lateinit var businessService: BusinessService

    //"/sum" => 100
    @GetMapping("/sum")
    fun displaySum() = businessService.calculateSum()

    @GetMapping("/username/{name}")
    fun askQuestion(@PathVariable name: String):ResponseEntity<String> {
        return ResponseEntity.ok("Hey $name, do you like banana pudding?")
    }
}







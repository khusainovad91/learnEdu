package com.learnSpringFramework.demo.sample.enterprise.flow.data

import org.springframework.stereotype.Component

//Getting data
@Component
class DataService {
    fun list(): List<Int> = listOf(12,34,78,90,120)
}
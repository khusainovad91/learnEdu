
package com.learnSpringFramework.demo.sample.enterprise.flow.business

import com.learnSpringFramework.demo.sample.enterprise.flow.data.DataService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

//Business Logic
@Component
class BusinessService {

    @Autowired
    private lateinit var dataService: DataService

    fun calculateSum(): Int = dataService.list().sum()
}

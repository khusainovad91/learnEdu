package com.learnSpringFramework.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ConfigurableApplicationContext


@SpringBootApplication
class LearnSpringFrameworkApplication {

}

fun main() {
    val context: ConfigurableApplicationContext = runApplication<LearnSpringFrameworkApplication>() {

    }
    val runner: GameRunner = context.getBean(GameRunner::class.java)
    runner.runGame()
}

/*
fun main() {
    //val superContraGame = SuperContraGame()
    val game = MarioGame()
    val runner = GameRunner(game)
    runner.runGame()
}*/

package com.learnSpringFramework.demo

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
//@Primary
class SuperContraGame : GamingConsole {
    override fun up() {
        System.out.println("up")
    }
    override fun down() {
        System.out.println("down")
    }
    override fun left() {
        System.out.println("left")
    }
    override fun right() {
        System.out.println("right")
    }
}

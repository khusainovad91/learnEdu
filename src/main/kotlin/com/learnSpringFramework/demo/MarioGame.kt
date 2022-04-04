package com.learnSpringFramework.demo

import org.springframework.stereotype.Component

@Component
class MarioGame : GamingConsole {
    override fun up() {
        System.out.println("up")
    }
    override fun down() {
        System.out.println("jump in a hole")
    }
    override fun left() {
        System.out.println("stop")
    }
    override fun right() {
        System.out.println("go faster")
    }
}

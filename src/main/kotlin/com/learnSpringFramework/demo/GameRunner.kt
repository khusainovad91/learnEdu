package com.learnSpringFramework.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class GameRunner(/*@Autowired */private var game: GamingConsole) {

/*    @Autowired
    fun setGame(game: GamingConsole) {
        this.game = game
        println("Using setter for some reason")
    }*/

/*    init {
        println("GameRunner constructor call")
    }*/

    fun runGame(){
        game.up()
        game.down()
        game.left()
        game.right()
    }

/*    public fun GameRunner(game: MarioGame){
        this.game = game
    }*/

}

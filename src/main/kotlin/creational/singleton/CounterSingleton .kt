package creational.singleton

import java.util.concurrent.atomic.AtomicInteger

object Singleton {
    private val counter = AtomicInteger(0)
    fun increment() = counter.incrementAndGet()

    init {
        println("I was accessed for the first time - $this")
    }
}

fun main(){
    for (i in 1..10) {
        println("Singleton counter: ${Singleton.increment()} - ${Singleton.toString()}")
    }
}
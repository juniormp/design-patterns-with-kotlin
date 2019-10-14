package creational.factoryMethod

object AnimalFactory {
    fun createAnimal(animal: String): Animal {
        return when(animal.toLowerCase()) {
            "cat" -> Cat()
            "dog" -> Dog()
            else -> throw RuntimeException("Unknown animal $animal")
        }
    }
}

interface Animal

class Dog() : Animal
class Cat() : Animal

fun main(){
    val dog = AnimalFactory.createAnimal("dog")
    println(dog)
}
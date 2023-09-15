package com.sparkPlay

object scalaBootUp extends App{
  class Animal {
    val age:Int = 0
    def eat() = println("i m eating")
  }

  val anAnimal = new Animal
  anAnimal.eat()

  class Dog(val name: String) extends Animal

  val aDog = new Dog("Shadow")
  println(aDog.name)
  aDog.eat()

  trait Carnivore {
    def eat(animal: Animal) : Unit
  }

  class Crocodile extends Animal with Carnivore {
    override def eat (animal: Animal) = println("I am eating you!")
  }

  object mySingleton{
    val myValue = 5378
    def myMethod(): Int   = 5378
    def apply(x:Int): Int = x + 1
  }

   println(mySingleton.apply(100))

  object  Animal {
    val sampleVariable: Int = 1
  }

  abstract class myList[T]  {
    def head: T
    def tail: myList[T]
  }

  val aList: List[Int] = List(1, 2, 3)
  println(aList.head)

  class Person(name: String) {
    def apply(age:Int) = s"i am $age years old"
  }

  val bob = new Person("Bob")
  println(bob(5))

  val flatMappedList = List(1,2,3).flatMap(x => List(x, 2 * x))

  println(flatMappedList)
}

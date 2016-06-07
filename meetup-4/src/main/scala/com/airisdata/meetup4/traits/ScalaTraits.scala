package com.airisdata.meetup4.traits

// Example: Modelling friendship

// Parent Class
abstract class Human(val name: String) {
  def listen() = println("Your friend " + name + " is listening")
}

// Child Classes
class Man(override val name: String) extends Human(name)
class Woman(override val name: String) extends Human(name)


// How can we make a Dog a friend? We can’t inherit a Dog from a Human for that purpose.
// Solution: Create a trait
trait Friend {
  val name: String
  // Note: scala traits can have implementation unlike Java interfaces
  def listen() = println("Your friend " + name + " is listening")
}


// Redefine Human class - The class Human1 mixes in the Friend trait.
abstract class Human1(val name: String) extends Friend
// Child Classes now extend from Human1
class Man1(override val name: String) extends Human1(name)
class Woman1(override val name: String) extends Human1(name)


class Animal

class Dog(val name: String) extends Animal with Friend {
  // Dog can even override the method listen of Friend trait
  override def listen = println(name + "'s listening quietly")
}


object ScalaTraits extends App{

  val john = new Man1("John")
  val sara = new Woman1("Sara")
  val comet = new Dog("Comet")
  john.listen
  sara.listen
  comet.listen


}

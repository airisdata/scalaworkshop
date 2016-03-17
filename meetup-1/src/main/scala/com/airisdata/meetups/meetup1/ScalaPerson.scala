package com.airisdata.meetups.meetup1

class ScalaPerson(var firstName: String, var lastName: String,val age: Int) {

  override def toString(): String =
    s"firstName=$firstName, lastName=$lastName, age=$age"

}


object ScalaPerson extends App {

  val person = new ScalaPerson("John","Doe", 25)

  println(person)

  person.firstName = "Sam"
  person.lastName = "Daniel"

  println(person)

  //Will not compile because age is a val not a var
  //person.age = 20

}

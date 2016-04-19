package com.airisdata.meetups.meetup3.pm

object MatchingList extends App {


  // Function which matches List of String items
  def processItems(items: List[String]) {

    items match {

      // Match List containing exactly 2 elements - apple and ibm
      case List("apple", "ibm") => println("Apples andØ IBMs")

      // Match List containing exactly 3 elements - red,blue and white
      case List("red", "blue", "white") => println("Stars and Stripes...")

      // Match List containing any number of elements with first 2 elements at red and blue
      case List("red", "blue", _*) => println("colors red, blue, ... ")

      // Match List containing any number of elemens with first 2 elements as apple and orange and bind rest of
      // elements to other Fruits ( note @ symbol binds all rest of elements to other fruits
      case List("apple", "orange", otherFruits@_*) => println(s"apples, oranges, and $otherFruits")

      // Default case
      case unknownItems @ _ => println(s"Unknown items: $unknownItems")
    }

  }


  processItems(List("apple", "ibm"))
  processItems(List("red", "blue", "white"))
  processItems(List("red", "blue", "white", "black", "orange", "pink"))
  processItems(List("apple", "orange", "pineapple", "grapes", "banana", "strawberry"))
  processItems(List("something"))


}
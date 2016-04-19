package com.airisdata.meetups.meetup3.func

object NestedFunctions extends App {

  // Filter function which takes a list and a threshold values and filters out any elements above threshold
  def filter(xs: List[Int], threshold: Int) = {

    // Nested function which takes a list and check if empty returns
    def process(ys: List[Int]): List[Int] = {

      // pattern match on list
      ys match {

        // If list is empty then return the passed list
        case Nil => ys

        // Strip head and tail and check if head is less than threshold. If yes append it to the list
        case x :: xs if x < threshold => x :: process(xs) // Note we are calling nested function recursively

        // If x > threshold then just append the tail and leave out the head
        case x :: xs => process(xs) // Note we are calling nested function recursively
      }

    }

    process(xs)
  }

  println(filter(List(1, 9, 2, 8, 3, 7, 4), 5))


}

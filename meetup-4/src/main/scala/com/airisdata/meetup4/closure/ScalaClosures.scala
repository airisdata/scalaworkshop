package com.airisdata.meetup4.closure

object ScalaClosures extends App{


  // A simple function that take a number of times a loop needs to be execute
  // a given code block f which taken int and returns nothing
  def loopThrough(number: Int)(f: Int => Unit) = {

    for ( i <- 1 to number) {
      f(i)
    }

  }


  var result: Int = 0

  // Variable result is not defined within the block or its parameter list
  // So addIt function is called a closure - as it closes over the scope outside it own scope
  // result is called a "free variable"
  val addIt: (Int) => Unit  =  { value: Int => result = result + value }


  loopThrough(10)(addIt)

  println("Total of values from 1 to 10 is " + result)

  result = 0
  loopThrough(5) { addIt }
  println("Total of values from 1 to 5 is " + result)


}

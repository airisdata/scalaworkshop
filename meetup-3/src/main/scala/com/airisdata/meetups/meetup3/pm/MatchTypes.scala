package com.airisdata.meetups.meetup3.pm

object MatchTypes extends App {

  // Match with input which is of Any Type
  def process(input: Any) {

    input match {

      // Match with Tuple (Int,Int)
      case (a: Int, b: Int) => println(s"Processing Tuple (int, int)...($a,$b) ")

      // Match with Tuple (Double,Double)
      case (a: Double, b: Double) => println(s"Processing Tuple (double, double)...($a,$b) ")

      // Match with Int - with additional guard - note if guard if(msg > 100000)
      case msg: Int if (msg > 1000000) => println(s"Processing int > 1000000 ... $msg")

      // Match any Int
      case msg: Int => println(s"Processing int...$msg ")

      // Match any String
      case msg: String => println(s"Processing string... $msg")

      // Default case
      case _ => println(s"Can't handle $input... ")

    }
  }

  process((10,2))
  process((34.2, -159.3))
  process(1000001)
  process(0)
  process("Scala Meetups")
  process(2.2)

}

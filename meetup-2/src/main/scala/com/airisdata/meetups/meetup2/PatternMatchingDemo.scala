package com.airisdata.meetups.meetup2

object PatternMatchingDemo extends App{

  def matchTest(x: Any): Any = x match {
    case 1 =>  "one"
    case "two" => 2
    case y: Int => s"scala.Int - $y"
    case Some(str) => str  // pattern matching and binding
    case None => "None"
    case _ => "Not matched"  //catch all
  }


  println(matchTest(1))
  println(matchTest("two"))
  println(matchTest(2))
  println(matchTest(Some("someValue")))
  println(matchTest(None))
  println(matchTest("Some Random Value"))


}

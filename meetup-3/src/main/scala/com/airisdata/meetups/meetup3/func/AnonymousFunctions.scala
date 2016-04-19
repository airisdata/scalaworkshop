package com.airisdata.meetups.meetup3.func

object AnonymousFunctions extends App{


  // calculate function is oblivious to the fact what particular implementation of calculation is being used
  // e.g. higher abstraction
  def calculate(x: Int, y: Int, compute: (Int, Int) => Float): Unit = println(s"Computation Result ${compute(x, y)}")


  // Anonymous functions don't have any name.
  // We can define anonymous function with following syntax (Input Arguments => Output argument)

  // (x:Int,y:Int) => x+y means we are passing an anonymous function with x as Int, y as Int and the function is defined
  // by x + y

  calculate(11, 10, (x: Int, y: Int) => x + y)
  calculate(11, 10, (x: Int, y: Int) => x - y)
  calculate(11, 10, (x: Int, y: Int) => x * y)
  calculate(11, 10, (x: Int, y: Int) => x / y)

  //Example of multiline anonymous function
  calculate(11, 10, (x:Int , y:Int) => {
    println()
    println("Doing max of x or y")
    Math.max(x,y)
  })

}

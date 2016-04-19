package com.airisdata.meetups.meetup3.func

object PassingFunctionAsArgumentToAnotherFunction extends App {

  //Define a function named func1 which takes an Int as an argument and return an Int
  def func1: Int => Int = (x: Int) => x + 1


  // Calculator Functions can all be defined as function which takes two parameters of Type Int and returns Int
  def additionFunction(x: Int, y: Int): Float = x + y

  def subtractionFunction(x: Int, y: Int): Float = x - y

  def multiplicationFunction(x: Int, y: Int): Float = x * y

  def divisionFunction(x: Int, y: Int): Float = x / y



  // A generic function which takes x and y arguments

  //Note we Don't have to write add/subtract/multiply/division functions - we raised the level of abstraction
  // by passing function to a function and thus reduced code redundancy
  def calculate(x: Int, y: Int, compute: (Int, Int) => Float): Unit = println(s"Computation Result ${compute(x, y)}")


  calculate(11,10, additionFunction)
  calculate(11,10, subtractionFunction)
  calculate(11,10, multiplicationFunction)
  calculate(11,10, divisionFunction)


}

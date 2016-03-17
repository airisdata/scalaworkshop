package com.airisdata.meetups.meetup1

object ScalaLoopingExample extends App{

   private val intList: List[Int] = (1 to 10).toList
   private val addList: List[Int] = intList.map(x => x*2)

   println(intList)
   println(addList)

}

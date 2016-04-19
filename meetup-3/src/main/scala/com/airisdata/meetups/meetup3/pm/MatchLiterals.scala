package com.airisdata.meetups.meetup3.pm

object MatchLiterals extends App {

  // Function which takes a day name as String
  def activity(day: String): Unit = {

    // Pattern match on day String value
    day match {

      case "Sunday" => println("Eat, sleep, repeat... ")
      case "Saturday" => println("Hangout with friends... ")
      case "Monday" => println("...code for fun...")
      case "Tuesday" => println("...meetup day...")
      case _ => println("....not sure what day it is today...") // Default

    }

  }



  private val sundayActivity: Unit = activity("Sunday")
  private val saturdayActivity: Unit = activity("Saturday")

  // Default case
  private val mondayActivity: Unit = activity("Wednesday")


}

package com.airisdata.meetups.meetup3.pm

// Enumeration Type in scala similar to Enum in Java
object DayOfWeek extends Enumeration {

  val SUNDAY = Value("Sunday")
  val MONDAY = Value("Monday")
  val TUESDAY = Value("Tuesday")
  val WEDNESDAY = Value("Wednesday")
  val THURSDAY = Value("Thursday")
  val FRIDAY = Value("Friday")
  val SATURDAY = Value("Saturday")

}

object MatchingConstants extends App {

  // Function matches against enum type
  def activity(day: DayOfWeek.Value) {

    day match {

      // Match SUNDAY
      case d @ DayOfWeek.SUNDAY => println(s"Eat, sleep, repeat on $d")

      // Match SATURDAY
      case d @ DayOfWeek.SATURDAY => println(s"Hangout with friends on $d")

      // Default case
      case d @ _ => println(s"...learn scala...on $d")
    }
  }

  activity(DayOfWeek.SATURDAY)
  activity(DayOfWeek.SUNDAY)
  activity(DayOfWeek.TUESDAY)
}

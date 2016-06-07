package com.airisdata.meetup4.traits


object TraitsAsDecorators extends App{

  //You can use traits to decorate objects with capabilities.

  // Assume we want to run different checks on different kind of applications we receive

  // Assume for example - we can do 3 kinds of checks -
  // credit
  // criminal record
  // employment

  // But we might not be interested in running all the checks for all our application types
  // Some may require credit only , credit and criminal, credit and employment etc.
  // We have a classical permutation and combination problem - which is often solved by using
  // Decorator Design Pattern from GoF Design Patterns


  // Define an abstract class which check application details
  abstract class Check {
    def check(): String = "Checked Application Details..."
  }


  // Define traits
  trait CreditCheck extends Check {
    override def check(): String = "Checked Credit..." + super.check()
  }

  trait EmploymentCheck extends Check {
    override def check(): String = "Checked Employment..." + super.check()
  }

  trait CriminalRecordCheck extends Check {
    override def check(): String = "Check Criminal Records..." + super.check()
  }


  // Define various decorators
  val apartmentApplication = new Check with CreditCheck with CriminalRecordCheck
  println(apartmentApplication check)

  println()

  // Note Ordering of traits matter
  val apartmentApplicationReverse = new Check with CriminalRecordCheck with CreditCheck
  println(apartmentApplicationReverse check)

  println()

  val emplomentApplication = new Check with CriminalRecordCheck with EmploymentCheck
  println(emplomentApplication check)

}

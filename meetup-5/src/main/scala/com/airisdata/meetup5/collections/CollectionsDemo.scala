package com.airisdata.meetup5.collections

/**
  * Created by rajiv on 10/27/16.
  */
object CollectionsDemo extends App {


  val l1:List[Int] = List(1,2,3)
  println(l1)

  val s1:Set[Int] = Set(1,2,3,3)
  println(s1)

  val m1: Map[Int, String] = Map(1 -> "one", 2 -> "two", 3 -> "three")
  println(m1)


  // Mystery about -> operator

  val t1: (Int, String) = 1 -> "one"
  println(t1)
  val t2: ((Int, String), String) = 1 -> "one" -> "something"
  println(t2)




  // Mapping over values in a collection
  // When mapping should be used - n element collection will result in n element collection

  val l2: List[Int] = l1 map (x => x+1)
  val s2: Set[Int] = s1 map (x => x+1)
  val m2: Map[Int, Int] = m1 map { case (k:Int,v:String) => (k, v.length) }

  println(l2)
  println(s2)
  println(m2)


  // FlatMapping over values in a collection
  // When flat map should be used - n elements in collection will result in more than n elements in output

  val names: List[String] = List("John", "Doe")

  // First attempt lets try using map
  val chars: List[List[Char]] = names map(name => name.toCharArray.toList)
  println(chars)

  val charList: List[Char] = names flatMap( name => name.toCharArray.toList)
  println(charList)


  // Folding of values
  // When folding should be used - when n elements in collection will result in only 1 element
  val sum: Int = l1.foldLeft(0)((acc:Int, y:Int) => acc+y)
  println(sum)

  val product: Int = l1.foldLeft(1)((acc:Int, y:Int) => acc*y)
  println(product)

  // Folding is a general concept which in which return type is not constrained to collection element type
  val concat: String =
    l1.foldLeft[String]("")((acc:String, y:Int) => acc+y.toString)
  println(concat)




}

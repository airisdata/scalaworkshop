package com.airisdata.meetups.meetup3.pm

// Sealed trait - sealed keyword ensures all implementations of Trade trait are confined to Trade file only
sealed trait Trade

// Sell case class which extends Trade trait
case class Sell(stockSymbol: String, quantity: Int) extends Trade

// Buy case class which extends Trade trait
case class Buy(stockSymbol: String, quantity: Int) extends Trade

// Hedge case class which extends Trade trait
case class Hedge(stockSymbol: String, quantity: Int) extends Trade


object TradeRequestProcessor extends App {


  // A generic function to process any trade
  def processTrade(trade: Trade) {

    // do pattern matching on trade
    trade match {

      // Sell Trade with stock symbol and quantity exactly 1000 units - deep pattern matching on Type parameters e.g. quantity
      // note variable stk binding by pattern matching
      case Sell(stk, 1000) => println(s"Selling 1000-units of $stk")

      // Sell Trade with any stock and quantity
      case Sell(stk, qty) => println(s"Selling $qty units of $stk")

      // Buy with any stock and but quantity must be greater than 2000
      case Buy(stk, qty) if (qty > 2000) => println(s"Buying > $qty (>2000) units of $stk")

      // Buy with any stock and quantity
      case Buy(stk, qty) => println(s"Buying $qty units(<=2000) of $stk")

      // Hedge with any stock and quantity
      case Hedge(stk, qty) => println(s"Hedging $qty of $stk")


    }
  }


  processTrade(Sell("IBM",1000))
  processTrade(Sell("IBM",10000))
  processTrade(Buy("IBM",2001))
  processTrade(Buy("IBM",2000))
  processTrade(Hedge("IBM", 2000))
}
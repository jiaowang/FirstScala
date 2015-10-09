package com.example.scala

/**
 * Created by ysy on 15/10/2.
 */
object UseMatch {

  def month( i : Int ): String = i match {
    case 1 => "January"
    case 2 => "February"
    case 3 => "March"
    case 4 => "April"
    case 5 => "May"
    case 6 => "June"
    case 7 => "July"
    case 8 => "August"
    case 9 => "September"
    case 10 => "October"
    case 11 => "November"
    case 12 => "December"
    case _ => "Invalid month" // the default, catch-all
  }

  val hp20b = Calculator("hp", "20b")

  val hp20B = Calculator("hp", "20b")

  val hp30b = Calculator("hp", "30B")

  def calcType(calc: Calculator) = calc match {
    case Calculator("hp", "20B") => "financial"
    case Calculator("hp", "48G") => "scientific"
    case Calculator("hp", "30B") => "business"
    case Calculator(ourBrand, ourModel) => "Calculator: %s %s is of unknown type".format(ourBrand, ourModel)
    //case _ => "Calculator of unknown type"
  }

  def main(args: Array[String]) {

    println(hp20b == hp20B)

    println(calcType(hp20b))
    println(calcType(hp30b))

    println(month(5))
  }
}

/**
 * 样本类 case class
 * @param brand
 * @param model
 */
case class Calculator(brand: String, model: String)


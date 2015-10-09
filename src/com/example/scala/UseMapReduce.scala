package com.example.scala

/**
 * Created by ysy on 15/10/8.
 */
object UseMapReduce {

  val file = List("warn 2013 msg", "warn 2012 msg",
    "error 2013 msg", "warn 2013 msg")


  def wordCount(str : String): Int ={
    str.split(" ").count("msg" == _)
  }

  def main(args: Array[String]) {

    val num = file.map(wordCount).reduceLeft(_ + _)

    println(num)

  }
}

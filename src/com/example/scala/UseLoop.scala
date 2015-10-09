package com.example.scala

/**
 * Created by ysy on 15/10/2.
 */
object UseLoop {

  def yieldloop(): Unit ={
    //Basic for loop examples
    val rt = for (i <- 1 to 5 ) yield i
    println(rt) // it's vector
    //scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 3, 4, 5)
    for (i <- 1 to 5 ) yield i * 2
    for (i <- 1 to 5 ) yield i % 2

    //for loop yield examples over a Scala Array
    val a = Array(1,2,3,4,5)

    val rt1 = for ( e <- a ) yield e
    println(rt1) // It's Array

    //for loop,yield ,and guards (for loop if conditions)
    for (e <- a if e > 2) yield e
  }

  val filesHere = Array("a.scala","b.scala")
  def scalaFiles =
    for {
      file <- filesHere
      if file.endsWith(".scala")
    } yield file

  def main(args: Array[String]) {

    yieldloop()

    scalaFiles.foreach( println )

    // The scala ternary operator syntax
    val i = 1
    val x = "OK"
    val y = "NG"
    val a = if (i == 1) x else y
    println(a)
  }
}

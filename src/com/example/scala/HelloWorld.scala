package com.example.scala

/**
 * Created by ysy on 15/9/30.
 */
object HelloWorld {

  def main(args: Array[String]) {
    println("hello world")
    test_for()
  }

  def test_for(){

    val list = ( 1 to 5)
    for( i <- list){
      print(i)
    }
  }
}

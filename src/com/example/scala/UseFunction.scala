package com.example.scala

/**
 *
 * Created by ysy on 15/10/2.
 * 函数是一等公民
 * 可以使用def来定义一个函数。函数体是一个表达式。
 *
 * 使用Block表达式的时候，默认最后一行的返回是返回值，无需显式指定。
 *
 * 函数还可以像值一样，赋值给var或val。因此函数也可以作为参数传给另一个函数。
 *
 *
 */

object UseFunction{

  def square(a: Int) = a * a

  def squareWithBlock(a: Int) = {
    a * a
  }

  val squareVal = (a: Int) => a * a // 匿名函数

  def addOne(f: Int => Int, arg: Int) = f(arg) + 1 // 函数作为参数传递

  val AnonymousFuncWithBlock = { //匿名函数Block
    x : Int =>
      println("i am Anonymous function" + ( x * x ) )
      x * x
  }

  def adder(m: Int, n: Int) = m + n

  // 你可以使用下划线“_”部分应用一个函数，结果将得到另一个函数。Scala使用下划线表示不同上下文中的不同事物，
  // 你通常可以把它看作是一个没有命名的神奇通配符。在{ _ + 2 }的上下文中，它代表一个匿名参数。你可以这样使用它：
  val add2 = adder(2, _:Int)// 部分应用函数


  def withClose( closeAble : { def close(): Unit } ,
                op: { def close(): Unit } => Unit ) = {
    try {
      op(closeAble)
    }
    finally closeAble.close()
  }

  def main(args: Array[String]) {
    println("square(2):" + square(2))
    println("squareWithBlock(2):" + squareWithBlock(2))
    println("squareVal(2):" + squareVal(2))
    println("addOne(squareVal,2):" + addOne(squareVal, 2)) // 函数可以作为参数传递
    println("addOne(AnonymousFuncWithBlock,2):" + addOne(AnonymousFuncWithBlock, 2)) // 函数可以作为参数传递

    println("adder(2,_:Int)" + add2(3)) // 部分应用（Partial application）

    val conn : Connection = new Connection()
    val cnt  : Connect    = new Connect()
    withClose( conn ,conn =>
        println("do something with Connection"))
  }

}

class Connection{
  def close() = println("close Connection")
}

class Connect{
  def close() = println("new close Connect")
}
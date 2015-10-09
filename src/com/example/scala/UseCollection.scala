/**
 * Created by ysy on 15/10/2.
 */

object UseCollection {

  def testList(): Unit ={
    val number = List(1,2,3,4)

    number.exists((i:Int) => i % 2 == 0)

    number.foreach( println ) // Iterating list with foreach

    var sum = 0
    number.foreach(sum += _)

    println(sum)

    for (num <- number) println( num ) //Scala Lists and the for comprehension

    for (num <- number if num > 2 ) println(num) // if clause to the for comprehension to print
  }

  def testMap(): Unit ={
    val number = Map("one"->1,"two"->2)
    println("Map:one is "+ number.get("one"))
    println("Map Option :three is "+ number.get("three") + " or " + number.get("tree").getOrElse(0))

  }

  def main(args: Array[String]) {

    testList()

    testMap()
  }

}
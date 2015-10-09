package com.example.scala

/**
 * Created by ysy on 15/9/30.
 */

class Person

trait TTeacher extends Person{
  def teach
}

trait TPianoPlayer extends Person {
  def playPiano = println("I’m playing piano.")
}

class PianoplayingTeacher extends Person with TPianoPlayer with TTeacher {
  def teach = { println("I’m teaching students.")}
}

class FancyGreeter(greeting : String){
  def greet = println(greeting)
}

object UseTrait{
  def main(args: Array[String]) {
    val t = new PianoplayingTeacher

    t.teach

    t.playPiano

    val c = new FancyGreeter("solution world")

    c.greet

    val o = OtherObject

    o.main(Array())
  }
}

object OtherObject{
  def main(args: Array[String]) {
    println("other object")
  }
}
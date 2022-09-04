package com.jain.hello

class Rectangle(val a:Double, val b:Double): shape("Rectangle")
{
    init {
        println("The $name length $a and breadth $b")
        println("The area of $name is ${area()}")
        println("The perimeter of $name is ${perimeter()}")
        println("Is $name a Square ${isSquare()}")
    }

    fun area() = a*b
    fun perimeter() = 2*(a+b)
    fun isSquare() = a==b
}
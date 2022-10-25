package com.jain.hello

class Circle(val radius:Double): shape("Circle")
{

    init{
        println("$name created with radius $radius")
        println("The area of $name is ${area()}")
        println("The perimeter of $name is ${perimeter()}")
        println("The diameter of $name is ${diameter()}")
    }
    fun area()=impnumber.PI*radius*radius
    fun perimeter()=2*impnumber.PI*radius
    fun diameter()=2*radius

}
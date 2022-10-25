package com.jain.hello

import kotlin.math.sqrt

class Triangle(val a:Double, val b:Double, val c:Double):shape("Triangle")
{
    init {
        println("The $name created using sides a = $a b = $b c = $c")
        println("The area of $name is ${area()}")
        println("The perimeter of $name is ${perimeter()}")
    }
    fun area():Double
    {
        var s=(a+b+c)/2
        return sqrt(s*(s-a)*(s-b)*(s-c))
    }
    fun perimeter() = a+b+c

}
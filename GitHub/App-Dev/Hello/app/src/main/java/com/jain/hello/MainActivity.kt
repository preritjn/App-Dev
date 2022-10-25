package com.jain.hello

import android.app.appsearch.AppSearchManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count=0
        findViewById<Button>(R.id.button).setOnClickListener {
            count++
            val tvcount=findViewById<TextView>(R.id.tvCount)
            tvcount.text="button pressed $count times"
        }
    }
}

//fun main()
//{
////    val a = "Hello World"
////    println(a)
////    println(a.toUpperCase())
////    println(a.toUpperCase().toLowerCase())
////    var sum = 5
////    sum+=5
////    println("The sum is : $sum")
////
////    print("Enter a string : ")
////    var input= readLine()
////    println(input?.toUpperCase())
////
////    var inp = readLine()
////    if(inp!=null)
////        println(inp.toInt()-15)
////
////    var c =1
////    var b=5
////    c += b
////    b = c-b
////    c -= b
////    println("$c,$b")
////    var c1=5.5  // c1 is a double data type
////    println(c1)
////
////    var array=arrayOf(1,"Hello",true,"World")
////    for(i in array)
////        println(i)
////    println(array)
////
////    for(i in 10 downTo 0 step 2)
////        println(i)
////    var list= mutableListOf<Int>()
////    for(i in 1..10)
////    {
////        val x= readLine()?.toInt()
////        if(x!= null)
////            list.add(x)
////    }
////    println(list)
//    //    val age= readLine()?.toInt()
////
////    when(age)
////    {
////        in 0..12 -> println("You are young")
////        in 13..17 -> println("You are a teenager")
////        18 -> println("Finally you are 18")
////        19,20 ->println("You are a young adult")
////        in 20..65 -> println("You are an adult")
////        else -> println("You are really old")
////    }
//
////    val list= mutableListOf(0,1)
////    var n= readLine()?.toInt()
////    var c:Int
////    if(n!=null)
////        for (i in 2..(n-1))
////        {
////            c = list[i - 2] + list[i - 1]
////            list.add(c)
////        }
////    println(list)
////    var pow = pPow(x = 3,y = 5)
////    println("3 to the power 5 is $pow")
////    pow =pPow(x = 4,y = 5)
////    println("4 to the power 5 is $pow")
////    pow = pPow(x = 5,y = 5)
////    println("5 to the power 5 is $pow")
////    pow = pPow(x = 6,y = 5)
////    println("6 to the power 5 is $pow")
////    pow = pPow(x = 7,y = 5)
////    println("7 to the power 5 is $pow")
////    val list= mutableListOf<Int>()
////    var x= readLine()?.toInt()
////    if(x!=null)
////    for(i in 1..x)
////    {
////        var a= readLine()?.toInt()
////        if(a!=null)
////        list.add(a)
////    }
////    println(list)
////
////    var f= readLine()?.toInt()
////    if(f!=null && x!= null)
////        for(i in 1..x)
////        {
////            if(f==list[i-1])
////                println("the index is ${i-1}")
////        }
//    val array = intArrayOf(45,100,54)
//    var max= getMax(5,45,52,45,*array,98,2,35,21)
//    println("The maximum number is $max")
//
//    search(search ="How to become a best programmer")
//    search(search = "How to improve kotlin" , searchEngine = "Bing")
//    search(searchEngine = "Bing", search = "How to improve kotlin")
//
//}
//
////fun pPow(x: Int,y: Int):Int
////{
////    var result=1
////    for(i in 1..y)
////        result *= x
////    return result
////}
//fun getMax(vararg num:Int) :Int
//{
//    var max=num[0]
//    for(number in num)
//        if(number>max)
//            max=number
//    return max
//}
//
//fun search(search: String, searchEngine: String="Google")
//{
//    println("Searching for '$search' on $searchEngine")
//}

//fun main()
//{
//    val list= mutableListOf<Int>()
//    print("Enter the size of list : ")
//    var x= readLine()?.toInt()
//    if(x!=null)
//        for(i in 0 until x)
//        {
//            var a = readLine()?.toInt()
//            if (a != null)
//                list.add(a)
//        }
//    var sum = add(list)
//    println(sum)
//}
//
//fun add(list:List<Int>): Int
//{
//    var sum =0
//    for(i in 0 until list.size)
//    {
//        if(i%2==0)
//        {
//            sum += list[i]
////            println("if ${list[i]}")
//        }
//        else
//        {
//            sum -= list[i]
////            println("else ${list[i]}")
//        }
//    }
//    return sum
//}

//fun main()
//{
//    var input= readLine()?.toInt()
//    if(input!=null)
//    if(input.isPrime())
//        println("The entered number is Prime")
//    else
//        println("The entered number is Not Prime")
//}
//
//fun Int.isPrime():Boolean
//{
//    for(i in 2 until this-1)
//    {
//        if(this % i ==0)
//            return false
//    }
//    return true
//}

fun main()
{
    val myRect = Rectangle(4.0,7.0)
//    println("The area of rectangle is ${myRect.area()}")
//    println("The perimeter of rectangle is ${myRect.perimeter()}")
//    println("Is rectangle a Square ${myRect.isSquare()}")
    val myCircle1= Circle(0.318181)
    val myCircle2= Circle(50.0)
//    println("The area of circle is ${myCircle.area()}")
//    println("The perimeter of circle is ${myCircle.perimeter()}")
//    println("The diameter of circle is ${myCircle.diameter()}")
    val myTri = Triangle(4.0,5.0,6.0)
    val product2= product()
}
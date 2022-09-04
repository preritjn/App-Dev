package com.jain.hello

class product
{
    init
    {
        val list= mutableListOf<Int>()
        val x= readLine()?.toInt()
        if(x!=null)
            for(i in 1..x)
            {
                val a= readLine()?.toInt()
                if(a!=null)
                    list.add(a)
            }
        println("The product of the elements is ${product1(list)}")
    }
    fun product1(list:List<Int>):Int
    {
        var prdct =1
        for(i in 1..list.size)
            prdct*=list[i]
        return prdct
    }

}
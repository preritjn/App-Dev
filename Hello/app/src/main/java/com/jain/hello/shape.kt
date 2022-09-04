package com.jain.hello

open class shape(var name: String)
{
    init {
        println("I am a super class!")
    }
    fun changeName(newName: String)
    {
        name=newName
    }
}
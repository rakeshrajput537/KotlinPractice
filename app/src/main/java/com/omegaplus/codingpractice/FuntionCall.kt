package com.omegaplus.codingpractice

import java.util.*
import kotlin.collections.ArrayList

fun datatypeFun() {
    val myInt = 36
    val myLong = Long.MAX_VALUE
    var byteValue = Byte.MIN_VALUE
    var byteMax = Byte.MAX_VALUE
    var floatType = 10F
    var doubleType = Double.MAX_VALUE
    var characterValue = 'c'

    println("Int is $myInt, Long Value $myLong, ByteValue $byteValue byteMax $byteMax floatType $floatType doubleValue $doubleType characterType $characterValue")
}

fun arithmeticOperatorFun() {
    println(4.plus(6))
    println(4 + 6)
    println(4.minus(6))
    println(4 - 6)
    println(4.times(6))
    println(4 * 6)
    println(4.div(6))
    println(4 / 6)
    println(4.rem(10))
    println(4 % 10)
}

fun unaryOperator(){
    var intVal = 25
    var intVal1 = 31
    intVal.inc() // still 25
    intVal = intVal.inc() // 26
    intVal1-- // 30
    println("intVal $intVal intVal1 $intVal1")
}

fun userInputFun(){
    println("Please enter your name")
    val stringInput  = readLine()
//    val age: Int = readLine()  // readline only support string input
    println("Your name is $stringInput")

    val sc: Scanner = Scanner(System.`in`)

    // Int
    println("Enter Int type of data")
    val intInput: Int = sc.nextInt()
    println(intInput)

    // Float
    println("Enter float value")
    val floatInput: Float = sc.nextFloat()
    println(floatInput)

    // Boolean
    println("Enter Boolean value")
    val booleanInput = sc.nextBoolean()
    println(booleanInput)

    // Or we can take input as a string and then we can convert into int, float, double
    val ss = readLine()!!
    val intValue = ss.toInt() // ss.toFloat(), ss.toDouble()
    println(intValue)

}

// Type conversation -> Java support only small to large but in kotlin both supported
fun typeConversationFun(){
    val intV = 39
    val doubleV: Double = 12.0

    val intToDouble = intV.toDouble()
    val doubleToInt = doubleV.toInt()

    println("Int to double $intToDouble, doubleToInt $doubleToInt")

    // No helper function available to convert into the Boolean

    // Other Example
    println("259 to byte: " + (259.toByte()))
    println("50000 to short: " + (50000.toShort()))
    println("21474847499 to Int: " + (21474847499.toInt()))
    println("10L to Int: " + (10L.toInt()))
    println("22.54 to Int: " + (22.54.toInt()))
    println("22 to float: " + (22.toFloat()))
    println("65 to char: " + (65.toChar()))
    println("A to Int: " + ('A'.toInt()))
}

fun forLoopFun(){
    // we can use these multiple options ->  Range, Array, String, Collection
    for (i in 1..10){
        println(i)
    }
    println("------------")

    // Using step
    for (i in 1..50 step 3){
        println(i)
    }
    println("------------")

    // This will not print anything for... we need to use downTo
    for (i in 5..1){
        println(i)
    }
    println("------------")

    // using downTo
    for (i in 10 downTo 1){
        println(i)
    }

    println("------------")
    // Using step on downTo
    for (i in 10 downTo 1 step 2){
        println(i)
    }
    println("------------")

    var stringArray = arrayOf("Rakesh", "Saki", "SakiRaka", "Sakira")
    for (item in stringArray){
        println(item)
    }
    println("------------")

    // Traverse array using indices
    for (i in stringArray.indices){
        println("${stringArray[i]} At $i" )
    }

    println("------------")


    // using with withIndex
    for ((index, value) in stringArray.withIndex()){
        println("Index is $index and Value is $value")
    }

    println("------------")


    // in the listOf() fun we can pass the different  data
    // read only, fix-size
    var collection = listOf(1,2,3,4, "Raka", "Saki", "Sakira")
    for (item in collection){
        println(item)
    }

}
package com.example.kotlindersleri.object_oriented_programming

fun main() {
    val result = 5.multiply(2)
    println( 7 multiply 2)
    println(result)
}

infix fun Int.multiply(number:Int):Int{ // (infix) olursa 5 carp 2 yazabiliyorsun
    return this * number //this(Int)
}
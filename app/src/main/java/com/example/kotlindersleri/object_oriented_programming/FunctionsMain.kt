package com.example.kotlindersleri.object_oriented_programming

fun main() {
    val f = Functions()

    //void = Unit
    f.greeting()

    //return
    val result = f.greeting2()
    println("Gelen sonuc : $result")

    //parametre
    f.greeting3("Hande")

    f.sum(10,20,"Beyza")
}
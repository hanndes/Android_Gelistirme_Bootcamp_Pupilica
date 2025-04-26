package com.example.kotlindersleri.object_oriented_programming

import kotlinx.coroutines.yield

fun main() {
    //Nesne olusturma
    val f1 = Foods(100,"Meatball",249)

   f1.getInfo()

    //Deger atama / degistirme
    f1.price = 350

    println("Id : ${f1.id}")
    println("Ad : ${f1.name}")
    println("Fiyat : ${f1.price}")
    println("------------------")

    val f2 = Foods(200,"Baklava",300)

    f2.getInfo()
    f2.name = "Cold Baklava"
    f2.getInfo()

}
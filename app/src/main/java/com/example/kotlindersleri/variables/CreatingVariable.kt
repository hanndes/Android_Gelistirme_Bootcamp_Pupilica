package com.example.kotlindersleri.variables

fun main(){
    var id = 1
    var name = "Mont"
    var image = "mont.png"
    var rate = 4.7
    var price = 4500
    var stockState = true

    println("id: $id")
    println("name: $name")
    println("image: $image")
    println("rate: $rate")
    println("price: $price")
    println("stockState: $stockState")

    //Sabitler - Constant
    var sayi = 30
    sayi = 100
    println(sayi)

    val numara = 50 //constant tanımlayınca daha performanslı
  //  numara = 80
    println(numara)

    val d = 89.56
    val i = 34
    val sonuc2 = i.toDouble()
    val sonuc1 = d.toInt()
    println(sonuc1)
    println(sonuc2)

    var x = 85
    val sonuc3 = x.toString()
    println(sonuc3)

    val yazi = "48"
    val sonuc4 = yazi.toIntOrNull()

    if (sonuc4 != null){
        println(sonuc4)
    }else{
        println("Sonuc nulldur!")
    }
}
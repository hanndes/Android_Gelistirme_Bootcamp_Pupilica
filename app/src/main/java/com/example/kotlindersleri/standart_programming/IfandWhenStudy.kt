package com.example.kotlindersleri.standart_programming

fun main() {
    val age = 17

    println(age >= 18)

    if(age >= 18){
        println("Resitsiniz")
    }else{
        println("Resit degilsiniz")
    }

    val ka = "admin"
    val s = 123456
    val number = 8

    if(ka == "admin" && s ==123456){ // && = And(Ve), true && true ise true olur, diger durumlarda hep false olur.
        println("Hosgeldiniz...")
    }else{
        println("Hatali giris")
    }

    if (number == 9){ // || = Or(Veya) false || false ise false olur, diger durumlarda true olur.
        println("Sayi 9 veya 10'dur.")
    }else{
        println("Sayi 9 veya 10 degildir.")
    }
    val sayi = 1

    when(sayi){
        1 -> println("Sayi 1'dir")
        2 -> println("Sayi 2'dir")
        else -> println("Tanımlanmayan sayı")
    }
}
package com.example.kotlindersleri.standart_programming

fun main() {
    for (i in 1..3){ //Swift 1...3
        println("Loop : $i")
    }

    println()

    // 10 ile 20 arasinda 5 er artsın
    for (i in 10..20 step 5){ // step'e infix fonksiyon deniyor.
        println("Loop 2 : $i")
    }

    println()

    for (i in 20 downTo 10 step 5){ // step'e infix fonksiyon deniyor.
        println("Loop 3 : $i")
    }

    println()

    var sayac = 1

    while (sayac < 4){
        println("Loop 4 : $sayac")
        sayac++
    }

    println()

    //1,2,3,4,5
    for (i in 1..5){ // step'e infix fonksiyon deniyor.
        if (i ==3)
            break
        println("Loop 5 : $i")
    }

    println()

    //1,2,3,4,5
    for (i in 1..5){ // step'e infix fonksiyon deniyor.
        if (i ==3)
            continue
        println("Loop 6 : $i")
    }


}
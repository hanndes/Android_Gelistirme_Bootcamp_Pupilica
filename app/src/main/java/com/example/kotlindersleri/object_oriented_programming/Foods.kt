package com.example.kotlindersleri.object_oriented_programming

data class Foods(var id:Int,var name:String,var price:Int){
    //Constructor(Java / .NET) - init(Swift) methodu
    //Bu siniftan nesne olustugunda calissin.
    init{
        println("*** Object created ***")
    }
    fun getInfo(){
        println("Id : ${id}")
        println("Ad : ${name}")
        println("Fiyat : ${price}")
        println("------------------")
    }

    // this : Bulundugu sinifi temsil eder. Swift dilinde self
    // super : Kalitim ile bir ust sinifi temsil eder.

}
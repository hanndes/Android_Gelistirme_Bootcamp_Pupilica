package com.example.kotlindersleri.object_oriented_programming

class Functions {

    //void - sadece islem yapan
    fun greeting(){ //Swift -> func
        val sonuc = "Hello Ahmet"
        println(sonuc)
    }

    //return - hem islem yapan hem veri transferi yapan
    fun greeting2() : String{ //Swift -> func
        val sonuc = "Hello Ahmet"
        return sonuc
    }

    fun greeting3(isim:String){ //Swift -> func
        val sonuc = "Hello $isim"
        println(sonuc)
    }

    //Overloading
    //Bir sinif icerisinde ayni isimde fonksiyonlari tekrar kullanmak.
    fun sum(sayi1:Int,sayi2: Int){
        println("Toplama : ${sayi1+sayi2}")
    }

    fun sum(sayi1:Int,sayi2: Int,isim: String){
        println("Toplama : ${sayi1+sayi2} - İslem Yapan : $isim")
    }

    fun sum(sayi1:Double,sayi2: Double){
        println("Toplama : ${sayi1+sayi2}")
    }

}
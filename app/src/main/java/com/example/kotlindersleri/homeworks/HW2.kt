package com.example.kotlindersleri.homeworks

fun main() {
    println("Dereceyi Fahrenheit'a çeviren sonuç: ${calcFahrenhiet(30.0)}")
    println("Dikdörtgen çevresi: ${calcCircumference(5, 10)}")
    println("5'in faktöriyeli: ${calcFactorial(5)}")
    println("'Ankara' kelimesinde kaç tane 'a' harfi var: ${calcA("Ankara")}")
    println("6 kenarlı şeklin iç açılar toplamı: ${calcInteriorAngles(6)}")
    println("20 günde çalışılan maaş: ${calcSalary(20)}")
    println("70 GB kota kullanımı için ücret: ${calcCost(70)}")
}

//Parametre olarak girilen dereceyi Fahrenheit’a dönüştürdükten sonra geri döndüren bir metot yazınız.
fun calcFahrenhiet(degree:Double):Double{
    return ((degree * 1.8) + 32)
}

//Kenarları parametre olarak girilen bir dikdörtgenin çevresini hesaplayan bir metot yazınız.
fun calcCircumference(edge1:Int,edge2:Int):Int{
    return ((edge1 + edge2)*2)
}

//Parametre olarak girilen sayının faktöriyel değerini hesaplayıp geri döndüren bir metot yazınız.
fun calcFactorial(number:Int):Int{
    var result =1
    for (i in 1..number) {
        result *= i
    }
    return result
}

//Parametre olarak girilen kelime içinde kaç adet a harfi olduğunu gösteren bir metot yazınız.
fun calcA(word:String):Int{
    var word2 = word.lowercase()
    var counter=0
    for (i in 0..word2.length-1){
        if(word2[i].equals('a'))
            counter++
    }
    return counter

    //return word.lowercase().count { it == 'a' }

}

//Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri gönderen bir metot yazınız.
fun calcInteriorAngles(numOfEdges:Int):Int{
    return ((numOfEdges-2) * 180)
}

//Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren bir metot yazınız.
fun calcSalary(days:Int):Int{
    var hours = days * 8
    if(hours<=160)
        return hours * 10
    else
        return ((160 * 10) + ((hours - 160) * 20))
}

//Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren bir metot yazınız.
fun calcCost(quota:Int):Int{
    return if (quota <= 50){
        100
    }
    else{
        100 + ((quota-50)*4)}
}
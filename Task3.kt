package com.drow.kotlin_3

// Пользователь вводит сторону квадрата. Найдите периметр и площадь квадрата.

fun userSquare(){
    var a = readLine();
    if (a != null){
        var perimetr = a.toInt()*4
        var square = a.toInt()*a.toInt()
        println("Perimetr = $perimetr")
        println("Square = $square")
    } else{
        println("error")
    }
}

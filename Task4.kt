package com.drow.kotlin_3

// Известно, что x кг конфет стоит a рублей.
// Определите, сколько стоит y кг этих конфет, а также сколько кг конфет можно купить на k рублей.
// Все значения вводит пользователь.

fun candies(){
    println("Enter price of 1 kg: ")
    var price = readLine()

    println("How much candies you need: ")
    var amout = readLine()

    var  result = (price?.toInt() ?: 0) * (amout?.toInt() ?: 0)
    println("You can bue $result candies")

    println("How much money you have? ")
    var money = readLine()

    result = (money?.toInt() ?: 0) / price?.toInt()!!
    println("You can bue $result candies")

}
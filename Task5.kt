package com.drow.kotlin_3

// Пользователь вводит количество недель, месяцев, лет и получает количество дней за это время.
// Считать, что в месяце 30 дней.

fun dayz(){
    println("Enter years:")
    var year = readLine()
    println("Enter month:")
    var month = readLine()
    println("Enter weeks:")
    var weeks = readLine()

    var result = (year?.toInt() ?: 0) *360 + (month?.toInt() ?: 0) *30 + (weeks?.toInt() ?: 0) *7
    println("days: $result")

}

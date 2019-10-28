package com.drow.kotlin_3

// Вывести на экран пять строк из нулей, причем количество нулей в каждой строке равно номеру строки.

fun zeroString(){
    var string = "0"
    for (i in 0..4){
        println(string)
        string += "0"
    }
}
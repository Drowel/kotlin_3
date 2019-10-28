package com.drow.kotlin_3

import java.time.Month
import java.util.*

// Вывести на экран текущее название дня недели, название месяца и свое имя. Каждое слово должно быть в отдельной строке.

fun calendarName(){
    var calendar = Calendar.getInstance()
    var day = when (calendar.get(Calendar.DAY_OF_WEEK)){
        0 -> "Суббота"
        1 -> "Воскресенье"
        2 -> "Понедельник"
        3 -> "Вторник"
        4 -> "Среда"
        5 -> "Четверг"
        6 -> "Пятница"
        else -> "end oof time"
    }
    println(day)

    var month = when (calendar.get(Calendar.MONTH)){
        0 -> "январь"
        1 -> "февраль"
        2 -> "март"
        3 -> "апрель"
        4 -> "май"
        5 -> "июнь"
        6 -> "июль"
        7 -> "август"
        8 -> "сентябрь"
        9 -> "октябрь"
        10 -> "ноябрь"
        11 -> "декабрь"

        else -> "end oof time"
    }
    println(month)
    println("Novikov")
}
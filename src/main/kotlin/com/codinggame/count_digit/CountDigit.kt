package com.codinggame.count_digit

fun main(args: Array<String>) {
    val str = "Hello World !";
    val count = str.filter { Character.isDigit(it) }.count()
    println(count)
}
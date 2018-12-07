package com.codinggame.tallest_tower

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val N = input.nextInt()
    val M = input.nextInt()
    val S = input.nextInt()
    if (input.hasNextLine()) {
        input.nextLine()
    }
    var count = 0
    for (i in 0 until N) {
        val row = input.nextLine()
        count += row.asSequence().filter { it == 'o' }.count()
    }
    println(count*S)
}

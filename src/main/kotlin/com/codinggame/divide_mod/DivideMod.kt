package com.codinggame.divide_mod

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val a = input.nextLong()
    val b = input.nextLong()
    val c = input.nextLong()

    println((a*b) % c)
}

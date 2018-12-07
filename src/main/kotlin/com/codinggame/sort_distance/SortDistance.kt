package com.codinggame.sort_distance

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val N = input.nextInt()
    val m:MutableMap<Float,String> = HashMap()
    for (i in 0 until N) {
        val item = input.next()
        val distance = input.nextFloat()
        m.put(distance, item)
    }
    val joinToString = m.toSortedMap(reverseOrder()).map { it.value }.joinToString(" ")
    println(joinToString)
}

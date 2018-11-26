package com.codinggame.binary_xor

fun main(args: Array<String>) {
    val n1 = "001"
    val n2 = "011"
    for ((index, value) in n1.toCharArray().withIndex()){
        print(value.toString().toInt() xor n2.toCharArray()[index].toString().toInt())
    }
}

package com.codinggame.right_word

fun main(args: Array<String>) {
    val SCR = "PnSei"
    val list: MutableList<String> = java.util.ArrayList()
    list.add("Eight")
    list.add("Wheel")
    list.add("Spine")
    list.add("Grass")
    list.add("Skies")

    print(findRightWord(SCR, list))
}

fun findRightWord(SCR: String, words: MutableList<String>): String {
    return words.distinct().first { upperStringAndSort(it).equals(upperStringAndSort(SCR)) }
}

fun upperStringAndSort(word: String): String {
    return word.toUpperCase().asSequence().sorted().joinToString();
}
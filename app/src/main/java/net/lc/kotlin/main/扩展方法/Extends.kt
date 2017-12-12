package com.sariel.kotlindemo.扩展方法

/**
 * Created by 18480 on 2017/12/11.
 */
fun main(args: Array<String>) {
    println("abc" * 16)
    "abc".b = 123
    var a = "abc"
    println(isEmpty(a))
}

operator fun String.times(int: Int): String {//扩展成员
    val stringBuilder = StringBuilder()
    for (i in 0 until int) {
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}

fun isEmpty(str: String): Boolean {
    var boolean =
            !str.isEmpty()
    return boolean
}

val String.a: String
    get() = "abc"

var String.b: Int
    set(value) {

    }
    get() = 1
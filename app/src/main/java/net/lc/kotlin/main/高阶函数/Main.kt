package com.sariel.kotlindemo.高阶函数

import java.lang.StringBuilder

/**
 * Created by 18480 on 2017/12/12.
 */

fun main(args: Array<String>) {
    val a = Hello::world
    println(a)

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    val newList = list.map {
        it * 2 + 3
    }

    val newList2 = list.map { Int::toDouble }

    newList.forEach(::print)

    val rList = listOf(
            1..10,
            11..20,
            21..100
    )

//    val flatList = rList.flatMap { intRange ->
//        intRange.map { intElement ->
//            "No.$intElement"
//        }
//    }
    //缩减
    val flatList = rList.flatMap {
        it.map {
            "No.$it"
        }
    }

    flatList.forEach(::print)

    println(flatList.reduce { acc, i -> acc + i })

    (0..3).map(::factorial).reduce { acc, i -> acc + i }

    (0..3).map(::factorial).fold(5) { acc, i -> acc + i }

    (0..3).map(::factorial).fold(StringBuilder()) { acc, i ->
        acc.append(i).append(",")
    }
}

fun factorial(n: Int): Int {
    if (n == 0) return 1
    return (1..n).reduce { acc, i -> acc * i }
}


class Hello {
    fun world() {
        println("Hello World")
    }
}
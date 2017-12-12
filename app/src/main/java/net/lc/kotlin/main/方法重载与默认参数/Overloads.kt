package com.sariel.kotlindemo.方法重载与默认参数

import java.util.*

/**
 * Created by 18480 on 2017/12/11.
 */
class Overloads {
    fun a(): Int {
        return 0;
    }

    fun a(int: Int): Int {
        return int
    }

    fun a(int: Int = 0, a: Int): Int {//默认参数
        return int
    }
}

fun main(args: Array<String>) {
    var overloads = Overloads().a(a = 1)
    println(overloads)

    val integers = ArrayList<Int>()
    integers.add(1)
    integers.add(2)
    integers.add(3)
    integers.add(4)
    integers.add(5)

    println(integers)
    integers.removeAt(1)
    integers.removeAt(2)
    println(integers)
}
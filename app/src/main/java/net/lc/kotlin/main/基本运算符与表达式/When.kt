package net.lc.kotlin.main.基本运算符与表达式

/**
 * Created by LiangCheng on 2017/10/31.
 */
fun main(args: Array<String>) {
    val x = 5
    when (x) {
        is Int -> println("Hello $x")
        in 1..100 -> println("$x is in 1..100")
        !in 1..100 -> println("$x is not in 1..100")
        args[0].toInt() -> println("x == args[0]")
    }

    val mode = when {
        args[0].isNotEmpty() && args[0] == "1" -> println("ture")
        else -> println("false")
    }
}
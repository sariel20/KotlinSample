package net.lc.kotlin.main.基本运算符与表达式

import java.lang.Exception

/**
 * Created by LiangCheng on 2017/10/31.
 */
fun main(args: Array<String>) {
    val result = try {
        args[0].toInt() / args[1].toInt()
    } catch (e: Exception) {
        e.printStackTrace()
        0
    }
    println(result)
}
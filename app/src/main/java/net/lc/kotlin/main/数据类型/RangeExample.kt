package net.lc.kotlin.main.数据类型

/**
 * Created by LiangCheng on 2017/10/24.
 *
 * 区间
 */

val range: IntRange = 0..1024 // [0,1024]
val range_example:IntRange = 0 until 1024 //[0,1024) = [0,1023]

val emptyRange:IntRange = 0..-1

fun main(args: Array<String>) {
    println(emptyRange.isEmpty())
    println(range.contains(50))
    println(50 in range)

    for (i in range_example){
        println("$i,")
    }
}
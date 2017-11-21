package net.lc.kotlin.main.参数

/**
 * Created by LiangCheng on 2017/10/31.
 */
//变长参数

fun main(vararg args: String) {
//    for (arg in args) {
//        println(arg)
//    }

    val array = intArrayOf(1, 3, 5)
    hello(ints = *array, string = "Hello") // *=展开array   （ints  string） 具名参数
}

fun hello(double: Double = 3.0, vararg ints: Int, string: String) { //double 默认参数
    println(double)
    ints.forEach(::println)
    println(string)
}
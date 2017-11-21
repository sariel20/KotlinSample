package net.lc.kotlin.main.循环语句

/**
 * Created by LiangCheng on 2017/10/31.
 */
fun main(args: Array<String>) {
    var x = 5;
    while (x > 0) {
        println(x)
        x--
    }

    do {
        println(x)
        x--
    } while (x > 0)

//    for (arg in args) {
//        println(arg)
//    }
//
//    for ((index, value) in args.withIndex()) {
//        println("$index -> $value")
//    }
//
//    for (indexValue in args.withIndex()) {
//        println("${indexValue.index} -> ${indexValue.value}")
//    }
}
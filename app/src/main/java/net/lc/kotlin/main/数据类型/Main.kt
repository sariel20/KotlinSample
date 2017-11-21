package net.lc.kotlin.main.数据类型

/**
 * Created by LiangCheng on 2017/9/28.
 */

const val FINAL_HELLO_WORLD: String = "HelloWorld" //常量   const 编译期常量
var HelloWorld: String = "HelloWorld" //变量

var numBer = 5
var Str = "ABC"

fun main(args: Array<String>) {
    checkArgs(args)
    val num1 = args[0].toInt()
    val num2 = args[1].toInt()

    println("$num1 + $num2 = ${sum(num1, num2)}")

    println(int2Long(3))

    println(sum2(1, 4))

    args.forEach({ it ->
        println(it)
    })
    args.forEach ForEach@ {
        if (it == "b") return@ForEach
        println(it)
    }
    println("The End")

    args.forEach(::println)

}

fun sum(arg1: Int, arg2: Int) = arg1 + arg2

//(Int,Int) -> Int
val sum2 = { arg1: Int, arg2: Int ->
    println("$arg1 + $arg2 = ${arg1 + arg2}")
    arg1 + arg2
}

val printHello = {
    println("Hello")
}

fun printUsage() {
    println("请传入两个整型参数,例如1,2")
}

fun checkArgs(args: Array<String>) {
    if (args.size < 2) {
        printUsage()
        System.exit(0)
    }
}

val int2Long = fun(x: Int): Long {
    return x.toLong()
}
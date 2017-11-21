package net.lc.kotlin.main.数据类型

/**
 * Created by LiangCheng on 2017/9/23.
 */
val string: String = "HelloWorld"
val fromChars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'))

fun main(args: Array<String>) {
    println(string == fromChars) //内容对比
    println(string === fromChars) //对象对比

    println("输出" + string)

    val arg1: Int = 0
    val arg2: Int = 1

    println("" + arg1 + "+" + arg2 + "=" + (arg1 + arg2))
    println("$arg1 + $arg2 = ${arg1 + arg2}")

    val sayHello: String = "Hello \"LC\""
    println(sayHello)

    val salary: Int = 1000
    println("$$salary")

    val rawString: String = """
        \t
        \n
        \\\\\\$$salary
    """
    println(rawString)
    println(rawString.length)

}
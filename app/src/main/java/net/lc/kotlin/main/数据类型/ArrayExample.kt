package net.lc.kotlin.main.数据类型

/**
 * Created by LiangCheng on 2017/9/27.
 */
val arrayOfInt: IntArray = intArrayOf(1, 3, 5, 7)
val arrayOfChar: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val arrayOfString: Array<String> = arrayOf("我", "是", "我")
//val arrayOfClass:Array<Class> = arrayOf(Class<>,......)

fun main(args: Array<String>) {
    println(arrayOfInt.size)
    for (int in arrayOfInt) {
        println(int)
    }
    println(arrayOfInt.slice(1..3))//区间

    println(arrayOfChar.size)
    println(arrayOfChar[1])
    println(arrayOfChar.joinToString(""))//拼接

    println(arrayOfString.size)
}

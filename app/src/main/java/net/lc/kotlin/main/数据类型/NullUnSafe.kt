package net.lc.kotlin.main.数据类型

/**
 * Created by LiangCheng on 2017/9/24.
 */
fun getName(): String? {
    return null
}

fun main(args: Array<String>) {
    //if(name == null)
    //    return
    val name = getName() ?: return
    println(name.length)


    val value: String? = "HelloWorld"
    println(value!!.length) //编译器通过！！
}
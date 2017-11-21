package net.lc.kotlin.main.类和对象

/**
 * Created by LiangCheng on 2017/10/27.
 */

class X

class A {
    var b = 0;
    lateinit var c: String //lateinit 延迟初始化
    lateinit var d: X
    val e: X by lazy {
        //常量延迟初始化需用lazy
        println("init X")
        X()
    }

}

fun main(args: Array<String>) {
    val a = A()
    println(a.e)
}
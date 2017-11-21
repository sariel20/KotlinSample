package net.lc.kotlin.main.类和对象

/**
 * Created by LiangCheng on 2017/9/24.
 */

class PeopleA(XG: String, ZX: String, SY: String) : People(XG, ZX, SY)

class PeopleB(XG: String, ZX: String, SY: String) : People(XG, ZX, SY)

open class People(var XG: String, var ZX: String, var SY: String) {
    init {
        println("${this.javaClass.simpleName},性格：$XG,长相：$ZX,声音：$SY")
    }
}

fun main(args: Array<String>) {
    val test: PeopleA = PeopleA("温柔", "甜美", "动人")
    val test1: PeopleB = PeopleB("彪悍", "帅气", "浑厚")
    println(test is People)
}


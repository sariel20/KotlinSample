package net.lc.kotlin.main.复合函数

/**
 * Created by LiangCheng on 2017/12/14.
 */

infix fun <P1, P2, R> Function1<P1, P2>.andThen(function: Function1<P2, R>): Function1<P1, R> {
    return fun(p1: P1): R {
        return function.invoke(this.invoke(p1))
    }
}

//f(g(x))
var a = { i: Int -> i + 5 } //g(x)
var b = { i: Int -> i * 2 } //f(x)
fun main(args: Array<String>) {
    val c = a andThen b
    println(c(6))
}
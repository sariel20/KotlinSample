package net.lc.kotlin.main.闭包

/**
 * Created by LiangCheng on 2017/12/14.
 */

fun makeFun(): () -> Unit {
    var count = 0
    return fun() {
        println(++count)
    }
}

fun fibonacci(): Iterable<Long> {
    var first = 0L
    var second = 1L
    return Iterable {
        object : LongIterator() {
            override fun nextLong(): Long {
                val result = second
                second += first
                first = second - first
                return result
            }

            override fun hasNext() = true
        }
    }
}

fun main(args: Array<String>) {
//    val x = makeFun()
//    x()
//    x()
//    x()

//    for (i in fibonacci()) {
//        if (i > 100) break
//        println(i)
//    }

    val addFun = add(5)
    println(addFun(2))
}

//fun add(x: Int) = fun(y: Int) = x + y

fun add(x: Int): (Int) -> Int {
    return fun(y: Int): Int {
        return x + y
    }
}
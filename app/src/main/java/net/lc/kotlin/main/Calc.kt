package net.lc.kotlin.main

/**
 * Created by LiangCheng on 2017/10/31.
 */
fun main(args: Array<String>) {
    while (true) {
        try {
            println("请输入算式：")
            val input = readLine() ?: break
            val splits = input.trim().split(" ")
            val arg1 = splits[0].toDouble()
            val op = splits[1]
            val arg2 = splits[2].toDouble()

            println("$arg1 $op $arg2 = ${Operator(op).apply(arg1, arg2)}")
        } catch (e: Exception) {
            println("输入错误 + ${e.message}")
        }

        println("是否继续？Y")
        val cmd = readLine()
        if (cmd == null || cmd.toLowerCase() != "y") {
            break
        }
    }
}

class Operator(op: String) {
    val opFun: (left: Double, right: Double) -> Double

    init {
        opFun = when (op) {
            "+" -> { l, r -> l + r }
            "-" -> { l, r -> l - r }
            "*" -> { l, r -> l * r }
            "/" -> { l, r -> l / r }
            "%" -> { l, r -> l % r }
            else -> {
                throw UnsupportedOperationException(op)
            }
        }
    }

    fun apply(left: Double, right: Double): Double {
        return opFun(left, right)
    }
}
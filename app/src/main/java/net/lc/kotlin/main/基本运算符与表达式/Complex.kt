package net.lc.kotlin.main.基本运算符与表达式

/**
 * Created by LiangCheng on 2017/10/27.
 */

class Complex(var real: Double, var imaginary: Double) {
    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imaginary + other.imaginary)
    }

    override fun toString(): String {
        return "$real + ${imaginary}i"
    }
}

fun main(args: Array<String>) {
    val c1 = Complex(3.0, 4.0)
    val c2 = Complex(2.0, 7.5)

    println(c1 + c2)
}
package net.lc.kotlin.main.数据类型

/**
 * Created by LiangCheng on 2017-09-21.]
 *
 * Kotlin 数据类型
 */

val aStr: String = "Hello World"
val aBoolean: Boolean = true

val anInt: Int = 8;
val anotherInt: Int = 0xFF
val moreInt: Int = 0b0000011
val maxInt: Int = Int.MAX_VALUE
val minInt: Int = Int.MIN_VALUE

val aLong: Long = 1234567891234567891
val another: Long = 123
val maxLong: Long = Long.MAX_VALUE
val minLong: Long = Long.MIN_VALUE

val aFloat: Float = 2.0F
val anotherFloat: Float = 1E3F
val maxFloat: Float = Float.MAX_VALUE
val minFloat: Float = -Float.MAX_VALUE

val aDouble: Double = 3.0
val anotherDouble: Double = 3.1415926
val maxDouble: Double = Double.MAX_VALUE
val minDouble: Double = Double.MIN_VALUE

val aShort: Short = 127
val maxShort: Short = Short.MAX_VALUE
val minShort: Short = Short.MIN_VALUE

var aByte: Byte = 127
var maxByte: Byte = Byte.MAX_VALUE
var minByte: Byte = Byte.MIN_VALUE

fun main(args: Array<String>) {

    println(anInt)
    println(anotherInt)
    println(moreInt)
    println(aFloat)
    println(anotherFloat)

}
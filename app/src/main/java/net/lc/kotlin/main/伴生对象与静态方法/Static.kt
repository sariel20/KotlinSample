package com.sariel.kotlindemo.伴生对象与静态方法

/**
 * Created by 18480 on 2017/12/11.
 */

fun main(args: Array<String>) {
    val a = minOf(args[0].toInt(), args[1].toInt())

    var lat = Lat.ofDouble(3.0)
    val lat2 = Lat.ofLat(lat)

    println(lat2)
}

class Lat private constructor(val value: Double) {

    companion object {
        @JvmStatic //java中调用函数加此注解
        fun ofDouble(double: Double): Lat {
            return ofDouble(double)
        }

        fun ofLat(lat: Lat): Lat {
            return Lat(lat.value)
        }

        @JvmField //java中調用此属性加此注解
        val TAG: String = "HelloWorld"
    }
}
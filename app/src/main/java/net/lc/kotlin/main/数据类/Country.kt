package net.lc.kotlin.main.数据类

/**
 * Created by LiangCheng on 2017/12/12.
 */

/**
 * 插件  使data类似于javaBean 生成无参构造方法  去掉final
 * classpath "org.jetbrains.kotlin:kotlin-noarg:$kotlin_version"
 * classpath "org.jetbrains.kotlin:kotlin-allopen:$kotlin_version"
 *
 *  apply plugin: 'kotlin-noarg'
 *   apply plugin: 'kotlin-allopen'
 *
 *   noArg {
 *       annotation("net.lc.kotlin.main.数据类.PoKo") //注解类
 *   }
 *  allOpen {
 *       annotation("net.lc.kotlin.main.数据类.PoKo")
 *   }
 */
@PoKo
data class Country(val id: Int, val name: String)

fun main(args: Array<String>) {
    val china = Country(0, "中国")
    println(china)
    println(china.component1())//参数，数字按参数个数递增
    println(china.component2())
    val (id, name) = china
    println("$id->$name")
}
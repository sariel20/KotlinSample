package net.lc.kotlin.main

import java.io.File

/**
 * Created by LiangCheng on 2017/12/14.
 * 统计文件字符个数
 */
fun main(args: Array<String>) {
    val map = HashMap<Char, Int>()
    File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace).forEach {
        val count = map[it]
        if (count == null) map[it] = 1
        else map[it] = count + 1
    }

    map.forEach(::println)
}
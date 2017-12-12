package net.lc.kotlin.main.枚举

/**
 * Created by LiangCheng on 2017/12/12.
 */
enum class LogLevel(val id: Int) {
    VERBOSE(0), DEBUG(1), INFO(2), WARN(3), ERROR(4), ASSERT(5);  //与方法之间需要分号分割

    fun getTag(): String {
        return "$id->$name"
    }

    override fun toString(): String {
        return "$name->$ordinal"
    }
}

fun main(args: Array<String>) {
    println(LogLevel.DEBUG.getTag())
    println(LogLevel.DEBUG.ordinal)
}
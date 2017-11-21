package net.lc.kotlin.main.基本运算符与表达式

/**
 * Created by LiangCheng on 2017/10/31.
 */

private const val USERNAME = "kotlin"
private const val PASSWD = "123"

private const val DEBUG = 1
private const val USER = 0

private const val USER_ADMIN = "admin"
private const val USER_PASSWD = "admin"

fun main(args: Array<String>) {
    val mode = if (args.isNotEmpty() && args[0] == "1") { //分支表达式
        DEBUG
    } else {
        USER
    }

    println("请输入用户名：")
    val userName = readLine()
    println("请输入密码：")
    val passWd = readLine()

    if (mode == DEBUG && userName == USER_ADMIN && passWd == USER_PASSWD) {
        println("管理员登录成功")
    } else if (userName == USERNAME && passWd == PASSWD) {
        println("登录成功")
    } else {
        println("登录失败")
    }
}

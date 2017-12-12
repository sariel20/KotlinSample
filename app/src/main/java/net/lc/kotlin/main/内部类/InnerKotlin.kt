package net.lc.kotlin.main.内部类

/**
 * Created by LiangCheng on 2017/12/12.
 */

class InnerKotlin {
    val a = 0
    inner class Inner{

    }
}

interface OnClickListener {
    fun onClick()
}

class View {
    var onClickListener: OnClickListener? = null
}

fun main(args: Array<String>) {
    val view = View()
    //匿名内部类 object
    view.onClickListener = object : OnClickListener {
        override fun onClick() {
        }
    }
}
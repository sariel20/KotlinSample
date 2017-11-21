package net.lc.kotlin.main.基本运算符与表达式

/**
 * Created by LiangCheng on 2017/10/31.
 */
class Java {
    internal enum class State {
        IDLE, BUFFERING, PLAYING, PAUSED
    }

    private val state = State.IDLE

    fun pause() {
        when (state) {
            State.BUFFERING -> {}
            State.PLAYING -> doPause()
            else -> {
            }
        }//什么都不做
    }

    fun resume() {
        when (state) {
            State.PAUSED -> doResume()
            else -> {
            }
        }
    }

    private fun doPause() {}

    private fun doResume() {}
}

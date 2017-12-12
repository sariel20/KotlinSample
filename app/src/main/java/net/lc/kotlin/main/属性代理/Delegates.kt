package net.lc.kotlin.main.属性代理

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * Created by LiangCheng on 2017/12/12.
 */
class Delegate {
    val hello by lazy {
    }

    //可观察属性
    var str: String by Delegates.observable("name") {
        _, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }

    val h2 by X()

    var h3 by X()
}

class X {
    private var value: String? = null
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("getValue:$thisRef->${property.name}")
        return value ?: ""
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("setValue,$thisRef->${property.name} = $value")
        this.value = value
    }
}

fun main(args: Array<String>) {
    val delegates = Delegate()
//    println(delegates.hello)
//    println(delegates.h2)
//    println(delegates.h3)
//    delegates.h3 = "value of h3"
//    println(delegates.h3)

    delegates.str = "oldName"
    delegates.str = "newName"
}
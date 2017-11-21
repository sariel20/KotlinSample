package net.lc.kotlin.main.循环语句

/**
 * Created by LiangCheng on 2017/10/31.
 */
class Student {
    fun isNotClothedProperly(): Boolean {
        return true
    }

}

fun main(args: Array<String>) {
    val students = ArrayList<Student>()
    val you = Student()
    for (student in students) {
        if (student == you) continue//跳过
        if (student.isNotClothedProperly()) {
            break//跳出
        }
    }
}
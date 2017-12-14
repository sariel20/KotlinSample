package net.lc.kotlin.main.尾递归

/**
 * Created by LiangCheng on 2017/12/13.
 */
data class ListNode(val value: Int, var next: ListNode?)

fun findListNode(head: ListNode?, value: Int): ListNode? {
    head ?: return null
    if (head.value == value) return head
    return findListNode(head.next, value)
}

fun factorial(n: Long): Long {
    return n * factorial(n - 1)
}
package functions

import java.util.*

object Duplicates {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 2, 3, 2, 6, 4, 2, 1, 7, 3, 9, 22, 31, 21, 54, 567, 78, 32, 30)
        println(duplicates(arr))
    }

    fun duplicates(a: IntArray): Int {
        val set: MutableSet<Int> = HashSet()
        var index = 0
        var lowerIndex = 0
        for (i in a.indices) {
            if (set.add(a[i])) {
                println("Added element ${a[i]}")
            } else {
                index = i
                lowerIndex = index
                return a[lowerIndex]
            }
        }
        return -1
    }
}
package com.example.hw4_peter

class Problem2 {
    private fun searchR(strings: Array<String>, str: String, first: Int, last: Int): Int {
        if (first > last) {
            return -1
        }
        var mid = (last + first) / 2
        if (strings[mid].isEmpty()) {
            var left = mid - 1
            var right = mid + 1
            while (true) {
                if (left < first && right > last) {
                    return -1
                } else if (right <= last && strings[right].isNotEmpty()) {
                    mid = right
                    break
                } else if (left >= first && strings[left].isNotEmpty()) {
                    mid = left
                    break
                }
                right++
                left--
            }
        }
        return when {
            str == strings[mid] -> {
                mid
            }
            strings[mid] < str -> {
                searchR(strings, str, mid + 1, last)
            }
            else -> {
                searchR(strings, str, first, mid - 1)
            }
        }
    }

    fun search(strings: Array<String>?, str: String?): Int {
        println(str)
        println(strings)
        return if (strings == null || str == null || str === "") {
            -1
        } else searchR(strings, str, 0, strings.size - 1)
    }
}
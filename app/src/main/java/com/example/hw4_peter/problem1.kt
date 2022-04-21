package com.example.hw4_peter

import android.util.Log

class Problem1 {
    private var stackSize = 100
    private var buffer = IntArray(stackSize * 3)
    private var stackPointer = intArrayOf(-1, -1, -1)
    @Throws(Exception::class)
    fun push(stackNum: Int, value: Int) {
        if (stackPointer[stackNum] + 1 >= stackSize) {
            throw Exception("Out of space.")
        }
        println("lol : " + stackPointer[stackNum])
        stackPointer[stackNum]++
        buffer[absTopOfStack(stackNum)] = value
    }

    @Throws(Exception::class)
    fun pop(stackNum: Int): Int {
        if (stackPointer[stackNum] == -1) {
            throw Exception("Trying to pop an empty stack.")
        }
        val value = buffer[absTopOfStack(stackNum)]
        buffer[absTopOfStack(stackNum)] = 0
        stackPointer[stackNum]--
        return value
    }

    fun peek(stackNum: Int): Int {
        val index = absTopOfStack(stackNum)
        return buffer[index]
    }

    fun isEmpty(stackNum: Int): Boolean {
        return stackPointer[stackNum] == -1
    }

    private fun absTopOfStack(stackNum: Int): Int {
        return stackNum * stackSize + stackPointer[stackNum]
    }
}
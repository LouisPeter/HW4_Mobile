package com.example.hw4_peter

import org.junit.Assert.*
import org.junit.Test

class Problem1Test {
    private val problem1 = Problem1()
    @Test
    fun popEmpty() {
        var output = ""
        try {
            problem1.pop(0)
        } catch(e: Exception){output = e.localizedMessage.toString()
        }
        assertEquals("Trying to pop an empty stack.",output)
    }
    @Test
    fun push_data() {
        problem1.push(0, 1)
        assertEquals(1,  problem1.peek(0))
    }
    @Test
    fun checkIsEmpty() {
        var res = problem1.isEmpty(0)
        assertEquals(true, res)
    }
    @Test
    fun push_data2() {
        problem1.push(1, 3)
        assertEquals(3,  problem1.peek(1))
    }
    @Test
    fun get_Value() {
        problem1.push(1, 3)
        assertEquals(3, problem1.peek(1))
    }
    @Test
    fun pop_data() {
        problem1.push(0, 2)
        problem1.pop(0)
        assertEquals(0, problem1.peek(1))
    }
    @Test
    fun array_is_not_empty() {
        problem1.push(0, 30)
        assertEquals(false, problem1.isEmpty(0))
    }
    @Test
    fun push_not_empty() {
        problem1.push(1, 3)
        problem1.push(1, 4)
        assertEquals(4, problem1.peek(1))
    }

    @Test
    fun peek_out_of_range() {
        try {
            problem1.peek(1000)
        }
        catch (e: Exception)  {
            assertEquals("Index 1000 out of bounds for length 3", e.localizedMessage.toString())
        }
    }

    @Test
    fun create_array() {
        var array = ""
        problem1.push(0, 3)
        problem1.push(1, 3)
        array += problem1.peek(0)
        array += problem1.peek(1)
        assertEquals("33", array)
    }
}
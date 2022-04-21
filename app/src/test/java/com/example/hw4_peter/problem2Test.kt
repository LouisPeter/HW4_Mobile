package com.example.hw4_peter

import junit.framework.TestCase
import com.example.hw4_peter.Problem2
import org.junit.Test
import org.junit.Assert.*


class Problem2Test {
    private val problem2 = Problem2()
    private var array = arrayOf("random", "string", "int", "test", "char")
    private var array2 = arrayOf("random", "string", "int", "test", "char")
    private val emptyArray : Array<String> = emptyArray()
    private val intArray = arrayOf("10", "12", "16")
    private val charArray = arrayOf("a", "b", "c")

    @Test
    fun search_string() {
        var result = problem2.search(array, "int")
        assertEquals(2, result)
    }

    @Test
    fun search_bad_string() {
        var result = problem2.search(array, "bad")
        assertEquals(-1, result)
    }

    @Test
    fun empty_array() {
        var result = problem2.search(emptyArray, "bad")
        assertEquals(-1, result)
    }
    @Test
    fun search_null_string() {
        var result = problem2.search(array, null)
        assertEquals(-1, result)
    }
    @Test
    fun search_empty_string() {
        var result = problem2.search(array, "")
        assertEquals(-1, result)
    }
    @Test
    fun search_empty_variable() {
        var emptyString = ""
        var result = problem2.search(array, emptyString)
        assertEquals(-1, result)
    }
    @Test
    fun search_null_variable() {
        var nullVariable = null
        var result = problem2.search(array, nullVariable)
        assertEquals(-1, result)
    }

    @Test
    fun search_Int_array() {
        var result = problem2.search(intArray, "12")
        assertEquals(1, result)
    }

    @Test
    fun search_Int_array2() {
        var result = problem2.search(intArray, "10")
        assertEquals(0, result)
    }

    @Test
    fun search_char_array() {
        var result = problem2.search(charArray, "c")
        assertEquals(2, result)
    }
}
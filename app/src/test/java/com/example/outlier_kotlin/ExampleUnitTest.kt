package com.example.outlier_kotlin

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val model = Model.instance
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun outlier_isCorrect(){
        assertEquals(11,model?.findOutlier("2,4,0,100,4,11,2602,36"))
    }
}
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
    fun outlier_isCorrect_odd(){
        assertEquals(11,model?.findOutlier("2,4,0,100,4,11,2602,36"))
    }
    @Test
    fun outlier_isCorrect_even(){
        assertEquals(160,model?.findOutlier("160,3,1719,19,11,13,-21 "))
    }
    @Test
    fun outlier_isCorrect_3integers(){
        assertEquals(2,model?.findOutlier("1,2,3"))
    }
    @Test
    fun outlier_inputTooSmall(){
        assertThrows(Exception::class.java){
            model?.findOutlier("1,2")
        }
    }

    @Test
    fun outlier_manyOutliers(){
        assertThrows(Exception::class.java){
            model?.findOutlier("1,2,4,6,5,7")
        }
    }

}
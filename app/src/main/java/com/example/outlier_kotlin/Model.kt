package com.example.outlier_kotlin

import android.util.Log

class Model {
    fun findOutlier(input: String): Int {
            val array = input.filter{!it.isWhitespace()}.split(",").map {it.toInt()}
            if(array.size<3){
                throw Exception("Input is too small!")
            }
            val odd = arrayListOf<Int>()
            val even = arrayListOf<Int>()

            for (integer in array) {
                if (integer % 2 == 0) {
                    even.add(integer)
                }
                else{
                    odd.add(integer)
                }
            }
        Log.d("arr-check", " "+ even.size + " " + odd.size)
        return if(even.size==1)
            even[0]
        else if(odd.size==1)
            odd[0]
        else
            throw Exception("There is more than one outlier in given input")

    }

    companion object {
        var instance: Model? = null
            get() {
                if (field == null) {
                    field = Model()
                }
                return field
            }
            private set
    }
}
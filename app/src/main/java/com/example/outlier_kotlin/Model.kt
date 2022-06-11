package com.example.outlier_kotlin

import android.util.Log

class Model {
    fun findOutlier(input: String): Int {
            var array = input.filter{!it.isWhitespace()}.split(",").map {it.toInt()}


            for (integer in array) {
                if (integer % 2 == 1) {
                    return integer
                }
            }

        return -999999

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
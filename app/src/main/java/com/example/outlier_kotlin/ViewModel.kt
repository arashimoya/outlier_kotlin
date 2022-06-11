package com.example.outlier_kotlin

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class ViewModel(application: Application) : AndroidViewModel(application) {
    private var model: Model? = Model.instance


    fun getOutlier(input: String): Int? {
        return model?.findOutlier(input)
    }


}
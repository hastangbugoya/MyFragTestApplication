package com.jjrz.myfragtestapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BlankFragment1ViewModel : ViewModel() {
    var MyString = MutableLiveData<String?>().apply { value = null }

    fun setMyString(S : String) {
        MyString.value = S
    }
}
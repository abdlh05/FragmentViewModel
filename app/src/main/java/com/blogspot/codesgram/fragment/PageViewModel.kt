package com.blogspot.codesgram.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PageViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    private val mPhone = MutableLiveData<String>()
    private val mAddress = MutableLiveData<String>()

    val name: LiveData<String>

        get() = mName

    fun setName(name: String) {
        mName.value = name
    }

    val phone: LiveData<String>

        get() = mPhone

    fun setPhone(phone: String) {
        mPhone.value = phone
    }

    val adrs: LiveData<String>

        get() = mAddress

    fun setAddress(adrs: String) {
        mAddress.value = adrs
    }

    }





































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































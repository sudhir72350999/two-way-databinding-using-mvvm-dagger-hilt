package com.example.twowaydatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class UserViewModel @Inject constructor()  : ViewModel() {

    val userInput = MutableLiveData<String>()
    val displayText = MutableLiveData<String>()

    fun updateDisplayText(){
        displayText.value= userInput.value
    }



}
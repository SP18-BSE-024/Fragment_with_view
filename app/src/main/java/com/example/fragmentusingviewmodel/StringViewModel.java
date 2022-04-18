package com.example.fragmentusingviewmodel;

import android.text.Editable;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StringViewModel extends ViewModel {
    private MutableLiveData<String> message=new MutableLiveData<>();

    public void setMessage(String msg){
        message.setValue(msg);
    }
    public MutableLiveData<String> getMessage(){
        return message;
    }
}

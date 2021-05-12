package com.example.noteapp.ui.locked;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LockViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LockViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Lock fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
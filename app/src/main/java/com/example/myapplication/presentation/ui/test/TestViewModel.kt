package com.example.myapplication.presentation.ui.test

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.test.TestData
import com.example.domain.usecase.test.GetTestUseCase
import kotlinx.coroutines.launch

class TestViewModel(
    val getTestUseCase: GetTestUseCase
) : ViewModel() {

    val testInfo = MutableLiveData<List<TestData.Data>>()

    fun getTestData() {
        viewModelScope.launch {
            kotlin.runCatching { getTestUseCase() }
                .onSuccess {
                    testInfo.value = it.data
                    Log.d("test", "서버통신 성공")
                }
                .onFailure {
                    it.printStackTrace()
                    Log.d("test", "서버통신 실패")
                }
        }
    }
}
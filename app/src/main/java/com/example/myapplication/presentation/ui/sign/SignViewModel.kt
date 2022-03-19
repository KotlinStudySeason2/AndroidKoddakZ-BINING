package com.example.myapplication.presentation.ui.sign

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.sign.SignInData
import com.example.domain.model.sign.SignInItem
import com.example.domain.usecase.sign.PostSignInUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

class SignViewModel (
    private val postSignInUseCase: PostSignInUseCase,
): ViewModel() {
    //로그인시 필요한 값 -> email, password, deviceToken
    var email = MutableLiveData<String>()
    var password = MutableLiveData<String>()
    var deviceToken = MutableLiveData<String>()

    //로그인
    var signIn: MutableLiveData<SignInData> = MutableLiveData()

    //로그인 status 체크
    var signInStatus = MutableLiveData<Int>()


    //로그인
    fun signIn(signInItem: SignInItem) {
        CoroutineScope(Dispatchers.Main.immediate).launch {
            kotlin.runCatching { postSignInUseCase(signInItem) }
                .onSuccess {
                    signIn.value = it
                    Log.d("SignIn", ": 서버통신 성공")
                }
                .onFailure {
                    it.printStackTrace()
                    Log.d("SignIn", ": 서버통신 실패")
                }
        }
    }

}
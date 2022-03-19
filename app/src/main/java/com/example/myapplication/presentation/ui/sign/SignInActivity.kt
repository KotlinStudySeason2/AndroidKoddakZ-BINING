package com.example.myapplication.presentation.ui.sign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivitySignInBinding
import com.example.myapplication.presentation.ui.main.MainActivity
import com.nadosunbae_android.app.presentation.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel
import timber.log.Timber

class SignInActivity : BaseActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {
    private val signViewModel: SignViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        observeSignIn()

    }

    private fun observeSignIn() {
        signViewModel.signIn.observe(this) {
            if (it.success) {

                val intent = Intent(this, MainActivity::class.java)
                val data = signViewModel.signIn.value?.user
                Timber.d("signInData : $data")
                intent.apply {
                    putExtra("signData", data)
                }
                startActivity(intent)
                finish()

            } else {
                Log.d("로그인", "실패")
            }
        }
    }
}
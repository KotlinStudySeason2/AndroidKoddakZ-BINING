package com.example.myapplication.presentation.ui.diary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.domain.model.test.Diary
import com.example.myapplication.databinding.ActivityEditDiaryBinding
import java.util.*

class EditDiaryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditDiaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditDiaryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val diary = Diary(
            id = 0,
            title = "제목",
            content = "내용",
            createDate = Date(),
        )

        binding.bindingString = "제목제목제목제목"
        binding.diary = diary
    }
}
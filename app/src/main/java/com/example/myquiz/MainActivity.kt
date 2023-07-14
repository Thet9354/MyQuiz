package com.example.myquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnStart: Button
    private lateinit var editTxtName: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initWidget()

        pageDirectories();
    }

    private fun pageDirectories() {

        btnStart.setOnClickListener {
            if (editTxtName.text.isEmpty()){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            }else {
                val intent = Intent(this, Quiz_Questions_Activity::class.java)
                intent.putExtra(Constants.USER_NAME, editTxtName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }

    private fun initWidget() {

        btnStart = findViewById(R.id.btn_start)
        editTxtName = findViewById(R.id.editTxt_name)
    }
}
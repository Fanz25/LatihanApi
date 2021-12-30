package com.aplikasi.latihanapi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val input_nama : EditText = findViewById(R.id.input_nama)
        val input_email : EditText = findViewById(R.id.input_email)
        val input_pass : EditText = findViewById(R.id.input_pass)
        val btn_daftar : Button = findViewById(R.id.btn_Daftar)

    btn_daftar.setOnClickListener {
        val userData = PostRegister(input_nama.text.toString(), input_email.text.toString(), input_pass.text.toString())

        RetrofitClient.instance.creatUser(userData).enqueue(object : Callback<PostRegister>{
            override fun onResponse(call: Call<PostRegister>, response: Response<PostRegister>) {
                startActivity(Intent(this@RegisterActivity, MainActivity::class.java))
                finish()
                Toast.makeText(this@RegisterActivity, "Registrasi Berhasil",Toast.LENGTH_SHORT ).show()
            }

            override fun onFailure(call: Call<PostRegister>, t: Throwable) {
                Toast.makeText(this@RegisterActivity, t.message,Toast.LENGTH_SHORT ).show()
            }

        })
    }

    }
}
package com.example.customalert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import com.example.customalert.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnShow.setOnClickListener {
            showDialog()
        }
        binding.btnError.setOnClickListener {
            showError()
        }
    }

    private fun showError() {
        val view = LayoutInflater.from(this).inflate(R.layout.error_dialog,null)
        val alertDialog = AlertDialog.Builder(this).setView(view)

        val alert = alertDialog.create()
        alert.show()

        view.setOnClickListener {
            alert.dismiss()
        }
    }

    private fun showDialog() {
        val messageBox = LayoutInflater.from(this).inflate(R.layout.dialog_view,null)
        val alertBuild = AlertDialog.Builder(this).setView(messageBox)

        val dialog = alertBuild.create()
        dialog.show()

        messageBox.setOnClickListener {
            dialog.dismiss()
        }
    }
}
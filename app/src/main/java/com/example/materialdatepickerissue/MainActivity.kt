package com.example.materialdatepickerissue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.datepicker.MaterialDatePicker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val picker = MaterialDatePicker.Builder.datePicker().build()
        picker.showsDialog = false
        supportFragmentManager.beginTransaction().add(R.id.container, picker).commit()
    }
}
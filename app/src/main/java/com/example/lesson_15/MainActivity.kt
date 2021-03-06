package com.example.lesson_15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var tvRandomStudent: TextView? = null
    var btnSelectStudent: Button? = null
    var checkBox0: CheckBox? = null
    var checkBox1: CheckBox? = null
    var checkBox2: CheckBox? = null
    var checkBox3: CheckBox? = null
    var checkBox4: CheckBox? = null
    var checkBox5: CheckBox? = null
    var checkBox6: CheckBox? = null
    var checkBox7: CheckBox? = null
    var checkBox8: CheckBox? = null
    var checkBox9: CheckBox? = null
    var checkBox10: CheckBox? = null

    val mapStudent = mutableMapOf(
        R.id.checkBox0 to Student("Егор", true),
        R.id.checkBox1 to Student("Стас", true),
        R.id.checkBox2 to Student("Настя", true),
        R.id.checkBox3 to Student("Антон", true),
        R.id.checkBox4 to Student("Надя", true),
        R.id.checkBox5 to Student("Саша", true),
        R.id.checkBox6 to Student("Alex", true),
        R.id.checkBox7 to Student("Наташа", true),
        R.id.checkBox8 to Student("Марина", true),
        R.id.checkBox9 to Student("Дима", true),
        R.id.checkBox10 to Student("Дарья", true),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvRandomStudent = findViewById(R.id.tvRandomStudent)
        btnSelectStudent = findViewById(R.id.btnSelectStudent)
        checkBox0 = findViewById(R.id.checkBox0)
        checkBox1 = findViewById(R.id.checkBox1)
        checkBox2 = findViewById(R.id.checkBox2)
        checkBox3 = findViewById(R.id.checkBox3)
        checkBox4 = findViewById(R.id.checkBox4)
        checkBox5 = findViewById(R.id.checkBox5)
        checkBox6 = findViewById(R.id.checkBox6)
        checkBox7 = findViewById(R.id.checkBox7)
        checkBox8 = findViewById(R.id.checkBox8)
        checkBox9 = findViewById(R.id.checkBox9)
        checkBox10 = findViewById(R.id.checkBox10)

    }

    fun onSelectStudentClick(view: View?) {
        if (!mapStudent.values.toList().filter { it.present }.isEmpty()) {
            val ran = mapStudent.values.toList().filter { it.present }.random()
            tvRandomStudent?.setText(ran.name)
        } else {Toast.makeText(this, "Студенты отсутствуют!", Toast.LENGTH_LONG).show()}
    }

    fun onCheckBoxClick(view: View?) {
        val checkBox = view as CheckBox
        val check = checkBox.isChecked
        mapStudent.get(view.id)?.present = !check
    }
}
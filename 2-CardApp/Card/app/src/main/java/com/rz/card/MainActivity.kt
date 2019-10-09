package com.rz.card

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dua.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tombol.setOnClickListener {
//            startActivity(Intent(this, DuaActivity::class.java))
            val i = Intent(this, DuaActivity::class.java)
            i.putExtra("isi", edittext.text.toString())
            startActivity(i)
        }

        set.setOnClickListener {
            teks.text = edittext.text
        }
    }
}

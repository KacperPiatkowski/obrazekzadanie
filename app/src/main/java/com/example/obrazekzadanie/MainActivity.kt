package com.example.obrazekzadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var licznik = 1;

        findViewById<Button>(R.id.buttonLewy).setOnClickListener {
            if(licznik == 1)
                licznik = 4;
            else licznik -= 1;

            if(licznik == 1)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.obrazek);
            else if(licznik == 2)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.obrazek1);
            else if(licznik == 3)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.obrazek2);
        }
        findViewById<Button>(R.id.buttonPrawy).setOnClickListener {
            if(licznik == 4)
                licznik = 1;
            else
                licznik += 1;

            if(licznik == 1)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.obrazek);
            else if(licznik == 2)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.obrazek1);
            else if(licznik == 3)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.obrazek2);
        }
    }
}

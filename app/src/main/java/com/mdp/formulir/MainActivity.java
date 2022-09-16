package com.mdp.formulir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button btndaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btndaftar = findViewById(R.id.btn_daftar);
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // tampilkan toast "Anda Berhasil Terdaftar"
                Toast.makeText(MainActivity.this, "Anda Telah terdaftar !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
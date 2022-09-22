package com.if3a.formulirrelatif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView tvNPM, tvNama, tvJk, tvProdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvNPM = findViewById(R.id.tv_npm);
        tvNama = findViewById(R.id.tv_nama);
        tvJk = findViewById(R.id.tv_jk);
        tvProdi = findViewById(R.id.tv_prodi);

        Intent intent = getIntent();
        tvNPM.setText(intent.getStringExtra("varNPM"));
        tvNama.setText(intent.getStringExtra("varNama"));
        tvProdi.setText(intent.getStringExtra("varProdi"));
        tvJk.setText(intent.getStringExtra("varJk"));

    }
}
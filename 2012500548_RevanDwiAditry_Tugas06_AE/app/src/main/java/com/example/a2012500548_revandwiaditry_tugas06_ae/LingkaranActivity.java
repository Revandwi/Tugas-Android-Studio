package com.example.a2012500548_revandwiaditry_tugas06_ae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends AppCompatActivity {
    EditText jari;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        jari = findViewById(R.id.jarijari);
        hasil = findViewById(R.id.texthasil);
    }

    public void tombolhitung(View view) {
        String inputjari = jari.getText().toString();

        if (TextUtils.isEmpty(inputjari)) {
            jari.setError("Jari-Jari Harus Di isi");
            jari.requestFocus();
        } else {
            Double nilaijari = Double.parseDouble(inputjari);
            Double hasilhitung = 3.14 * nilaijari * nilaijari;
            hasil.setText(hasilhitung.toString());
        }
    }
}
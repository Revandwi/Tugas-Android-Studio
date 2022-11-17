package com.example.a2012500548_revandwiaditry_tugas06_ae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TrapesiumActivity extends AppCompatActivity {
    EditText sipendek, sipanjang, tinggi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);
        sipendek = findViewById(R.id.a);
        sipanjang = findViewById(R.id.b);
        tinggi = findViewById(R.id.tinggi);
        hasil = findViewById(R.id.texthasil);
    }

    public void tombolhitung(View view) {
        String inputa = sipendek.getText().toString();
        String inputb = sipanjang.getText().toString();
        String inputtinggi = tinggi.getText().toString();

        if (TextUtils.isEmpty(inputa)) {
            sipendek.setError("Sisi Pendek Harus Di Isi");
            sipendek.requestFocus();
        } else if (TextUtils.isEmpty(inputb)) {
            sipanjang.setError("Sisi Panjang Harus Di Isi");
            sipanjang.requestFocus();
        } else if (TextUtils.isEmpty(inputtinggi)) {
            tinggi.setError("Tinggi harus Di Isi");
            tinggi.requestFocus();
        } else {
            Double nilaisipendek = Double.parseDouble(inputa);
            Double nilaisipanjang = Double.parseDouble(inputb);
            Double nilaitinggi = Double.parseDouble(inputtinggi);
            Double hasilhitung = ((nilaisipendek + nilaisipanjang) * nilaitinggi) * 0.5;
            hasil.setText(hasilhitung.toString());
        }
    }
}
package com.example.a2012500548_revandwiaditry_tugas06_ae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.function.DoubleToLongFunction;

public class BujurSangkarActivity extends AppCompatActivity {
    EditText sisi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bujur_sangkar);
        sisi = findViewById(R.id.sisi);
        hasil = findViewById(R.id.texthasil);
    }

    public void tombolhitung(View view) {
        String inputsisi = sisi.getText().toString();

        if (TextUtils.isEmpty(inputsisi)) {
            sisi.setError("Sisi Harus Di Isi");
            sisi.requestFocus();
        } else {
            Double nilaisisi = Double.parseDouble(inputsisi);
            Double hasilhitung = nilaisisi * nilaisisi;
            hasil.setText(hasilhitung.toString());
        }
    }
}
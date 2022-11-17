package com.example.a2012500548_revandwiaditry_tugas06_ae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BelahKetupatActivity extends AppCompatActivity {
    EditText diagonal1, diagonal2;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belah_ketupat);
        diagonal1 = findViewById(R.id.d1);
        diagonal2 = findViewById(R.id.d2);
        hasil = findViewById(R.id.texthasil);
    }

    public void tombolhitung(View view) {
        String inputd1 = diagonal1.getText().toString();
        String inputd2 = diagonal2.getText().toString();

        if (TextUtils.isEmpty(inputd1)) {
            diagonal1.setError("Panjang Diagonal 1 Harus Di Isi");
            diagonal1.requestFocus();
        } else if (TextUtils.isEmpty(inputd2)) {
            diagonal2.setError("Panjang Diagonal 2 Harus Di Isi");
            diagonal2.requestFocus();
        } else {
            Double nilaid1 = Double.parseDouble(inputd1);
            Double nialid2 = Double.parseDouble(inputd2);
            Double hasillhitung = 0.5 * nilaid1 * nialid2;
            hasil.setText(hasillhitung.toString());
        }
    }
}
package com.example.a2012500548_revandwiaditry_tugas06_ae;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
    }

    public void persegipanjang(View view) {
        final AlertDialog.Builder panjangalert = new AlertDialog.Builder(MainActivity.this);
        panjangalert.setMessage("Apakah anda yakin ingin menghitung luas Persegi Panjang");
        panjangalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(MainActivity.this, PersegiPanjangActivity.class));
            }
        });
        panjangalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        panjangalert.show();
    }

    public void bujursangkar(View view) {
        final AlertDialog.Builder bujuralert = new AlertDialog.Builder(MainActivity.this);
        bujuralert.setMessage("Apakah anda yakin ingin menghitung luas Bujur Sangkar");
        bujuralert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    startActivity(new Intent(MainActivity.this, BujurSangkarActivity.class));
                }
        });
        bujuralert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
        });
        bujuralert.show();
    }
    
    public void segitiga(View view) {
        final AlertDialog.Builder segitigaalert = new AlertDialog.Builder(MainActivity.this);
        segitigaalert.setMessage("Apakah anda yakin ingin menghitung luas Segitiga");
        segitigaalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    startActivity(new Intent(MainActivity.this, SegitigaActivity.class));
                }
        });
        segitigaalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
        });
        segitigaalert.show();
    }
    
    public void lingkaran(View view) {
        final AlertDialog.Builder lingkaranalert = new AlertDialog.Builder(MainActivity.this);
        lingkaranalert.setMessage("Apakah anda yakin ingin menghitung luas Lingkaran");
        lingkaranalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    startActivity(new Intent(MainActivity.this, LingkaranActivity.class));
                }
        });
        lingkaranalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
        });
        lingkaranalert.show();
    }
    
    public void belahketupat(View view) {
        final AlertDialog.Builder ketupatalert = new AlertDialog.Builder(MainActivity.this);
        ketupatalert.setMessage("Apakah anda yakin ingin menghitung luas Belah Ketupat");
        ketupatalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    startActivity(new Intent(MainActivity.this, BelahKetupatActivity.class));
                }
        });
        ketupatalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
        });
        ketupatalert.show();
    }
    
    public void trapesium(View view) {
        final AlertDialog.Builder trapesiumalert = new AlertDialog.Builder(MainActivity.this);
        trapesiumalert.setMessage("Apakah anda yakin ingin menghitung luas Trapesium");
        trapesiumalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    startActivity(new Intent(MainActivity.this, TrapesiumActivity.class));
                }
        });
        trapesiumalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
        });
        trapesiumalert.show();
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder tombolkeluar = new AlertDialog.Builder(MainActivity.this);
        tombolkeluar.setMessage("Apakah Anda Yakin Ingin Keluar Dari Aplikasi Ini?");
        tombolkeluar.setTitle("Keluar Aplikasi");
        tombolkeluar.setIcon(R.drawable.alertbox);
        tombolkeluar.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();
            }
        });
        tombolkeluar.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        tombolkeluar.setNeutralButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        tombolkeluar.show();
    }

}
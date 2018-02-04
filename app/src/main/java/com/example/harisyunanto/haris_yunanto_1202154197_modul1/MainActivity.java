package com.example.harisyunanto.haris_yunanto_1202154197_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText makann, jumlahh;
    String Restoran,Menu;
    int Porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makann = (EditText) findViewById(R.id.makan);
        jumlahh = (EditText) findViewById(R.id.jumlah);
    }

    public void ABNORMAL(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        Restoran = "ABNORMAL";
        Menu = makann.getText().toString();
        Porsi = Integer.parseInt(jumlahh.getText().toString());
        int Harga = 30000*Porsi;
        Log.d("harga makan","Rp."+Harga);
        intent.putExtra("Restoran",Restoran);
        intent.putExtra("Menu", Menu);
        intent.putExtra("Porsi",Porsi);
        intent.putExtra("Harga",Harga);
        startActivity(intent);
    }

    public void EATBUS(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        String Restoran = "EATBUS";
        String Menu = makann.getText().toString();
        Porsi = Integer.parseInt(jumlahh.getText().toString());
        int Harga = 50000*Porsi;
        intent.putExtra("Restoran",Restoran);
        intent.putExtra("Menu", Menu);
        intent.putExtra("Porsi",Porsi);
        intent.putExtra("Harga",Harga);
        startActivity(intent);
    }
}

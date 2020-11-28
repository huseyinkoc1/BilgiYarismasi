package com.h5190027.ardatunc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.h5190027.ardatunc.R;
import com.h5190027.ardatunc.kategori;

public class OyunSonu extends AppCompatActivity implements View.OnClickListener {

    int gelenPuan ,gelenSoru;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun_sonu);

        init();
    }



    public void init(){

        Button btnOyunSonuCik ,btnOyunSonuDön;
        TextView txtHataPuan ,txtHataSoru;

        txtHataPuan = findViewById(R.id.txtOyunSonuPuan);
        txtHataSoru = findViewById(R.id.txtOyunSonuSoru);
        btnOyunSonuCik = findViewById(R.id.btnOyunSonuCik);
        btnOyunSonuDön = findViewById(R.id.btnOyunSonuDön);

        btnOyunSonuCik.setOnClickListener(this);
        btnOyunSonuDön.setOnClickListener(this);

        Intent intent = getIntent();
        gelenPuan=intent.getIntExtra("puan",0);
        gelenSoru=intent.getIntExtra("soru",0);
        txtHataPuan.setText(gelenPuan+" PUAN");
        txtHataSoru.setText((gelenSoru+1)+" SORU");

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnOyunSonuCik){
            System.exit(0);
            finish();
        }else if (v.getId()==R.id.btnOyunSonuDön){
            startActivity(new Intent(getApplicationContext(), kategori.class));
            finish();
        }
    }
}
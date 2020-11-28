package com.h5190027.ardatunc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.h5190027.ardatunc.R;

public class Hatali_Cevap extends AppCompatActivity  implements View.OnClickListener{

    int gelenSoru ,gelenPuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hatali__cevap);
        init();



    }



    public void init(){
        TextView txtHataPuan ,txtHataSoru;
        Button btnHataCik ,btnHataDön;

        txtHataPuan = findViewById(R.id.txtOyunSonuPuan);
        txtHataSoru = findViewById(R.id.txtOyunSonuSoru);
        btnHataCik = findViewById(R.id.btnOyunSonuCik);
        btnHataDön = findViewById(R.id.btnOyunSonuDön);

        btnHataCik.setOnClickListener(this);
        btnHataDön.setOnClickListener(this);

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
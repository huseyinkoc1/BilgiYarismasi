package com.h5190027.ardatunc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.h5190027.ardatunc.R;

public class kategori extends AppCompatActivity implements View.OnClickListener {

    TextView txtKategori ;
    Button btnTeknoloji, btnTarih, btnCikis;



    public void init()
    {
        txtKategori = findViewById(R.id.txtKategori);
        btnTeknoloji = findViewById(R.id.btnTeknoloji);
        btnTarih = findViewById(R.id.btnTarih);
        btnCikis = findViewById(R.id.btnCikis);

        btnCikis.setOnClickListener(this);
        btnTarih.setOnClickListener(this);
        btnTeknoloji.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        init();

        SharedPreferences sp = getSharedPreferences("com.h5170018.ardatunc", Context.MODE_PRIVATE);
        txtKategori.setText("Hoşgeldin "+sp.getString("kullanici","user").toUpperCase());

    }



    public void onClick(View v) {

        if (v.getId()==R.id.btnTeknoloji)
        {
            Intent intent = new Intent(kategori.this, oyun_ekrani.class);
            intent.putExtra("deger","teknoloji");
            //finish();
            startActivity(intent);
        }
        else if (v.getId()==R.id.btnTarih)
        {
            Intent intent = new Intent(kategori.this, oyun_ekrani.class);
            intent.putExtra("deger","tarih");
            //finish();
            startActivity(intent);
        }
        else if (v.getId()==R.id.btnCikis)
        {
            dialogGoster("Çıkış?","Uygulamadan Çıkış Yapılsın Mı?",true);
        }

    }

    public void dialogGoster(String baslik,String icerikYazisi,boolean vazgecebilsinMi){
        final Dialog dialog = new Dialog(kategori.this);
        dialog.setContentView(R.layout.dialog_islem);
        dialog.setCancelable(vazgecebilsinMi);


        TextView tvBaslik = dialog.findViewById(R.id.tvDialogBaslik);
        TextView tvIcerik = dialog.findViewById(R.id.tvDialogYazi);
        Button btnYenidenOyna = dialog.findViewById(R.id.btnYenidenOyna);
        Button btnOyundanCik = dialog.findViewById(R.id.btnOyundanCik);

        tvBaslik.setText(baslik);
        tvIcerik.setText(icerikYazisi);

        btnYenidenOyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //yenidenOyna();
                dialog.dismiss(); //dialog'u kapatır
            }
        });
        btnOyundanCik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss(); //dialog'u kapatır
                System.exit(0);
            }
        });

        //dialog.create();
        dialog.show();


    }
}
package com.h5190027.ardatunc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.h5190027.ardatunc.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class oyun_ekrani extends AppCompatActivity implements View.OnClickListener {

    TextView txtSoru, txtPuan, txtSoruBaslik;
    Button btnCevapA, btnCevapB, btnCevapC, btnCevapD;
    ArrayList <Soru> soruListesi;
    int soruIndex ,puan;
    String deger;
    Integer[] arr;



    public void init() {

        txtSoruBaslik = findViewById(R.id.tvSoruBaslik);
        txtSoru = findViewById(R.id.textView2);
        txtPuan = findViewById(R.id.textView3);
        btnCevapA = findViewById(R.id.btnCevapA);
        btnCevapB = findViewById(R.id.btnCevapB);
        btnCevapC = findViewById(R.id.btnCevapC);
        btnCevapD = findViewById(R.id.btnCevapD);

        btnCevapA.setOnClickListener(this);
        btnCevapB.setOnClickListener(this);
        btnCevapC.setOnClickListener(this);
        btnCevapD.setOnClickListener(this);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun_ekrani);

        soruIndex = 0; puan=0;

        init();
        soruYukle();


    }

    @Override
    public void onClick(View v) {

                if (v.getId()==R.id.btnCevapA){
                     if(soruListesi.get(arr[soruIndex]).getDogruYanit()=="A"){
                         new CountDownTimer(1000, 1500) {
                             @Override
                             public void onTick(long millisUntilFinished) {
                                 btnCevapA.setBackgroundResource(R.drawable.buton_stil3);//Cevap Doğru ise butonun rengini yeşil yap
                             }
                             @Override
                             public void onFinish() {
                                 btnCevapA.setBackgroundResource(R.drawable.button_selector); //Tekrar eski haline getir
                                 siradakiSoru();
                             }
                         }.start(); //Buton Renk Değişikliği
                         }else
                             {
                         new CountDownTimer(1000, 1000) {
                             @Override
                             public void onTick(long millisUntilFinished) {
                                 btnCevapA.setBackgroundResource(R.drawable.buton_stil4);
                                 dogru();
                             }
                             @Override
                             public void onFinish() {
                                 btnCevapA.setBackgroundResource(R.drawable.button_selector);
                                 //dialogGoster("Oyun bitti","Yanlış yanıt verdiğiniz için kaybettiniz.",false);
                                intent();
                             }
                         }.start(); //Buton Renk Değişikliği

                }} else if (v.getId()==R.id.btnCevapB) {
                    if (v.getId() == R.id.btnCevapB) {
                        if (soruListesi.get(arr[soruIndex]).getDogruYanit() == "B") {

                            new CountDownTimer(1000, 1500) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    btnCevapB.setBackgroundResource(R.drawable.buton_stil3);
                                }
                                @Override
                                public void onFinish() {
                                    btnCevapB.setBackgroundResource(R.drawable.button_selector);
                                    siradakiSoru();
                                }
                            }.start(); //Buton Renk Değişikliği

                             } else {
                                     new CountDownTimer(1000, 1000) {
                                         @Override
                                         public void onTick(long millisUntilFinished) {
                                             btnCevapB.setBackgroundResource(R.drawable.buton_stil4);
                                             dogru();
                                         }
                                         @Override
                                         public void onFinish() {
                                             btnCevapB.setBackgroundResource(R.drawable.button_selector);
                                             //dialogGoster("Oyun bitti","Yanlış yanıt verdiğiniz için kaybettiniz.",false);
                                             intent();
                                         }
                                     }.start(); //Buton Renk Değişikliği
                                 }

                }} else if (v.getId() == R.id.btnCevapC) {
                        if (v.getId() == R.id.btnCevapC) {
                            if (soruListesi.get(arr[soruIndex]).getDogruYanit() == "C") {
                                new CountDownTimer(1000, 1500) {
                                    @Override
                                    public void onTick(long millisUntilFinished) {
                                        btnCevapC.setBackgroundResource(R.drawable.buton_stil3);
                                    }
                                    @Override
                                    public void onFinish() {
                                        btnCevapC.setBackgroundResource(R.drawable.button_selector);
                                        siradakiSoru();
                                    }
                                }.start(); //Buton Renk Değişikliği
                             } else {

                                    new CountDownTimer(1000, 1000) {
                                    @Override
                                    public void onTick(long millisUntilFinished) {
                                        btnCevapC.setBackgroundResource(R.drawable.buton_stil4);
                                        dogru();
                                    }
                                    @Override
                                    public void onFinish() {
                                        btnCevapC.setBackgroundResource(R.drawable.button_selector);
                                        //dialogGoster("Oyun bitti","Yanlış yanıt verdiğiniz için kaybettiniz.",false);
                                        intent();
                                    }
                                }.start(); //Buton Renk Değişikliği

                                }

                }} else if (v.getId() == R.id.btnCevapD) {
                            if (v.getId() == R.id.btnCevapD) {
                             if (soruListesi.get(arr[soruIndex]).getDogruYanit().equals("D")) {
                                 new CountDownTimer(1000, 1500) {
                                     @Override
                                     public void onTick(long millisUntilFinished) {
                                         btnCevapD.setBackgroundResource(R.drawable.buton_stil3);
                                     }
                                     @Override
                                     public void onFinish() {
                                         btnCevapD.setBackgroundResource(R.drawable.button_selector);
                                         siradakiSoru();
                                     }
                                 }.start(); //Buton Renk Değişikliği
                             } else {
                                 new CountDownTimer(1000, 1000) {
                                     @Override
                                     public void onTick(long millisUntilFinished) {
                                         btnCevapD.setBackgroundResource(R.drawable.buton_stil4);
                                         dogru();
                                     }
                                     @Override
                                     public void onFinish() {
                                         btnCevapD.setBackgroundResource(R.drawable.button_selector);
                                         //dialogGoster("Oyun bitti","Yanlış yanıt verdiğiniz için kaybettiniz.",false);
                                         intent();
                                     }
                                 }.start(); //Buton Renk Değişikliği
                    }
                }

            }
        }



    public void soruYukle()
    {

        Intent intent = getIntent();
        deger = intent.getStringExtra("deger");
        if (deger.equals("teknoloji"))
        {
            soruListesi = new ArrayList<>();
            soruListesi.add(new Soru(0,"Java'nın Kurucu Şirketi Hangisidir?","Sun Microsystems","Oracle","IBM","Alphabet","A"));
            soruListesi.add(new Soru(1,"1 Bayt Kaç Bittir?","8","16","32","64","A"));
            soruListesi.add(new Soru(2,"Bilgisayar Tarihinin İlk Virüsü Hangisidir?","Melissa","WannaCry","Brain","Mydoom","C"));
            soruListesi.add(new Soru(3,"Harddiskte Veri Kaydedilen En Küçük Alana Ne Ad Verilir?","Cluster","Cylinder","Track","Sector","D"));
            soruListesi.add(new Soru(4,"F Klavyenin Mucidi Olarak Bilininen Eğitimci Yazar Kimdir?","Ali Akansu","İhsan Sıtkı Yener","Sinan Keten","Umut Yıldız","B"));
        }
        else if (intent.getStringExtra("deger").equals("tarih"))
        {
            soruListesi = new ArrayList<>();
            soruListesi.add(new Soru(0,"Cumhuriyetimizin Kuruluş Yılı Nedir?","1922","1921","1923","1924","C"));
            soruListesi.add(new Soru(1,"Tarihte Türk adıyla kurulan ilk Türk devleti hangisidir?","Göktürkler","Selçuklular","Avar Kağanlığı","Hazar Kağanlığı","A"));
            soruListesi.add(new Soru(2,"Sümer Devleti nerede kurulmuştur?","Orta Asya","Anadolu","Mezopotamya","Avrupa","C"));
            soruListesi.add(new Soru(3,"Malazgirt Meydan Savaşı hangi tarihte olmuştur?","1070","1072","1073","1071","D"));
            soruListesi.add(new Soru(4,"Sanayi Devrimi hangi ülkede başlamıştır?","Almanya","İngiltere","ABD","Fransa","B"));
        }

        arr = new Integer[5]; // Burada sorulistesinin boyutuna kadar olan sayılar rastgele sıralanarak bir dizi oluşturuldu. Amaç farklı soruları ekrana getirmek.
        for (int i = 0; i < soruListesi.size(); i++) {
            arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));


        txtSoruBaslik.setText(soruListesi.get(arr[0]).getSoruBaslik());
        btnCevapA.setText(soruListesi.get(arr[0]).getYanitA());
        btnCevapB.setText(soruListesi.get(arr[0]).getYanitB());
        btnCevapC.setText(soruListesi.get(arr[0]).getYanitC());
        btnCevapD.setText(soruListesi.get(arr[0]).getYanitD());
        txtSoru.setText((soruIndex+1)+". Soru");
        txtPuan.setText("Puan: "+puan);
    }

    public void siradakiSoru(){

        if (soruListesi.size()==(soruIndex+1)){
            Intent intent = new Intent(oyun_ekrani.this, OyunSonu.class);
            intent.putExtra("puan",puan+10);
            intent.putExtra("soru",soruIndex);
            finish();
            startActivity(intent);
        }
        else{
            soruIndex++;
            txtSoruBaslik.setText(soruListesi.get(arr[soruIndex]).getSoruBaslik());
            btnCevapA.setText(soruListesi.get(arr[soruIndex]).getYanitA());
            btnCevapB.setText(soruListesi.get(arr[soruIndex]).getYanitB());
            btnCevapC.setText(soruListesi.get(arr[soruIndex]).getYanitC());
            btnCevapD.setText(soruListesi.get(arr[soruIndex]).getYanitD());
            txtSoru.setText((soruIndex+1)+". Soru");
            puan+=10;
            txtPuan.setText("Puan: "+puan);
            dialogGoster("Tebrikler","Verdiğiniz Cevap Doğru",true);
        }

    }

    public void yenidenOyna(){
        startActivity(new Intent(getApplicationContext(), kategori.class));
    }

    public void dialogGoster(String baslik,String icerikYazisi,boolean vazgecebilsinMi){
        final Dialog dialog = new Dialog(oyun_ekrani.this);
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
                yenidenOyna();
            }
        });

        //dialog.create();
        dialog.show();


    }

    public void intent()
    {
        Intent intent = new Intent(oyun_ekrani.this, Hatali_Cevap.class);
        intent.putExtra("puan",puan);
        intent.putExtra("soru",soruIndex);
        //finish();
        startActivity(intent);
    }

    public void dogru(){

        if (soruListesi.get(arr[soruIndex]).getDogruYanit() == "A") {
            btnCevapA.setBackgroundResource(R.drawable.buton_stil3);
        }
        if (soruListesi.get(arr[soruIndex]).getDogruYanit() == "B") {
            btnCevapB.setBackgroundResource(R.drawable.buton_stil3);
        }
        if (soruListesi.get(arr[soruIndex]).getDogruYanit() == "C") {
            btnCevapC.setBackgroundResource(R.drawable.buton_stil3);
        }
        if (soruListesi.get(arr[soruIndex]).getDogruYanit() == "D") {
            btnCevapD.setBackgroundResource(R.drawable.buton_stil3);
        }


    }




}
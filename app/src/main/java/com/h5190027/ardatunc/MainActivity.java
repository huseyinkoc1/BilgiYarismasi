package com.h5190027.ardatunc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.h5190027.ardatunc.R;

public class MainActivity extends AppCompatActivity {

    EditText edtGiris ;
    Button button ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtGiris = findViewById(R.id.edtGiris);
        button  = findViewById(R.id.angry_btn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sp= getSharedPreferences("com.h5170018.ardatunc", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                String edt = edtGiris.getText().toString();
                if (edt.equals("")){

                    Toast.makeText(MainActivity.this, "Kullanıcı Adını Giriniz ",Toast.LENGTH_SHORT).show();
                }
                else{
                    editor.putString("kullanici",edt);
                    editor.commit();

                    Intent intent = new Intent(MainActivity.this, kategori.class);
                    finish();
                    startActivity(intent);
                }

            }
        });

    }


}
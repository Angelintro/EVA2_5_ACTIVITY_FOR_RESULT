package com.example.walmart.eva2_5_activity_for_result;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    TextView txtRecibido;
    Intent inSecundaria;
    final int DATOS_SECUNDARIA = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtRecibido = findViewById(R.id.txtRecibido);
        inSecundaria = new Intent(this,Secundaria.class);
    }
    public void click(View v){
        startActivityForResult(inSecundaria,DATOS_SECUNDARIA);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==DATOS_SECUNDARIA){
            if(resultCode == Activity.RESULT_OK){
                String sDatos = data.getStringExtra("dato");
                txtRecibido.setText(sDatos);
            }
        }
    }
}

package com.example.menuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actPesquisa(View view){
        Intent intPesq = new Intent(this, Pesquisa.class);
        this.startActivity(intPesq);
    }

    public void actTelefone(View view){
        Intent intTel = new Intent(this, Telefone.class);
        this.startActivity(intTel);
    }

    public void actEmail(View view){
        Intent intEmail = new Intent(this, Email.class);
        this.startActivity(intEmail);
    }
}
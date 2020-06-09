package com.example.menuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Pesquisa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa);
    }

    public void searchWeb(View view) {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        EditText edtText = (EditText)findViewById(R.id.tfPesq);
        intent.putExtra(SearchManager.QUERY, edtText.getText());
        if (intent.resolveActivity(getPackageManager()) != null) {
            this.startActivity(intent);
        }
    }
}
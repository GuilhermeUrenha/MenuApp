package com.example.menuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Telefone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefone);
    }

    public void DialNumber(View view) {
        EditText edtNumero = (EditText)findViewById(R.id.edtNumero);

        /*ArrayList<Character> strs = new ArrayList<Character>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != '-') {
                strs.add(str.charAt(i));
            }
            edtNumero.setText(str.charAt(i));
        } edtNumero.setText(str.replace(".[(-]",""));*/

        String num = edtNumero.getText().toString();//.replace("/[+-()]/",""));
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + num));
        if (intent.resolveActivity(this.getPackageManager()) != null) {
            this.startActivity(intent);
        }
    }
}
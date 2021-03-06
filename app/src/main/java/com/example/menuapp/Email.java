package com.example.menuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }

    public void SendEmail(View view) {
        EditText Address = findViewById(R.id.edtAddress);
        EditText Subject = findViewById(R.id.edtSubject);
        EditText Text = findViewById(R.id.edtText);

        String[] Addresses = { Address.getText().toString() };

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, Addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, Subject.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT, Text.getText().toString());
        if (intent.resolveActivity(this.getPackageManager()) != null) {
            this.startActivity(intent);
        }
    }
}
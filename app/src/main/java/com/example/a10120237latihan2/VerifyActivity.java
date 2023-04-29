package com.example.a10120237latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/*
10120237 Fadli Adhitia Mahardika IF-6
28 April 2023
*/

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void btnSend(View view){
        Intent intent = new Intent(this, UserHomeActivity.class);
        startActivity(intent);
    }
}

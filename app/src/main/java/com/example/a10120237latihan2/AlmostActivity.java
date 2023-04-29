package com.example.a10120237latihan2;

/*
10120237 Fadli Adhitia Mahardika IF-6
28 April 2023
*/

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }

    public void btnVerify(View view){
        Intent intent = new Intent(this, VerifyActivity.class);
        startActivity(intent);
    }
}

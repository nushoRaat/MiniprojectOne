package com.example.miniprojectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button login;
    EditText namelogged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(1000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();

        login = (Button) findViewById(R.id.login);
        namelogged = (EditText) findViewById(R.id.nametaken);

        login.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        String namestring = namelogged.getText().toString();

        Intent loginIntent = new Intent(MainActivity.this,Main2Activity.class);

        loginIntent.putExtra("nametaken",namestring);

        startActivity(loginIntent);
        Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();



    }
}

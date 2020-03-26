package com.example.miniprojectone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    TextView amedicinename,bmedicinename,cmedicinename,dmedicinename;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        amedicinename = (TextView) findViewById(R.id.amediname);

        // Bundle bundle = getIntent().getExtras();

        // String medName = bundle.getString("amediname");
         //amedicinename.setText(String.valueOf(medName));
    }
}

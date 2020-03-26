package com.example.miniprojectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    Button descriptionPage,tofenpage,details3,details4,details5,details6,details7,details8,details9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        descriptionPage = (Button) findViewById(R.id.buyone);
        descriptionPage.setOnClickListener(this);

        tofenpage = (Button) findViewById(R.id.buytwo);
        tofenpage.setOnClickListener(this);

        details3 = (Button) findViewById(R.id.buythree);
        details3.setOnClickListener(this);

        details4 = (Button) findViewById(R.id.buyfive);
        details4.setOnClickListener(this);

        details5 = (Button) findViewById(R.id.buysix);
        details5.setOnClickListener(this);

        details6 = (Button) findViewById(R.id.buyseven);
        details6.setOnClickListener(this);

        details7 = (Button) findViewById(R.id.buyeight);
        details7.setOnClickListener(this);

        details8 = (Button) findViewById(R.id.buynine);
        details8.setOnClickListener(this);

        details9 = (Button) findViewById(R.id.buyten);
        details9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.buyone){

            Intent gotoDescription = new Intent(Main3Activity.this,Main4Activity.class);
            startActivity(gotoDescription);
        }

        if (v.getId() == R.id.buytwo){

            Intent tofenintent = new Intent(Main3Activity.this,tofen.class);
            startActivity(tofenintent);
        }

        if (v.getId() == R.id.buythree){

            Intent tofenintent = new Intent(Main3Activity.this,tofen.class);
            startActivity(tofenintent);
        }

        if (v.getId() == R.id.buyfive){

            Intent tofenintent = new Intent(Main3Activity.this,tofen.class);
            startActivity(tofenintent);
        }

        if (v.getId() == R.id.buysix){

            Intent tofenintent = new Intent(Main3Activity.this,tofen.class);
            startActivity(tofenintent);
        }

        if (v.getId() == R.id.buyseven){

            Intent tofenintent = new Intent(Main3Activity.this,tofen.class);
            startActivity(tofenintent);
        }

        if (v.getId() == R.id.buyeight){

            Intent tofenintent = new Intent(Main3Activity.this,tofen.class);
            startActivity(tofenintent);
        }

        if (v.getId() == R.id.buynine){

            Intent tofenintent = new Intent(Main3Activity.this,tofen.class);
            startActivity(tofenintent);
        }

        if (v.getId() == R.id.buyten){

            Intent tofenintent = new Intent(Main3Activity.this,tofen.class);
            startActivity(tofenintent);
        }


    }
}

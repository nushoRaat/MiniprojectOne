package com.example.miniprojectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class tofen extends AppCompatActivity implements View.OnClickListener {

    ImageView imgOne,imgTwo;
    Button viewlistButton,cartButton,addToCartButton;
    Button websiteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tofen);

        imgOne = (ImageView) findViewById(R.id.tofen1);
        imgOne.setOnClickListener(this);

        imgTwo = (ImageView) findViewById(R.id.tofen2);
        imgTwo.setOnClickListener(this);

        viewlistButton = (Button) findViewById(R.id.tofenlist);
        viewlistButton.setOnClickListener(this);

        addToCartButton = (Button) findViewById(R.id.cartButton3);

        //medBought = (TextView) findViewById(R.id.nameTocart);

        addToCartButton.setOnClickListener(this);

        cartButton = (Button) findViewById(R.id.gotoCart3);
        cartButton.setOnClickListener(this);

        websiteButton = (Button) findViewById(R.id.webbutton);
        websiteButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        if (v.getId() == R.id.tofen1){

            imgOne.setVisibility(View.GONE);
            imgTwo.setVisibility(View.VISIBLE);
        }
        if  (v.getId() == R.id.tofen2){

            imgOne.setVisibility(View.VISIBLE);
            imgTwo.setVisibility(View.GONE);
        }
        if(v.getId() == R.id.tofenlist){

            Intent listintent = new Intent(tofen.this,Main3Activity.class);
            startActivity(listintent);

        }

        if(v.getId() == R.id.gotoCart3){

            Intent cartintent = new Intent(tofen.this,Main5Activity.class);

            startActivity(cartintent);

        }

        if(v.getId() == R.id.cartButton3){


            Toast.makeText(tofen.this,"Added to cart",Toast.LENGTH_SHORT).show();

        }

        if(v.getId() == R.id.webbutton){

           web_clicked("https://medex.com.bd/brands/3745/tofen-1mg");

        }


    }

    public void  web_clicked(String url){

        Intent webintent = new Intent(Intent.ACTION_VIEW);
        webintent.setData(Uri.parse(url));
        startActivity(webintent);


    }
}

package com.example.miniprojectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView imgOne,imgTwo;
    Button viewlistButton,cartButton,addToCartButton;
    TextView medBought;
    Button wesiteButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        imgOne = (ImageView) findViewById(R.id.anapa);
        imgOne.setOnClickListener(this);

        imgTwo = (ImageView) findViewById(R.id.bnapa);
        imgTwo.setOnClickListener(this);

        viewlistButton = (Button) findViewById(R.id.listButton);
        viewlistButton.setOnClickListener(this);

        addToCartButton = (Button) findViewById(R.id.cartButton);

         medBought = (TextView) findViewById(R.id.nameTocart);

        addToCartButton.setOnClickListener(this);

        cartButton = (Button) findViewById(R.id.gotoCart);
        cartButton.setOnClickListener(this);

        wesiteButton2 = (Button) findViewById(R.id.webbutton2);
        wesiteButton2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


      if (v.getId() == R.id.anapa){

          imgOne.setVisibility(View.GONE);
          imgTwo.setVisibility(View.VISIBLE);
        }
      if  (v.getId() == R.id.bnapa){

            imgOne.setVisibility(View.VISIBLE);
            imgTwo.setVisibility(View.GONE);
        }
      if(v.getId() == R.id.listButton){

          Intent listintent = new Intent(Main4Activity.this,Main3Activity.class);
          startActivity(listintent);

      }

        if(v.getId() == R.id.gotoCart){

            Intent cartintent = new Intent(Main4Activity.this,Main5Activity.class);

            startActivity(cartintent);

        }

        if(v.getId() == R.id.cartButton){

            String medstring = medBought.getText().toString();

            Intent intent = new Intent(Main4Activity.this,Main5Activity.class);
            intent.putExtra("abc",medstring);
            //startActivity(intent);

            Toast.makeText(Main4Activity.this,"Added to cart",Toast.LENGTH_SHORT).show();

        }

        if(v.getId() == R.id.webbutton2){

            web_clicked("https://medex.com.bd/brands/10452/napa-500mg");

        }




    }


    public void  web_clicked(String url){

        Intent webintent = new Intent(Intent.ACTION_VIEW);
        webintent.setData(Uri.parse(url));
        startActivity(webintent);


    }
}

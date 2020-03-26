package com.example.miniprojectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive,buttonSix;
    TextView nametakenlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nametakenlog = (TextView) findViewById(R.id.nametaken);

        Bundle bundle = getIntent().getExtras();

        String nametakenl = bundle.getString("nametaken");
        nametakenlog.setText(nametakenl);

        buttonOne = (Button) findViewById(R.id.buttonone);
        buttonOne.setOnClickListener(this);

        buttonTwo = (Button) findViewById(R.id.buttontwo);
        buttonTwo.setOnClickListener(this);

        buttonThree = (Button) findViewById(R.id.buttonthree);
        buttonThree.setOnClickListener(this);

        buttonFour = (Button) findViewById(R.id.buttonfour);
        buttonFour.setOnClickListener(this);

        buttonFive = (Button) findViewById(R.id.buttonfive);
        buttonFive.setOnClickListener(this);

        buttonSix = (Button) findViewById(R.id.buttonsix);
        buttonSix.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.buttonone){
        Intent nextpageOne = new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(nextpageOne);}

        if (v.getId() == R.id.buttontwo){
        Intent nextpageTwo = new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(nextpageTwo);}

        if (v.getId() == R.id.buttonthree){
            Intent nextpageThree = new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(nextpageThree);}

        if (v.getId() == R.id.buttonfour){
            Intent nextpagefour = new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(nextpagefour);}

        if (v.getId() == R.id.buttonfive){
            Intent nextpageFive = new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(nextpageFive);}

        if (v.getId() == R.id.buttonsix){
            Intent nextpageSix = new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(nextpageSix);}



    }
}

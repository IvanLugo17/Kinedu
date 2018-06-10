package com.example.ivan.kinedu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class healthinterest extends AppCompatActivity {
    ImageButton BreastFeedingImg;
    int contBF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthinterest);

        for (int i =1; i <= 10000;i++){
            BreastFeeding();
        }
    }

    public void BreastFeeding() {

        BreastFeedingImg = (ImageButton) findViewById(R.id.BreastFeedingImg);

        BreastFeedingImg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

            contBF = 1;
            BreastFeedingImg.setBackgroundColor(Color.RED);
                BreastFeedingdes();
            }

        });

    }
    public void BreastFeedingdes() {

        BreastFeedingImg = (ImageButton) findViewById(R.id.BreastFeedingImg);

        BreastFeedingImg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                contBF = 0;
                BreastFeedingImg.setBackgroundColor(Color.WHITE);

            }

        });

    }
}

package com.londonappbrewery.magiceightball;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView8Ball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        

        imageView8Ball = findViewById(R.id.imageView8Ball);
        final Button buttonAsk = findViewById(R.id.buttonAsk);

        final int[] answerBallArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        buttonAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView8Ball.setImageResource(answerBallArray[getRandomNumber(5)]);
            }
        });
    }


    public int getRandomNumber(int upperBound){
        return new Random().nextInt(upperBound);
    }

}

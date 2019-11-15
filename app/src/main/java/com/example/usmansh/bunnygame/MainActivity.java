package com.example.usmansh.bunnygame;

import android.graphics.drawable.AnimationDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {

    ImageButton bunny1,bunny2,bunny3;
    ImageButton bunny4,bunny5,bunny6;
    ImageButton bunny7,bunny8,bunny9;
    Button startbt;
    TextView tv_score,tv_left;
    Random rand;

    int score = 0, left = 5, fps = 1000,tempifleft=0;
    int which = 0;
    int whichsave = 0;

    AnimationDrawable an;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rand = new Random();

        bunny1 = (ImageButton)findViewById(R.id.bunny1);
        bunny2 = (ImageButton)findViewById(R.id.bunny2);
        bunny3 = (ImageButton)findViewById(R.id.bunny3);

        bunny4 = (ImageButton)findViewById(R.id.bunny4);
        bunny5 = (ImageButton)findViewById(R.id.bunny5);
        bunny6 = (ImageButton)findViewById(R.id.bunny6);

        bunny7 = (ImageButton)findViewById(R.id.bunny7);
        bunny8 = (ImageButton)findViewById(R.id.bunny8);
        bunny9 = (ImageButton)findViewById(R.id.bunny9);

        startbt= (Button)findViewById(R.id.start);
        tv_score= (TextView)findViewById(R.id.tv_score);
        tv_left = (TextView)findViewById(R.id.tv_left);

        bunny1.setVisibility(View.INVISIBLE);
        bunny2.setVisibility(View.INVISIBLE);
        bunny3.setVisibility(View.INVISIBLE);
        bunny4.setVisibility(View.INVISIBLE);
        bunny5.setVisibility(View.INVISIBLE);
        bunny6.setVisibility(View.INVISIBLE);
        bunny7.setVisibility(View.INVISIBLE);
        bunny8.setVisibility(View.INVISIBLE);
        bunny9.setVisibility(View.INVISIBLE);


        startbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                left = 5;
                tv_left.setText("LEFT : "+left);

                score = 0;
                tv_score.setText("SCORE : "+score);

                android.os.Handler handler = new android.os.Handler();

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        theGameActions();
                    }
                }, 1000);

                startbt.setEnabled(false);
            }
        });


        bunny1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tempifleft = 1;
                bunny1.setImageResource(R.drawable.hit);

                score = score+1;
                tv_score.setText("SCORE: "+score);

                bunny1.setEnabled(false);
            }
        });


        bunny2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tempifleft = 1;
                bunny2.setImageResource(R.drawable.hit);

                score = score+1;
                tv_score.setText("SCORE: "+score);

                bunny2.setEnabled(false);

            }
        });


        bunny3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                tempifleft = 1;
                bunny3.setImageResource(R.drawable.hit);

                score = score+1;
                tv_score.setText("SCORE: "+score);

                bunny3.setEnabled(false);
            }
        });



        bunny4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tempifleft = 1;
                bunny4.setImageResource(R.drawable.hit);

                score = score+1;
                tv_score.setText("SCORE: "+score);

                bunny4.setEnabled(false);
            }
        });



        bunny5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tempifleft = 1;
                bunny5.setImageResource(R.drawable.hit);

                score = score+1;
                tv_score.setText("SCORE: "+score);

                bunny5.setEnabled(false);
            }
        });



        bunny6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tempifleft = 1;
                bunny6.setImageResource(R.drawable.hit);

                score = score+1;
                tv_score.setText("SCORE: "+score);

                bunny6.setEnabled(false);
            }
        });


        bunny7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tempifleft = 1;
                bunny7.setImageResource(R.drawable.hit);

                score = score+1;
                tv_score.setText("SCORE: "+score);

                bunny7.setEnabled(false);
            }
        });



        bunny8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tempifleft = 1;
                bunny8.setImageResource(R.drawable.hit);

                score = score+1;
                tv_score.setText("SCORE: "+score);

                bunny8.setEnabled(false);
            }
        });



        bunny9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tempifleft = 1;
                bunny9.setImageResource(R.drawable.hit);

                score = score+1;
                tv_score.setText("SCORE: "+score);

                bunny9.setEnabled(false);
            }
        });



    }



    public  void theGameActions(){

        if(score < 10){
            fps = 1000;
        }else if( score >=10 && score <15){
            fps = 950;
        }else if( score >=15 && score <20){
            fps = 900;
        }else if( score >=20 && score <25){
            fps = 850;
        }else if( score >=25 && score <30){
            fps = 800;
        }else if( score >=30 && score <35){
            fps = 750;
        }else if( score >=35 && score <40){
            fps = 700;
        }else if( score >=40 && score <45){
            fps = 650;
        }else if( score >=45 && score <50 ){
            fps = 600;
        }else if( score >=50 && score <55){
            fps = 550;
        }else if( score >=55 && score <60){
            fps = 500;
        }else if( score >=60 && score <65){
            fps = 450;
        }else if( score >=65 && score <70){
            fps = 400;
        }else if( score >=70 && score <75){
            fps = 350;
        }

        an = (AnimationDrawable) ContextCompat.getDrawable(this,R.drawable.anim);

        do{

            which = rand.nextInt(9) + 1;

        }while(which == whichsave);

        whichsave = which;

        if(which == 1){
            bunny1.setImageDrawable(an);
            bunny1.setVisibility(View.VISIBLE);
            bunny1.setEnabled(true);
        }else if (which == 2) {
            bunny2.setImageDrawable(an);
            bunny2.setVisibility(View.VISIBLE);
            bunny2.setEnabled(true);
        }else if (which == 3){

            bunny3.setImageDrawable(an);
            bunny3.setVisibility(View.VISIBLE);
            bunny3.setEnabled(true);
        }else if (which == 4){

            bunny4.setImageDrawable(an);
            bunny4.setVisibility(View.VISIBLE);
            bunny4.setEnabled(true);
        }else if (which == 5){

            bunny5.setImageDrawable(an);
            bunny5.setVisibility(View.VISIBLE);
            bunny5.setEnabled(true);
        }else if (which == 6){

            bunny6.setImageDrawable(an);
            bunny6.setVisibility(View.VISIBLE);
            bunny6.setEnabled(true);
        }else if (which == 7){

            bunny7.setImageDrawable(an);
            bunny7.setVisibility(View.VISIBLE);
            bunny7.setEnabled(true);
        }else if (which == 8){

            bunny8.setImageDrawable(an);
            bunny8.setVisibility(View.VISIBLE);
            bunny8.setEnabled(true);
        }else if (which == 9){

            bunny9.setImageDrawable(an);
            bunny9.setVisibility(View.VISIBLE);
            bunny9.setEnabled(true);
        }


        an.start();


        android.os.Handler handler  = new android.os.Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                bunny1.setVisibility(View.INVISIBLE);
                bunny2.setVisibility(View.INVISIBLE);
                bunny3.setVisibility(View.INVISIBLE);
                bunny4.setVisibility(View.INVISIBLE);
                bunny5.setVisibility(View.INVISIBLE);
                bunny6.setVisibility(View.INVISIBLE);
                bunny7.setVisibility(View.INVISIBLE);
                bunny8.setVisibility(View.INVISIBLE);
                bunny9.setVisibility(View.INVISIBLE);

                bunny1.setEnabled(false);
                bunny2.setEnabled(false);
                bunny3.setEnabled(false);
                bunny4.setEnabled(false);
                bunny5.setEnabled(false);
                bunny6.setEnabled(false);
                bunny7.setEnabled(false);
                bunny8.setEnabled(false);
                bunny9.setEnabled(false);



                if(tempifleft == 0 ){
                    left = left -1;
                    tv_left.setText("LEFT: "+left);

                }else if (tempifleft == 1){

                    tempifleft = 0;
                }


                if(left == 0){
                    Toast.makeText(MainActivity.this, "Game over", Toast.LENGTH_SHORT).show();
                    startbt.setEnabled(true);
                }else if (left > 0){
                    theGameActions();
                }
            }
        },fps);
    }



}

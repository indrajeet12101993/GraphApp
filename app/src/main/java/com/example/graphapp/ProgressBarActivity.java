package com.example.graphapp;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.shuhart.stepview.StepView;

import java.util.ArrayList;

public class ProgressBarActivity extends AppCompatActivity {
    ProgressBar vertical_progressbar1;
    ProgressBar vertical_progressbar2;
    ProgressBar vertical_progressbar3;
    ProgressBar vertical_progressbar4;
    int intValue = 0;
    int intValue1 = 0;
    Handler handler = new Handler();
    TextView tv1,tv10;
    TextView tv2,tv11;
    TextView tv4,tv5;
    TextView tv12,tv13;
    TextView tvprice1,tvprice2,tvprice3,tvprice4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        vertical_progressbar1 = (ProgressBar)findViewById(R.id.vertical_progressbar1);
        vertical_progressbar2 = (ProgressBar)findViewById(R.id.vertical_progressbar2);
        vertical_progressbar3 = (ProgressBar)findViewById(R.id.vertical_progressbar3);
        vertical_progressbar4 = (ProgressBar)findViewById(R.id.vertical_progressbar4);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv10 = findViewById(R.id.tv10);
        tv11 = findViewById(R.id.tv11);
        tv12 = findViewById(R.id.tv12);
        tv13 = findViewById(R.id.tv13);
        tvprice1 = findViewById(R.id.tvprice1);
        tvprice2 = findViewById(R.id.tvprice2);
        tvprice3 = findViewById(R.id.tvprice3);
        tvprice4 = findViewById(R.id.tvprice4);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle_red));
                tv2.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv4.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv5.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                intValue=0;
                progress(10,20,30,40);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv2.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle_red));
                tv4.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv5.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                intValue=0;
                progress(20,30,40,50);
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv2.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv4.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle_red));
                tv5.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                intValue=0;
                progress(30,40,50,60);
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv2.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv4.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv5.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle_red));
                intValue=0;
                progress(40,50,60,70);
            }
        });
        tv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tv1.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle_red));
               tv2.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
               tv4.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
               tv5.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
               intValue=0;
                progress(10,20,30,40);

            }
        });
        tv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv2.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle_red));
                tv4.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv5.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                intValue=0;
                progress(20,30,40,50);
            }
        });
        tv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv2.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv4.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle_red));
                tv5.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                intValue=0;
                progress(30,40,50,60);
            }
        });
        tv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv2.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv4.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle));
                tv5.setBackground(ContextCompat.getDrawable(ProgressBarActivity.this,R.drawable.circle_red));
                intValue=0;
                progress(40,50,60,70);

            }
        });




            }

    private void progress(final int i, final int i1, final int i2, final int i3) {

        new Thread(new Runnable() {

            @Override
            public void run() {
                while(intValue < 100)
                {
                    intValue++;
                    handler.post(new Runnable() {

                        @Override
                        public void run() {
                            if(intValue<i)
                            {
                                vertical_progressbar1.setProgress(intValue);
                                tvprice1.setText(String.valueOf("\u20B9"+""+i*1000));
                            }


                            if(intValue<i1)
                            {
                                vertical_progressbar2.setProgress(intValue);
                                tvprice2.setText(String.valueOf("\u20B9"+""+i1*1000));
                            }

                            if(intValue<i2)
                            {
                                vertical_progressbar3.setProgress(intValue);
                                tvprice3.setText(String.valueOf("\u20B9"+""+i2*1000));
                            }
                            if(intValue<i3)
                            {
                                vertical_progressbar4.setProgress(intValue);
                                tvprice4.setText(String.valueOf("\u20B9"+""+i3*1000));
                            }


                        }
                    });
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }



}

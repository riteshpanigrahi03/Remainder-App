package com.example.ritesh.mymomtimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView timing=(TextView)findViewById(R.id.timer);
        final TextView result =(TextView)findViewById(R.id.done);
        final ImageView iv =(ImageView)findViewById(R.id.imageView);
       /* EditText input=(EditText)findViewById(R.id.inputtext);
        Scanner sc = new Scanner(System.in);
        System.out.print("enter time");
        int time=sc.nextInt();

        String stime=String.valueOf(time);

        input.setText(stime);*/


        new CountDownTimer(10000,1000){
            @Override
            public void onTick(long millisecuntilfinished) {
               timing.setText(String.valueOf(millisecuntilfinished/1000));
            }

            @Override
            public void onFinish() {
               result.setText("DONE..!!!");
               // result.animate().alpha(0);
               // iv.animate().alpha(1);
                iv.setVisibility(View.VISIBLE);
            }
        }.start();
    }
}

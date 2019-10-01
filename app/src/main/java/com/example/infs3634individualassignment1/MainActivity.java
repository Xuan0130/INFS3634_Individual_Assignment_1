package com.example.infs3634individualassignment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    private Button butt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        int belt;

        TextView timesyd = (TextView) findViewById(R.id.editText4);
        TextView timetk = (TextView) findViewById(R.id.editText5);
        TextView timebj = (TextView) findViewById(R.id.editText6);
        TextView timeny = (TextView) findViewById(R.id.editText7);
        TextView timese = (TextView) findViewById(R.id.editText8);



        timesyd.setText(date(10));
        timetk.setText(date(9));
        timebj.setText(date(8));
        timeny.setText(date(-4));
        timese.setText(date(9));

        butt = findViewById(R.id.button2);
        butt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                moveToActivityTwo();
            }

        });


     }
        private void moveToActivityTwo(){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);

        }


        public static String date(int num){
        TimeZone timezone = TimeZone.getTimeZone("GMT" + num);
        Calendar c = Calendar.getInstance(timezone);
        DateFormat df = new SimpleDateFormat("h:mm a");
        df.setCalendar(c);
        df.setTimeZone(timezone);
        String result = df.format(c.getTime());

        return result;


        }
    }



package com.example.infs3634individualassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class SecondActivity extends AppCompatActivity {
    private Button butt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

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

        butt2 = findViewById(R.id.button);
        butt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                moveToMainActivity();
            }
        });

    }
    private void moveToMainActivity(){
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public static String date(int num){
        TimeZone timezone = TimeZone.getTimeZone("GMT" + num);
        Calendar c = Calendar.getInstance(timezone);
        DateFormat df = new SimpleDateFormat("HH:mm");
        df.setCalendar(c);
        df.setTimeZone(timezone);
        String result = df.format(c.getTime());

        return result;


    }
}

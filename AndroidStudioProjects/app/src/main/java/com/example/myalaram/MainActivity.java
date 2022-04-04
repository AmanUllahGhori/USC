package com.example.myalaram;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText hour,min;
    Context context;
    Button set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hour=findViewById(R.id.hour);
        min=findViewById(R.id.min);
        set=findViewById(R.id.set);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int minut=Integer.parseInt(min.getText().toString());
                int housr=Integer.parseInt(hour.getText().toString());
                Calendar calendar=Calendar.getInstance();
                calendar.set(Calendar.HOUR_OF_DAY,housr);
                calendar.set(Calendar.MINUTE,minut);
//                calendar.set(Calendar.SECOND,30);
                Intent intent=new Intent(MainActivity.this,Notification_receiver.class);
                PendingIntent pendingIntent=PendingIntent.getBroadcast(getApplicationContext(),100,
                        intent,0);
                AlarmManager alarmManager=(AlarmManager) getSystemService(ALARM_SERVICE);
                alarmManager.setRepeating(AlarmManager.RTC,calendar.getTimeInMillis(),
                        AlarmManager.INTERVAL_DAY, pendingIntent);
                alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime()+60*1000,pendingIntent);
            }
        });

//        Intent intent = new Intent(context, Receive.class);
//        PendingIntent alarmIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTimeInMillis(System.currentTimeMillis());
//        calendar.set(Calendar.MINUTE, minut);
//        calendar.set(Calendar.HOUR_OF_DAY,hours);
//        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
//        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 1000 * 60, alarmIntent);


    }

}
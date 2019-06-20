package com.example; 

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;
    TextView textView;
    final String TAG = "LogcatTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timePicker = (TimePicker) findViewById(R.id.myTimePicker);
        textView = (TextView) findViewById(R.id.myTextView);
        Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show();

        timePicker.setOnTimeChangedListener(

                new TimePicker.OnTimeChangedListener() {
                    @Override
                    public void onTimeChanged(TimePicker timePicker,
                                              int hour, int minute) {
                        textView.setText("T=" + hour + ":" + minute);
                    }
                }

        );

        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy(); Log.i(TAG,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();  Log.i(TAG,"onPause");
    }

    @Override
    protected void onStart() {
        super.onStart(); Log.i(TAG,"onStart");
    }

    @Override
    protected void onStop() {
        super.onStop(); Log.i(TAG,"onStop");
    }

    @Override
    protected void onResume() {
        super.onResume(); Log.i(TAG,"onResume");
    }

    @Override
    protected void onRestart(){
        super.onRestart(); Log.i(TAG,"onRestart");
    }

}

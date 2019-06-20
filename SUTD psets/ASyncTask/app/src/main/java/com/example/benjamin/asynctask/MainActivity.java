package com.example.benjamin.asynctask;

//—copy and paste code from this place onwards 

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textViewResult;
    EditText editTextNumIters;
    Button buttonRun;
    int n;
    double pi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1 - implement the callback and other necessary tasks
        editTextNumIters = findViewById(R.id.editTextNumIters);



        textViewResult = findViewById(R.id.textViewResult);


        buttonRun = findViewById(R.id.buttonRun);
        buttonRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String content = editTextNumIters.getText().toString();

                if (content == "") {
                    Toast.makeText(MainActivity.this, "Please enter a value", Toast.LENGTH_LONG).show();
                } else {
                    try {
                        int num = Integer.parseInt(content);
                        Log.i("test",num+" is a number");
                        new EstimatePi().execute(num);

                    } catch (NumberFormatException e) {
                        Log.i("test"," is not a number");
                        Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_LONG).show();
                    }
                }


            }
        });

    }

    //TODO 2 - Implement the necessary methods
    public class EstimatePi extends AsyncTask<Integer,Double, Double>{
        int i;
        int count;

        @Override
        protected Double doInBackground(Integer... integers) {
            count = 0;

            n = Integer.parseInt(editTextNumIters.getText().toString());
            Log.i("test",n+" is the value of n");

            for (i = 0; i < n; i++) {
                double x = Math.random();
                double y = Math.random();


                if (Math.pow(x,2) + Math.pow(y,2) <= 1) {
                    count++;
                }

                if (i % 1000000 == 0) {
                    double currentPi = 4.0 * count / n;
                    publishProgress(currentPi);
                }

            }

            Log.i("test",count+" is the value of count");
            double pi = 4.0 * count / n;
            Log.i("test",pi +" is the value of pi");
            return pi;
        }

        @Override
        protected void onPostExecute(Double piVal) {
            //super.onPostExecute(doubles);
            Log.i("test",piVal +" is the value of piVal");
            textViewResult.setText("After " + n + " iterations, the estimate of pi is: " + piVal);
        }

        @Override
        protected void onProgressUpdate(Double... currentPi) {
            textViewResult.setText("After " + i + " iterations, the estimate of pi is: " + currentPi[0]);


            //textViewResult.setText("After " + n + " iterations, the estimate of pi is: " + pi);

            //TextView.getText() + "\nCompleted...." + progress[0] + "%");
        }

    }


}

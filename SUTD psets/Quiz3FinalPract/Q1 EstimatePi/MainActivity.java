package com.example;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1 - implement the callback and other necessary tasks

    }

    //TODO 2 - Implement the necessary methods
    public class EstimatePi extends AsyncTask<Integer,Integer, Integer>{


    }


}

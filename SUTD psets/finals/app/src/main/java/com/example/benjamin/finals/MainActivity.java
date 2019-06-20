package com.example.benjamin.finals;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //DO NOT MODIFY THE INSTANCE VARIABLE NAMES INCLUDED BELOW
    //YOU MAY ADD YOUR OWN


    EditText editTextFaceValue;
    EditText editTextSellingPrice;
    EditText editTextAnnualInterest;
    EditText editTextDuration;
    Button buttonCalculateYield;
    TextView textViewResult;
    final String sharedPrefFile = "sharedPref";
    SharedPreferences sharedPreferences;
    final String KEY_FACEVALUE = "faceValue";
    final String KEY_SELLINGPRICE = "sellingPrice";
    final String KEY_ANNUALINTEREST = "annualInterest";
    final String KEY_DURATION = "duration";
    final String EMPTY_STRING = "";
    final String TAG = "Logcat";

    double faceValue;
    double sellingPrice;
    double annualInterest;
    double duration;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE); //create shared preferences


        editTextFaceValue = findViewById(R.id.editTextFaceValue);
        editTextSellingPrice = findViewById(R.id.editTextSellingPrice);
        editTextAnnualInterest = findViewById(R.id.editTextAnnualInterest);
        editTextDuration = findViewById(R.id.editTextDuration);

        textViewResult = findViewById(R.id.textViewResult);
        buttonCalculateYield = findViewById(R.id.buttonCalculateYield);


        //shared pref
        faceValue = sharedPreferences.getInt(KEY_FACEVALUE, 0);
        sellingPrice = sharedPreferences.getInt(KEY_SELLINGPRICE, 0);
        annualInterest = sharedPreferences.getInt(KEY_ANNUALINTEREST, 0);
        duration = sharedPreferences.getInt(KEY_DURATION, 0);


        buttonCalculateYield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String faceValueString = editTextFaceValue.getText().toString();
                String sellingPriceString = editTextSellingPrice.getText().toString();
                String annualInterestString = editTextAnnualInterest.getText().toString();
                String durationString = editTextDuration.getText().toString();

                if (faceValueString.equals("") || sellingPriceString.equals("") || annualInterestString.equals("") || durationString.equals("")) {
                    Toast.makeText(MainActivity.this, "please fill in all the details", Toast.LENGTH_LONG).show();
                } else {

                    try {
                        faceValue = Double.parseDouble(faceValueString);
                        sellingPrice = Double.parseDouble(sellingPriceString);
                        annualInterest = Double.parseDouble(annualInterestString);
                        duration = Double.parseDouble(durationString);

                        new CalculateYield().execute();
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(MainActivity.this, "please key in appropriate values", Toast.LENGTH_LONG).show();
                    }

                }
            }
        });


        SharedPreferences.Editor editor = sharedPreferences.edit(); //open a editor
        editor.putFloat(KEY_DURATION, (float) duration);
        editor.putFloat(KEY_FACEVALUE, (float) faceValue);
        editor.putFloat(KEY_SELLINGPRICE, (float) sellingPrice);
        editor.putFloat(KEY_ANNUALINTEREST, (float) annualInterest);
        editor.commit();    //commit the changes


    }

    public class CalculateYield extends AsyncTask<Double,Double, Double> {

        @Override
        protected Double doInBackground(Double... doubles) {
            Bond.BondBuilder bondBuilder = new Bond.BondBuilder();
            Bond bondApp = bondBuilder
                    .setDuration(duration)
                    .setFaceValue(faceValue)
                    .setSellingPrice(sellingPrice)
                    .setInterestPayment(annualInterest).createBond();
            if (annualInterest == 0) {
                Log.d(TAG, "annualinterest is 0");
                bondApp.setYieldCalculation(new ZeroCouponYield());
            } else {
                Log.d(TAG, "annualinterest is NOT 0");
                bondApp.setYieldCalculation(new WithCouponYield());
            }

            double result = bondApp.calculateYTM();
            //here we change result to percentage
            result = result * 100;
            return result;
        }

        @Override
        protected void onPostExecute(Double result) {
            //super.onPostExecute(doubles);
            String resultString = "" + result;
            textViewResult.setText(resultString);
        }
    }

}

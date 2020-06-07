package com.gzeinnumer.cektimerange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity_";

    String[] timeDef = {
            "000","001", //1 //0,1
            "002","003", //2 //2,3
            "004","005", //3 //4,5
            "006","007", //4 //6,7
            "008","009", //5 //8,9
            "010","011", //6 //10,11
            "012","013", //7 //12,13
            "014","015", //8 //14,15
            "016","017", //9 //16,17
            "018","019", //10 //18,19
            "020","021", //11 //20,21
            "022","023"  //12 //22,23
    };

    String[] time = timeDef;

    int sum = 2;
    int[] rangeSum = new int[sum];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleDateFormat sdf = new SimpleDateFormat("HHH", Locale.getDefault());
        String currentHour = sdf.format(new Date());
        Log.d(TAG, "onCreate: "+currentHour);

        int index = Arrays.asList(time).indexOf(currentHour);
        Log.d(TAG, "onCreate: "+index);

        if (index == 0 || index == 1){
            rangeSum[0] = 0;
            rangeSum[1] = 1;
        } else if(index == 2 || index == 3){
            rangeSum[0] = 2;
            rangeSum[1] = 3;
        } else if(index == 4 || index == 5){
            rangeSum[0] = 4;
            rangeSum[1] = 5;
        } else if(index == 6 || index == 7){
            rangeSum[0] = 6;
            rangeSum[1] = 7;
        } else if(index == 8 || index == 9){
            rangeSum[0] = 8;
            rangeSum[1] = 9;
        } else if(index == 10 || index == 11){
            rangeSum[0] = 10;
            rangeSum[1] = 11;
        } else if(index == 12 || index == 13){
            rangeSum[0] = 12;
            rangeSum[1] = 13;
        } else if(index == 14 || index == 15){
            rangeSum[0] = 14;
            rangeSum[1] = 15;
        } else if(index == 16 || index == 17){
            rangeSum[0] = 16;
            rangeSum[1] = 17;
        } else if(index == 18 || index == 19){
            rangeSum[0] = 18;
            rangeSum[1] = 19;
        } else if(index == 20 || index == 21){
            rangeSum[0] = 20;
            rangeSum[1] = 21;
        } else if(index == 22 || index == 23){
            rangeSum[0] = 22;
            rangeSum[1] = 23;
        } else {
            rangeSum[0] = -1;
            rangeSum[1] = -1;
        }

        time[rangeSum[0]] = "done";
        time[rangeSum[1]] = "done";

        Log.d(TAG, "onCreate: "+Arrays.toString(time));
    }
}
package com.example.demo10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int temp1;
        int temp2;
        int rev = 0;
        int number = 121;
        temp2 = number;
        while (number > 0) {
            temp1 = number % 10;
            rev = rev * 10 + temp1;
            number = number / 10;
        }
        System.out.println("reversed number is=" + rev);
        if (temp2==rev){
            System.out.println("number is pilondrome");
        }else if (temp2!=0){
            System.out.println("number is not pilondrome");
        }
    }

}


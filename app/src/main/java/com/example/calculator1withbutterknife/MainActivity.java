package com.example.calculator1withbutterknife;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

//    AppCompatActivity is an abstract class

//    hash map??????? findout what it is.

//    what are the four components of android

//    content providers, broadcast, receivers and activities

//    what if i wanna add a library, where do i add it?
//    module gradle




    //    Declare our variables
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20;
    TextView display;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        Log.d(TAG, "onCreate");

//        initialize our variables
        btn1 = findViewById(R.id.one);

//       setting the onclick listener
        btn1.setOnClickListener(this);


        btn2 = findViewById(R.id.two);
        btn2.setOnClickListener(this);

        btn3 = findViewById(R.id.three);
        btn3.setOnClickListener(this);

        btn4 = findViewById(R.id.four);
        btn4.setOnClickListener(this);

        btn5 = findViewById(R.id.five);
        btn5.setOnClickListener(this);

        btn6 = findViewById(R.id.six);
        btn6.setOnClickListener(this);

        btn7 = findViewById(R.id.seven);
        btn7.setOnClickListener(this);

        btn8 = findViewById(R.id.eight);
        btn8.setOnClickListener(this);

        btn9 = findViewById(R.id.nine);
        btn9.setOnClickListener(this);

        btn10 = findViewById(R.id.ten);
        btn10.setOnClickListener(this);

        btn11 = findViewById(R.id.eleven);
        btn11.setOnClickListener(this);

        btn12 = findViewById(R.id.twelve);
        btn12.setOnClickListener(this);

        btn13 = findViewById(R.id.thirteen);
        btn13.setOnClickListener(this);

        btn14 = findViewById(R.id.fourteen);
        btn14.setOnClickListener(this);

        btn15 = findViewById(R.id.fifteen);
        btn15.setOnClickListener(this);

        btn16 = findViewById(R.id.sixteen);
        btn16.setOnClickListener(this);

        btn17 = findViewById(R.id.seventeen);
        btn17.setOnClickListener(this);

        btn18 = findViewById(R.id.nineteen);
        btn18.setOnClickListener(this);

        btn19 = findViewById(R.id.twenty);
        btn19.setOnClickListener(this);

        display = findViewById(R.id.display);

    }

///to create an app from a no activity, you have to get into your java file and there from u go to the
//        first sub file in the java directory and there you creat a main activity.
//    after the main activity, you can start creating your life cycles.
//
//    after creating the life cycles, u go to the android manifest and then create an activity with
//    the intent filter. after that you run your program. /

//    polymorphism is like having a group of animals, say dog cat cow monkey igwana n u can name all of them animals in the same time

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");


    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.one:
                display.setText("0");
                break;

            case R.id.two:
                display.append("1");
                break;

            case R.id.three:
                display.append("1");
                break;

            case R.id.four:
                display.append("1");
                break;

            case R.id.five:
                display.append("7");
                break;

            case R.id.six:
                display.append("8");
                break;

            case R.id.seven:
                display.append("9");
                break;

            case R.id.eight:
                display.append("*");
                break;

            case R.id.nine:
                display.append("4");
                break;

            case R.id.ten:
                display.append("5");
                break;

            case R.id.eleven:
                display.append("6");
                break;

            case R.id.twelve:
                display.append("-");
                break;

            case R.id.thirteen:
                display.append("1");
                break;

            case R.id.fourteen:
                display.append("2");
                break;

            case R.id.fifteen:
                display.append("3");
                break;

            case R.id.sixteen:
                display.append("+");
                break;

            case R.id.seventeen:
                display.append("0");
                break;

            case R.id.nineteen:
                display.append(".");
                break;

            case R.id.twenty:
                display.append("=");
                break;
    }
}
}

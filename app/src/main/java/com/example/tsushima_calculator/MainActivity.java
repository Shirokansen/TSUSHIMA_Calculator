package com.example.tsushima_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttondecimal,buttonDEL,buttonMODULO,buttonC,buttonCE,buttondivide,buttonmultiply,buttonplus,buttonminus,buttonequals;
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttondecimal = findViewById(R.id.buttondecimal);
        buttonDEL = findViewById(R.id.buttonDEL);
        buttonMODULO = findViewById(R.id.buttonMODULO);
        buttonC = findViewById(R.id.buttonC);
        buttonCE = findViewById(R.id.buttonCE);
        buttondivide = findViewById(R.id.buttondivide);
        buttonmultiply = findViewById(R.id.buttonmultiply);
        buttonplus = findViewById(R.id.buttonplus);
        buttonminus = findViewById(R.id.buttonminus);
        buttonequals = findViewById(R.id.buttonequals);

        TextView button48;
        button48 = findViewById(R.id.button48);

    }
}
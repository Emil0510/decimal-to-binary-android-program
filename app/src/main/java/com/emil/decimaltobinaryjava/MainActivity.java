package com.emil.decimaltobinaryjava;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number;
    TextView answerText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=findViewById(R.id.editTextNumber);
        answerText=findViewById(R.id.answerText);

    }



    public void calculate(View view){
        answerText.setText("Answer: ");

        decimalToBinary();

    }

    public void decimalToBinary(){
        int i;
        i=Integer.parseInt(number.getText().toString());
        if (i >= 2) {
            int[] qaliq = new int[i];
            int say = 0;
            qaliq[0] = i % 2;
            for (int j = 1; j < qaliq.length; j++) {
                i = i / 2;
                say++;
                qaliq[j] = i % 2;
                if (i / 2 == 0) {
//                    System.out.print("Ikilik say sisteminde yazilisi= ");
                    for (int f = say; f > -1; f--) {
//                        System.out.print(qaliq[f]);
                        answerText.setText(answerText.getText().toString() + Integer.toString(qaliq[f]));
                    }
                }
                if (i / 2 == 0) {
                    break;
                }

            }

        } else if (i == 0) {
//            System.out.print("Ikilik say sisteminde yazilisi=0");
            answerText.setText(answerText.getText().toString() + 0);
        } else if (i == 1) {
//            System.out.print("Ikilik say sisteminde yazilisi=1");
            answerText.setText(answerText.getText().toString() + 1);
        } else if (i == -1) {
//            System.out.print("Ikilik say sisteminde yazilisi=-1");
            answerText.setText(answerText.getText().toString() + -1);
        } else {
            i = (-1) * i;
            int[] qaliq = new int[i];
            int say = 0;
            qaliq[0] = i % 2;
            for (int j = 1; j < qaliq.length; j++) {
                i = i / 2;
                say++;
                qaliq[j] = i % 2;
                if (i / 2 == 0) {
//                    System.out.print("Ikilik say sisteminde yazilisi= -");
                    for (int f = say; f > -1; f--) {
//                        System.out.print(qaliq[f]);
                        answerText.setText(answerText.getText().toString() + Integer.toString(qaliq[f]));
                    }
                }
                if (i / 2 == 0) {
                    break;
                }
            }
        }
    }
}
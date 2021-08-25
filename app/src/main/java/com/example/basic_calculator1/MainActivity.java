package com.example.basic_calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number1_obj,number2_obj;
    Button sum_button_obj,send_button_obj,Sub_button_obj,Multi_button_obj,Div_button_obj;
    TextView show_sum_obj;
    public static String RESULT = "";
    public static final String First_Key="sum key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1_obj=findViewById(R.id.number1);
        number2_obj=findViewById(R.id.number2);
        sum_button_obj=findViewById(R.id.sum_button);
        Sub_button_obj=findViewById(R.id.Sub_button);
        Multi_button_obj=findViewById(R.id.Mult_button);
        Div_button_obj=findViewById(R.id.Div_button);

        send_button_obj=findViewById(R.id.sum_send);
        show_sum_obj=findViewById(R.id.sum1);

        sum_button_obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Number1_st=number1_obj.getText().toString();
                String Number2_st=number2_obj.getText().toString();

                int a=Integer.parseInt(Number1_st);
                int b=Integer.parseInt(Number2_st);
                int sum=a+b;

                RESULT = Integer.toString(sum);


                Toast.makeText(MainActivity.this, Integer.toString(sum), Toast.LENGTH_LONG).show();

                show_sum_obj.setText(RESULT);


            }

        });


        Sub_button_obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Number1_sub=number1_obj.getText().toString();
                String Number2_sub=number2_obj.getText().toString();
                int a=Integer.parseInt(Number1_sub);
                int b=Integer.parseInt(Number2_sub);
                int sum=a-b;
                RESULT=Integer.toString(sum);

                show_sum_obj.setText(RESULT);
                Toast.makeText(MainActivity.this, RESULT, Toast.LENGTH_SHORT).show();

            }

        });


        Multi_button_obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Number1_MUlti=number1_obj.getText().toString();
                String Number2_Multi=number2_obj.getText().toString();

                int a=Integer.parseInt(Number1_MUlti);
                int b=Integer.parseInt(Number2_Multi);
                int sum=a*b;
                RESULT=Integer.toString(sum);
                Toast.makeText(MainActivity.this, RESULT, Toast.LENGTH_SHORT).show();

                show_sum_obj.setText(RESULT);

            }
        });
        Div_button_obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Number1_division=number1_obj.getText().toString();
                String NUmber2_division=number2_obj.getText().toString();

                int a=Integer.parseInt(Number1_division);
                int b=Integer.parseInt(NUmber2_division);
                int Div=a/b;
                RESULT=Integer.toString(Div);
                Toast.makeText(MainActivity.this, RESULT, Toast.LENGTH_SHORT).show();
                show_sum_obj.setText(RESULT);
            }
        });
        send_button_obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,ShowResult.class);
                intent.putExtra(First_Key,RESULT);
                startActivity(intent);

            }
        });

    }
}
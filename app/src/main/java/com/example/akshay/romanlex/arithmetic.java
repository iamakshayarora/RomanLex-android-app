package com.example.akshay.romanlex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class arithmetic extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    EditText num1;
    EditText num2;
    TextView arth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetic);
        b1 = (Button) findViewById(R.id.addbutton);
        b2 = (Button) findViewById(R.id.subbutton);
        b3 = (Button) findViewById(R.id.mulbutton);
        b4 = (Button) findViewById(R.id.divbutton);
        arth = (TextView) findViewById(R.id.display1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = (EditText) findViewById(R.id.num2);
                num2 = (EditText) findViewById(R.id.num3);
                String num3=(num1.getText().toString());
                String num4=(num2.getText().toString());
                int a=ToIntegers(num3);
                int b=ToIntegers(num4);
                int c=a+b;
                String fin=ToNumerals(c);
                arth.setText(fin);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = (EditText) findViewById(R.id.num2);
                num2 = (EditText) findViewById(R.id.num3);
                String num3=(num1.getText().toString());
                String num4=(num2.getText().toString());
                int a=ToIntegers(num3);
                int b=ToIntegers(num4);
                int c=a-b;
                String fin=ToNumerals(c);
                arth.setText(fin);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = (EditText) findViewById(R.id.num2);
                num2 = (EditText) findViewById(R.id.num3);
                String num3=(num1.getText().toString());
                String num4=(num2.getText().toString());
                int a=ToIntegers(num3);
                int b=ToIntegers(num4);
                int c=a*b;
                String fin=ToNumerals(c);
                arth.setText(fin);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = (EditText) findViewById(R.id.num2);
                num2 = (EditText) findViewById(R.id.num3);
                String num3=(num1.getText().toString());
                String num4=(num2.getText().toString());
                int a=ToIntegers(num3);
                int b=ToIntegers(num4);
                int c=a/b;
                String fin=ToNumerals(c);
                arth.setText(fin);
            }
        });
    }

    private int ToIntegers(String RN)
    {
        String numString = "";
        int burp = RN.length();
        int numInt = 0;

        for (int i = 0; i < burp; i++)
        {
            numString = RN.substring(i, i + 1);
            if (numString.equals("M"))
            {
                numInt += 1000;
            }
            else if (numString.equals("D"))
            {
                numInt += 500;
            }
            else if (numString.equals("C"))
            {
                numInt += 100;
            }
            else if (numString.equals("L"))
            {
                numInt += 50;
            }
            else if (numString.equals("X"))
            {
                numInt += 10;
            }
            else if (numString.equals("V"))
            {
                numInt += 5;
            }
            else if (numString.equals("I"))
            {
                numInt += 1;
            }



        }

        return numInt;
    }
    private String ToNumerals(int FI)
    {
        String NumeralFinal = "";

        while (FI >= 1000)
        {
            NumeralFinal += "M";
            FI -= 1000;
        }
        while (FI >= 900)
        {
            NumeralFinal += "CM";
            FI -= 900;
        }
        while (FI >= 500)
        {
            NumeralFinal += "D";
            FI -= 500;
        }
        while (FI >= 400)
        {
            NumeralFinal += "CD";
            FI -= 400;
        }

        while (FI >= 100)
        {
            NumeralFinal += "C";
            FI -= 100;
        }
        while (FI >= 90)
        {
            NumeralFinal += "XC";
            FI -= 90;
        }
        while (FI >= 50)
        {
            NumeralFinal += "L";
            FI -= 50;
        }
        while (FI >= 40)
        {
            NumeralFinal += "XL";
            FI -= 40;
        }
        while (FI >= 10)
        {
            NumeralFinal += "X";
            FI -= 10;
        }
        while (FI >= 9)
        {
            NumeralFinal += "IX";
            FI -= 9;
        }
        while (FI >= 5)
        {
            NumeralFinal += "V";
            FI -= 5;
        }
        while (FI >= 4)
        {
            NumeralFinal += "IV";
            FI -= 4;
        }
        while (FI >= 1)
        {
            NumeralFinal += "I";
            FI -= 1;
        }
        return NumeralFinal;
    }
}

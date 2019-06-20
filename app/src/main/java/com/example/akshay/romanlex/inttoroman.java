package com.example.akshay.romanlex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class inttoroman extends AppCompatActivity {
    private Button b;
    int num2;
    EditText num;
    TextView rom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inttoroman);
        b = (Button) findViewById(R.id.buttonroman);
        rom = (TextView) findViewById(R.id.display);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = (EditText) findViewById(R.id.num1);
                int num2 = Integer.parseInt(num.getText().toString());
                String fin=ToNumerals(num2);
                rom.setText(fin);
            }
        });
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

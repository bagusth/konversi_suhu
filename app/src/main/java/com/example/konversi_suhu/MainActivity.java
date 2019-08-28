package com.example.konversi_suhu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    float Celcius, Kelvin, Fahrenheit, Reamur;
    EditText edtxtC, edtxtK, edtxtF, edtxtR;
    Button btnKonversi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxtC = findViewById(R.id.edtC);
        edtxtK = findViewById(R.id.edtK);
        edtxtF = findViewById(R.id.edtF);
        edtxtR = findViewById(R.id.edtR);
        btnKonversi = findViewById(R.id.button);
        btnKonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Celcius = Float.parseFloat(edtxtC.getText().toString());
                Kelvin = Celcius + 273;
                Fahrenheit = (Celcius * 9 / 5) + 32;
                Reamur = (float) (Celcius * 0.8);

                edtxtK.setText(Kelvin + "");
                edtxtF.setText(Fahrenheit + "");
                edtxtR.setText(Reamur+ "");
            }
        });

    }
}

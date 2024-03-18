package com.example.latihan10pplg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    EditText InputAngka1;
    EditText InputAngka2;
    Spinner  spinner1;
    TextView txtHasil;
    Button btnJumlah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        InputAngka1 = findViewById(R.id.InputAngka1);
        InputAngka2 = findViewById(R.id.InputAngka2);
        txtHasil = findViewById(R.id.txtHasil);
        spinner1 = findViewById(R.id.spinner1);
        btnJumlah = findViewById(R.id.btnJumlah);
        btnJumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = spinner1.getSelectedItem().toString();
                int angka1 = Integer.parseInt(InputAngka1.getText().toString());
                int angka2 = Integer.parseInt(InputAngka2.getText().toString());
                int hasil = 0;
                switch (text) {
                    case "Tambah":
                        hasil = angka1 + angka2;
                        txtHasil.setText(hasil + "");
                        break;
                    case "Kurang":
                        hasil = angka1 - angka2;
                        txtHasil.setText(hasil + "");
                        break;
                    case "Kali":
                        hasil = angka1 * angka2;
                        txtHasil.setText(hasil + "");
                        break;
                    case "Bagi":
                        double angka1double = Double.parseDouble(InputAngka1.getText().toString());
                        double angka2double = Double.parseDouble(InputAngka2.getText().toString());
                        double hasilDouble = angka1double / angka2double;
                        txtHasil.setText(hasilDouble + "");
                        break;
                }
            }
        });
    }
}
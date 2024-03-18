package com.example.latihan10pplg2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class Menu extends AppCompatActivity {
    CardView calculatorCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        calculatorCard = findViewById(R.id.calculatorCard);
        calculatorCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calculatorPage = new Intent(Menu.this, Calculator.class);
                startActivity(calculatorPage);
            }
        });
    }
}
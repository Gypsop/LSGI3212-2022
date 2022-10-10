package com.lsgi3212.lab.collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Declare the widget variables for connecting to the UI
    private Button widget_button_toConfirmedCasesInTheGreatBayArea;
    private Button widget_button_toMangkhutPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the button to go to the ConfirmedCasesInTheGreatBayArea activity
        widget_button_toConfirmedCasesInTheGreatBayArea = findViewById(R.id.button_toConfirmedCasesInTheGreatBayArea);
        widget_button_toConfirmedCasesInTheGreatBayArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ConfirmedCasesInTheGreatBayArea.class);
                startActivity(intent);
            }
        });

        // Set up the button to go to the MangkhutPath activity
        widget_button_toMangkhutPath = findViewById(R.id.button_toMangkhutPath);
        widget_button_toMangkhutPath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MangkhutPath.class);
                startActivity(intent);
            }
        });
    }
}
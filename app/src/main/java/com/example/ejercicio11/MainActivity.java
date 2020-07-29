package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtbox;
    private TextView txt2;


    public void onClickButtonMost(View view) {

        String msj1 = txtbox.getText().toString();
        this.txt2.setText(msj1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.i("MainActivity", "onStart [START]");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtbox = findViewById(R.id.txtbox);
        this.txt2 = findViewById(R.id.txt2);
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
        Log.i("MainActivity", "onStart [END]");
    }
}
    
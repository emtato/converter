package com.example.convertisseur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText editText;
    public void convert(View view) {
        Double canadianAmount, americanAmount;
        editText=findViewById(R.id.editText);
        canadianAmount = Double.parseDouble(editText.getText().toString());
        americanAmount = canadianAmount*0.76;

        InputMethodManager mgr=(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);

        Toast.makeText(MainActivity.this,String.format("%.2f",americanAmount) + " $ US ", Toast.LENGTH_LONG).show();

    }

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
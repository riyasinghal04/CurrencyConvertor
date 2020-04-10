package com.example.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View v){

        Log.i("Test","Button pressed");
        EditText dollars=(EditText)findViewById(R.id.Dollars_text);
        String dollars_str= dollars.getText().toString();
        Double dollars_int=Double.parseDouble(dollars_str);

        Double rupees=dollars_int*71;
        Toast.makeText(this, "Rs."+ rupees.toString()+"!", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

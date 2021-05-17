package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public void Currency(View view){
    Log.i("Info","Button Pressed");
    EditText editText=(EditText)findViewById(R.id.editText);
    String Amountinrs=editText.getText().toString();
    double Ad=Double.parseDouble(Amountinrs);
    double Amountindollar=Ad/72.0;
    String ads=String.format("%.2f",Amountindollar);

    Toast.makeText(this,"$"+ads,Toast.LENGTH_LONG).show();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
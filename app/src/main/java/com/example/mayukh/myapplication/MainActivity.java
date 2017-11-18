package com.example.mayukh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {
    private EditText ed;
    private EditText rad;
    private EditText nrad;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void increment() {
        tv = (findViewById(R.id.tv1));
        ed = (findViewById(R.id.num));
        rad = (findViewById(R.id.rad1));
        nrad = (findViewById(R.id.rad2));

        //return types have been changed in effect from android studio 3.0
        // now they are automatically typecasted to required datatype
        //cheers!
        BigInteger bi;
        int n = 0,nn=0;

        try {
            n = Integer.parseInt(rad.getText().toString().trim());
            bi = new BigInteger(ed.getText().toString().trim(),n);

            if (n > 36) {
                Toast.makeText(this, "Base is always <=36", Toast.LENGTH_SHORT).show();
                return;
            }
        } catch (Exception e) {
            Toast.makeText(this, "Incorrect Input", Toast.LENGTH_SHORT).show();
            return;
        }
        nn=Integer.parseInt(nrad.getText().toString().trim());

        if (nn > 36) {
            Toast.makeText(this, "Base is always <=36", Toast.LENGTH_SHORT).show();
            return;
        }

        String s = bi.toString(nn);
        tv.setText(s);
        Toast.makeText(this, "Thanks For Using :)", Toast.LENGTH_SHORT).show();
    }

    public void ho(View view) {

        increment();
    }
}


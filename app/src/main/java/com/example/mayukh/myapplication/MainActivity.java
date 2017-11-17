package com.example.mayukh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText ed;
    private EditText edrad;
private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init();
    }


    public void increment()
    {
        tv=(TextView) (findViewById(R.id.tv1));
        ed=(EditText)(findViewById(R.id.ed1));
        edrad=(EditText)(findViewById(R.id.ed2));
        int rd=0,n=0;
        try {
             rd = Integer.parseInt(edrad.getText().toString().trim());
             n = Integer.parseInt(ed.getText().toString().trim());

        }catch(Exception e){
            Toast.makeText(this, "DONT BE OVERSMART!", Toast.LENGTH_SHORT).show();
            return;
        }
        String s=Integer.toString(n,rd);
        tv.setText(s);
        Toast.makeText(this, "Thanks For Using :)", Toast.LENGTH_SHORT).show();
    }

    public void ho(View view)
    {

increment();
    }
    public void hoo(View view) {
        increment();
    }
}

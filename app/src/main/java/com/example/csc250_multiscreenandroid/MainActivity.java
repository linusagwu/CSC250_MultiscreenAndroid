package com.example.csc250_multiscreenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    // private int counter;
    private EditText inputTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.counter = 0;
        this.inputTV = this.findViewById(R.id.imputTV);
    }

    public void onNextScreenButtonClicked(View v)
    {
        Intent i = new Intent(this,Screen2.class);
        String num = this.inputTV.getText().toString();
        int inputTV = Integer.parseInt(num);

        //i.putExtra("name", "Mike");
        //i.putExtra("counter", counter);
        MySingleton.fac = inputTV;
        this.startActivity(i);
    }
}
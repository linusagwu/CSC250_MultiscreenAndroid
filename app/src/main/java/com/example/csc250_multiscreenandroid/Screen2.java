package com.example.csc250_multiscreenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity
{
    private TextView Fac_Text;

    private int factorial(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n* factorial(n-1);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        int fac = MySingleton.fac;
        int answer = factorial(fac);
        this.Fac_Text = this.findViewById(R.id.FacTV);
        this.Fac_Text.setText(answer + "");
        MySingleton.S_root = answer;

    }


    public void onNextScreenButtonPressed(View v)
    {
        Intent i = new Intent(this,Screen3.class);
        this.startActivity(i);
    }

}
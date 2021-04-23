package com.example.csc250_multiscreenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;
import static java.lang.Math.sqrt;

public class Screen3 extends AppCompatActivity
{
    private TextView S_RootTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        int sqr = MySingleton.S_root;
        double answer = sqrt(sqr);
        // TextView nameTV = this.findViewById(R.id.nameTV);
        this.S_RootTV = this.findViewById(R.id.S_RootTV);
        DecimalFormat df = new DecimalFormat("###.##");
        this.S_RootTV.setText(df.format(answer) + ".");

    }
}
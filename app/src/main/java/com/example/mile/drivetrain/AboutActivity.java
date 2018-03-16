package com.example.mile.drivetrain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        tv = (TextView) findViewById(R.id.aboutText);

        loadText();

    }

    private void loadText(){

        String s = "Drivetrain makes predictions so you can receive a recommendation" +
                " of cars that customer is likely to be interested in.";

//        for (int i = 0; i < 100; i++){
//            s += " line: " + String.valueOf(i) + "\n";
//        }

        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);
    }
}

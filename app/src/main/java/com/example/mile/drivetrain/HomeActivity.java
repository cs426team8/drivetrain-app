package com.example.mile.drivetrain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void launchMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }

    public void launchAboutActivity(View view) {
        Intent intent = new Intent(this, AboutActivity.class);

        startActivity(intent);
    }
}

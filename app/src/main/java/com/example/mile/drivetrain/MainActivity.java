package com.example.mile.drivetrain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Query");

        Spinner gender_spinner = (Spinner) findViewById(R.id.gender_spinner);
        ArrayAdapter<CharSequence> gender_adapter = ArrayAdapter.createFromResource(this, R.array.gender_array, android.R.layout.simple_spinner_item);
        gender_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gender_spinner.setAdapter(gender_adapter);

        Spinner rent_spinner = (Spinner) findViewById(R.id.rent_spinner);
        ArrayAdapter<CharSequence> rent_adapter = ArrayAdapter.createFromResource(this, R.array.rent_array, android.R.layout.simple_spinner_item);
        rent_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify the layout to use when the list of choices appears
        rent_spinner.setAdapter(rent_adapter); // Apply the adapter to the spinner

        Spinner relationship_spinner = (Spinner) findViewById(R.id.relationship_spinner);
        ArrayAdapter<CharSequence> relationship_adapter = ArrayAdapter.createFromResource(this, R.array.relationship_array, android.R.layout.simple_spinner_item);
        relationship_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify the layout to use when the list of choices appears
        relationship_spinner.setAdapter(relationship_adapter); // Apply the adapter to the spinner

        Spinner age_spinner = (Spinner) findViewById(R.id.age_spinner);
        ArrayAdapter<CharSequence> age_adapter = ArrayAdapter.createFromResource(this, R.array.age_array, android.R.layout.simple_spinner_item);
        age_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify the layout to use when the list of choices appears
        age_spinner.setAdapter(age_adapter); // Apply the adapter to the spinner

        Spinner children_spinner = (Spinner) findViewById(R.id.children_spinner);
        ArrayAdapter<CharSequence> children_adapter = ArrayAdapter.createFromResource(this, R.array.children_array, android.R.layout.simple_spinner_item);
        children_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify the layout to use when the list of choices appears
        children_spinner.setAdapter(children_adapter); // Apply the adapter to the spinner

        Spinner education_spinner = (Spinner) findViewById(R.id.education_spinner);
        ArrayAdapter<CharSequence> education_adapter = ArrayAdapter.createFromResource(this, R.array.education_array, android.R.layout.simple_spinner_item);
        education_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify the layout to use when the list of choices appears
        education_spinner.setAdapter(education_adapter); // Apply the adapter to the spinner

        gender_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                //Toast.makeText(getBaseContext(), "bleso selected", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Button button = (Button) findViewById(R.id.query_2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getBaseContext(), "Connecting to the API...", Toast.LENGTH_SHORT).show();
            }
        });


    }


}

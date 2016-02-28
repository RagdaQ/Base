package com.example.ragda.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class goal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);


        EditText GoalName =(EditText) findViewById(R.id.editText6);
        EditText Amount =(EditText) findViewById(R.id.editText7);
        EditText Duration =(EditText) findViewById(R.id.editText8);
        EditText SavingAmoun =(EditText) findViewById(R.id.editText9);

        Button Done= (Button)findViewById(R.id.button5);
        Done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Goal created", Toast.LENGTH_SHORT).show();

            }
        });


    }
}

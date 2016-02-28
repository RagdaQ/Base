package com.example.ragda.base;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import io.realm.Realm;

public class signup extends AppCompatActivity {//implements AdapterView.OnItemSelectedListener {

    Spinner spinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);



       // ArrayAdapter<CharSequence>.createFromResource(this,R.array.days,android.R.layout.simple_spinner_item);

        final EditText username =(EditText) findViewById(R.id.editText3);
        final EditText email=(EditText) findViewById(R.id.editText4);
        final EditText password=(EditText) findViewById(R.id.editText5);
        final Spinner Gender = (Spinner)findViewById(R.id.spinner);
        spinner=(Spinner)findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> ar=ArrayAdapter.createFromResource(this,R.array.Gender,android.R.layout.simple_spinner_item);
        ar.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(ar);

        Button Regester = (Button) findViewById(R.id.button4);
        Regester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                user u = new user();

                u.setUsername(username.getText().toString());
                u.setPassword(password.getText().toString());
                u.setEmail(email.getText().toString());
                // u.setGender(Gender.getPopupBackground());

                Realm r = Realm.getInstance(getApplicationContext());
                r.beginTransaction();
                r.copyToRealmOrUpdate(u);
                r.commitTransaction();
                Toast.makeText(signup.this, "you have been Regester", Toast.LENGTH_SHORT).show();
                finish();

            }
        });




    }
}

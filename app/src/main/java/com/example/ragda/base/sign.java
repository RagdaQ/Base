package com.example.ragda.base;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;

public class sign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

       final EditText email = (EditText) findViewById(R.id.editText);
        final EditText password = (EditText) findViewById(R.id.editText2);

        TextView signup = (TextView)findViewById(R.id.textView7);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), com.example.ragda.base.signup.class);
                startActivity(i);
            }
        });

        final Button signin =(Button)findViewById(R.id.button2);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Realm realm =  Realm.getInstance(getApplicationContext());
                RealmQuery<user> query=realm.where(user.class);
                query.equalTo("email",email.getText().toString());
                query.equalTo("password",password.getText().toString());
                RealmResults<user> results=query.findAll();

                if (results.size()>0){
                    Intent i = new Intent(sign.this,calendar.class);
                    startActivity(i);
                }else Toast.makeText(sign.this,"You are not registered",Toast.LENGTH_SHORT).show();
               // startActivity(i);

            }
        });
    }
}

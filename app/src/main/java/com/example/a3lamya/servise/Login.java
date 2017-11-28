package com.example.a3lamya.servise;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public EditText textone,texttow;
    public Button log;
    public final static String PREF_NAME="my_pref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sharedPreferences =getSharedPreferences(PREF_NAME,0);

        if ( sharedPreferences.getString("name","").length()  > 0 ){Intent i=new Intent(Login.this,ShowData.class);
            startActivity(i);}


        editor=sharedPreferences.edit();

        textone=(EditText)findViewById(R.id.txtone);
        texttow=(EditText)findViewById(R.id.txttow);
        log=(Button)findViewById(R.id.btnlog);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    editor.putString("name", textone.getText().toString());
                    editor.putString("age", texttow.getText().toString());

                    editor.commit();
                    editor.apply();
                    Intent i = new Intent(Login.this, ShowData.class);
                    startActivity(i);

            }
            }
        );





}}

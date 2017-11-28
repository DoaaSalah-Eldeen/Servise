package com.example.a3lamya.servise;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {
    public final static String PREF_NAME="my_pref";
    public Button sign_out;
   public TextView textViewone,textViewtow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        textViewone=(TextView)findViewById(R.id.Showone);
        textViewtow=(TextView)findViewById(R.id.Showtow);
        sign_out=(Button)findViewById(R.id.sign_out_btn);

        final SharedPreferences sharedPreferences;

        sharedPreferences =getSharedPreferences(PREF_NAME,0);
        textViewone.setText(sharedPreferences.getString("name",""));
        textViewtow.setText(sharedPreferences.getString("age",""));

        sign_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                SharedPreferences.Editor editor= sharedPreferences.edit();
                editor.clear();
                editor.commit();
                finish();


                Intent i=new Intent(ShowData.this,Login.class);
                startActivity(i);



            }
        });

}}

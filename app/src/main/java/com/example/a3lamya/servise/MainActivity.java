package com.example.a3lamya.servise;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public final static String PREF_NAME="my_pref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

Intent intent=new Intent(this,ToastService.class);
      //  startService(intent);
       // stopService(intent);


        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editor;
        sharedPreferences =getSharedPreferences(PREF_NAME,0);
        editor=sharedPreferences.edit();
        editor.putString("name","Doaa");
        editor.putInt("name",15);
        editor.commit();
        editor.apply();
            }

}

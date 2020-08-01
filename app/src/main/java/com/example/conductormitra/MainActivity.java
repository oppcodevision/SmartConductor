package com.example.conductormitra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Thread splash=new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(3*1000);
                    Intent intent=new Intent(getApplicationContext(),HomeScreen.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "Something is wrong", Toast.LENGTH_SHORT).show();
                }
            }
        };

        splash.start();



    }
}

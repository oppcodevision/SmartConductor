package com.example.conductormitra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity {

    TextView Username;
    CardView ScanTicket,Calculator,Profile,CheckList,LiveLocation,TodayPas,ContactUs1,EmergencyHelp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Username=findViewById(R.id.username);
        ScanTicket=findViewById(R.id.scanTicket);
        Calculator=findViewById(R.id.calculator);
        Profile=findViewById(R.id.profile);
        CheckList=findViewById(R.id.checklist);
        LiveLocation=findViewById(R.id.liveLocaiton);
        TodayPas=findViewById(R.id.todayPass);
        ContactUs1=findViewById(R.id.contactUs);
        EmergencyHelp1=findViewById(R.id.emergencyHelp);

        ScanTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Check_TicketHome.class));
            }
        });

        Calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CalculatorActivity.class));
            }
        });

        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
            }
        });

        CheckList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CheckListActivity.class));
            }
        });

        LiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LiveLocation.class));
            }
        });

        TodayPas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),TodayPassanger.class));
            }
        });

        ContactUs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ContactUs.class));
            }
        });

        EmergencyHelp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),EmergencyHelp.class));
            }
        });






    }
}

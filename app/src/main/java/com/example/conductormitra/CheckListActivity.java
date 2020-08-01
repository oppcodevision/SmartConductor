package com.example.conductormitra;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheckListActivity extends AppCompatActivity {

    Button btnmap;
    String uri="geo:0,0?q=india";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_list);


        btnmap=findViewById(R.id.btndemo);
        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gm=Uri.parse(uri);
                Intent intent=new Intent(Intent.ACTION_VIEW,gm);
                intent.setPackage("com,google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager())!= null)
                {
                    startActivity(intent);
                }
            }
        });







    }
}






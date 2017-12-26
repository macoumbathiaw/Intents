package com.example.mthiaw.intents;

import android.content.Intent;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Let's create an explicite intent to open Main2Activity when button is click
        Button OpenActivity2Main = (Button) findViewById(R.id.open_activity_main2);
        //Create a Onclick Listener
        OpenActivity2Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openActivity2 = new Intent(getApplicationContext(),Main2Activity.class
                );
                startActivity(openActivity2);
            }
        });



    }
}

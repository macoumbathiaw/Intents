package com.example.mthiaw.intents;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Create an Onclick listener button
        Button sendEmailTo = (Button) findViewById(R.id.send_an_email);
        sendEmailTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Create an implicite intent to send an email using whatever email app available on the phone
                // Create the text message with a string
                Intent sendEmail = new Intent();
                sendEmail.setAction(Intent.ACTION_SEND);
                sendEmail.putExtra(Intent.EXTRA_TEXT, "Send this email to");
                sendEmail.setType("text/plain");

                if (sendEmail.resolveActivity(getPackageManager()) !=null)
                {
                    startActivity(sendEmail);}




            }
        });






    }
}

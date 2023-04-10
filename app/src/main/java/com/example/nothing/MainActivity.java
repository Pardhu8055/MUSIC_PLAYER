package com.example.nothing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton I1= findViewById(R.id.imageButton);
        ImageButton I2= findViewById(R.id.imageButton1);
        ImageButton I3= findViewById(R.id.imageButton2);
        ImageButton I4= findViewById(R.id.imageButton3);
        ImageButton I5= findViewById(R.id.imageButton4);
        ImageButton I6= findViewById(R.id.imageButton5);
        ImageButton I7= findViewById(R.id.imageButton6);
        ImageButton I8= findViewById(R.id.imageButton7);

        I1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });


        I2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,MainActivity4.class);
                startActivity(intent);
            }
        });



        I3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });




        I4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,MainActivity5.class);
                startActivity(intent);
            }
        });





        I5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,MainActivity6.class);
                startActivity(intent);
            }
        });





        I6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,MainActivity7.class);
                startActivity(intent);
            }
        });




        I7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,MainActivity8.class);
                startActivity(intent);
            }
        });





        I8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,MainActivity9.class);
                startActivity(intent);
            }
        });







    }
}
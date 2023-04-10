package com.example.nothing;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btnPause, btnPlay, btnStop;

        btnPause= findViewById(R.id.button);
        btnPlay= findViewById(R.id.button2);
        btnStop = findViewById(R.id.button3);



        MediaPlayer mp = new MediaPlayer();
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);

        String onlineAudioPath = "https://firebasestorage.googleapis.com/v0/b/songs-43281.appspot.com/o/%5BiSongs.info%5D%2009%20-%20Why%20This%20Kolaveri%20Di.mp3?alt=media&token=8277e1dd-b434-445d-97dd-ce3fc349aa21";

        Uri onlineURI = Uri.parse(onlineAudioPath);
        try {
            mp.setDataSource(this,onlineURI);
            mp.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
                mp.seekTo(0);
            }
        });

    }
}
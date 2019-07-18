package com.b2t1.churchpalm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.SeekBar;

public class MediaActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private SeekBar seekBar;
    private Runnable runnable;
    private Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = findViewById(R.id.seekBar);
        handler = new Handler();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.harry);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if(b){
                    mediaPlayer.seekTo(i);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }

    public void changeSeekBar(){
        seekBar.setProgress(mediaPlayer.getCurrentPosition());

        if(mediaPlayer.isPlaying()){
            runnable = new Runnable() {
                @Override
                public void run() {
                    changeSeekBar();
                }
            };

            handler.postDelayed(runnable, 1000);

        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        if(mediaPlayer != null && mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    public void soundExec(View view){
        if(mediaPlayer != null){
            seekBar.setMax(mediaPlayer.getDuration());
            mediaPlayer.setVolume(100, 100);
            mediaPlayer.start();
            changeSeekBar();


        }

    }

    public void soundPause(View view){
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }

    public void soundStop(View view){
        if(mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.harry);

        }
    }


}

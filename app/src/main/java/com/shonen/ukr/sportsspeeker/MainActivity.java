package com.shonen.ukr.sportsspeeker;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imgBoxing, imgKickboxing, imgJudo, imgKarate, imgAikido, imgTaekwondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBoxing = findViewById(R.id.imgBoxing);
        imgKickboxing = findViewById(R.id.imgKickboxing);
        imgJudo = findViewById(R.id.imgJudo);
        imgKarate = findViewById(R.id.imgKarate);
        imgAikido = findViewById(R.id.imgAikido);
        imgTaekwondo = findViewById(R.id.imgTaekwondo);

        imgBoxing.setOnClickListener(MainActivity.this);
        imgKickboxing.setOnClickListener(MainActivity.this);
        imgJudo.setOnClickListener(MainActivity.this);
        imgKarate.setOnClickListener(MainActivity.this);
        imgAikido.setOnClickListener(MainActivity.this);
        imgTaekwondo.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View imageButton) {
        switch (imageButton.getId()) {
            case (R.id.imgBoxing):
                playSportsName(imgBoxing.getTag().toString());
                break;
            case (R.id.imgKickboxing):
                playSportsName(imgKickboxing.getTag().toString());
                break;
            case (R.id.imgJudo):
                playSportsName(imgJudo.getTag().toString());
                break;
            case (R.id.imgKarate):
                playSportsName(imgKarate.getTag().toString());
                break;
            case (R.id.imgAikido):
                playSportsName(imgAikido.getTag().toString());
                break;
            case (R.id.imgTaekwondo):
                playSportsName(imgTaekwondo.getTag().toString());
                break;
        }
    }
    private void playSportsName (String sportName){
        MediaPlayer mp = MediaPlayer.create(this,getResources().getIdentifier(sportName,"raw",getPackageName()));
        mp.start();
    }
}

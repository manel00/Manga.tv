package com.example.manel.naruto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

/**
 * Created by Manel on 25/07/2015.
 */
public class SplashActivity extends Activity {

    private final int SPLASH_DISPLAY_LENGTH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        ImageView iv = (ImageView) findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.logo);

        //HANDLER TO DO SPLASH
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent i = new Intent(SplashActivity.this,AnimeActivity.class);
                SplashActivity.this.startActivity(i);
                SplashActivity.this.finish();}
        }, SPLASH_DISPLAY_LENGTH);
    }

    @Override
    public void finish() {
        super.finish();
    }
}

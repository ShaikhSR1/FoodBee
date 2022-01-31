package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * The type Splash screen.
 */
public class SplashScreen extends AppCompatActivity {

    // Splash Screen Timer
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler = new Handler();
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                /**
                 * This method will be executed once the timer is over
                 * Start  app main activity
                 */

                Intent intent = new Intent(SplashScreen.this, Login.class);
                startActivity(intent);

                /**
                 * close this activity
                 */
                finish();
            }
        }, 5000);
    }
}

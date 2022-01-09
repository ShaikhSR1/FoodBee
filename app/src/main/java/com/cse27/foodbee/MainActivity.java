package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * A food delivery service Application
 * @author :
 * <br>
 * Asraf Ullah Rahat <br>
 * Nishat Tasnim <br>
 * Abdullah Al Shaik <br>
 * Jubair Al Faisal <br>
 * Jannatul Ferdaus Amrin <br>
 * @version 1.0
 * @since 02 january, 2021
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        NavigationUI.setupWithNavController(bottomNavigationView,navController);



    }
}
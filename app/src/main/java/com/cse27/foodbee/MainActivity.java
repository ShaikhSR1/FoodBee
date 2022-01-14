package com.cse27.foodbee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.cse27.foodbee.Fragments.FoodFragment;
import com.cse27.foodbee.Fragments.HomeFragment;
import com.cse27.foodbee.Fragments.RestaurantFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

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



/**
 * MainActivity file handles navigation and menus
 * Search button icon for searching page
 * Clicking on the button redirects to search page
 */


public class MainActivity extends AppCompatActivity {

    Button btnSearch;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment = null;
                switch (menuItem.getItemId()) {
                    case R.id.homeFragment:
                        selectedFragment = new HomeFragment();
                        break;
                    case R.id.restaurantFragment:
                        selectedFragment = new RestaurantFragment();
                        break;
                    case R.id.foodFragment:
                        selectedFragment = new FoodFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.home_fragmer_container,selectedFragment).commit();

                return true;
            }
        });

        getSupportFragmentManager().beginTransaction().replace(R.id.home_fragmer_container,new HomeFragment()).commit();

        //NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        //NavigationUI.setupWithNavController(bottomNavigationView,navController);
    }




}
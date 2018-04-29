package com.hazimfenjan.samsuntour;


import android.support.design.widget.TabLayout;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabItem;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter pageAdapter;
    TabItem tabPlaces;
    TabItem tabHotel;
    TabItem tabMuseums;
    TabItem tabMalls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        tabLayout = findViewById(R.id.tablelayout);
        tabPlaces = findViewById(R.id.tabPlaces);
        tabHotel = findViewById(R.id.tabHotel);
        tabMuseums = findViewById(R.id.tabMuseums);
        tabMalls = findViewById(R.id.tabMalls);
        viewPager = findViewById(R.id.viewPager);
        pageAdapter = new PageAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        tabLayout.setupWithViewPager(viewPager);

    }
}

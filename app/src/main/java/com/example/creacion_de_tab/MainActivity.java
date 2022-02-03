package com.example.creacion_de_tab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.Tab.Controlador.PageController;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tablayout;
    ViewPager viewPager;
    TabItem tab1,tab2,tab3,tab4;

    PagerController pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        tab1 = findViewById(R.id.tabPop);
        tab2 = findViewById(R.id.tabHip_Hop);
        tab3 = findViewById(R.id.tabSalsa);
        tab4 = findViewById(R.id.tabReggaeton);

        pagerAdapter = new PagerController(getSupportFragmentManager(),
                tablayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);

        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

           @Override
           public void onTabSelected(TabLayout.Tab tab){

               viewPager.setCurrentItem(tab.getPosition());

               if(tab.getPosition()==0){
                   pagerAdapter.notifyDataSetChanged();
               }
               if(tab.getPosition()==1){
                   pagerAdapter.notifyDataSetCanged();
               }
               if(tab.getPosition()==2){
                   pagerAdapter.notifyDataSetChanged();
               }
           }


            @Override
            public void OnTabUnselected(TabLayout.Tab tab){

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab){

            }
        });

        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener((tablayout)));
    }
}
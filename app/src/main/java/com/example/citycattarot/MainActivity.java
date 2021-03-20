package com.example.citycattarot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.citycattarot.model.PagerDTO;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.view_pager_top);

        ArrayList<PagerDTO> list = new ArrayList<>();
        list.add(new PagerDTO(android.R.color.white, "1 Page"));
        list.add(new PagerDTO(android.R.color.holo_red_light, "2 Page"));
        list.add(new PagerDTO(android.R.color.holo_green_dark, "3 Page"));
        list.add(new PagerDTO(android.R.color.holo_orange_dark, "4 Page"));
        list.add(new PagerDTO(android.R.color.holo_blue_light, "5 Page"));
        list.add(new PagerDTO(android.R.color.holo_blue_bright, "6 Page"));

        viewPager2.setAdapter(new PagerRecyclerAdapter(list));
//        viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

    }
}
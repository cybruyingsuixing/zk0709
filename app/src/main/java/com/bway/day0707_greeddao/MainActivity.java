package com.bway.day0707_greeddao;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.bway.day0707_greeddao.mvp.home.view.fragment.HomeFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fragment> list=new ArrayList<>();
    private ViewPager viewPager;
    private RadioGroup radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {

        viewPager = findViewById(R.id.viewpager);
        radio = findViewById(R.id.main_radio);
            list.add(new HomeFragment());
            list.add(new CartFragment());

        MyFragment myFragment = new MyFragment(getSupportFragmentManager(), list);
        viewPager.setAdapter(myFragment);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        radio.check(R.id.main_home);
                        break;
                    case 1:
                        radio.check(R.id.main_cart);
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.main_home:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.main_cart:
                        viewPager.setCurrentItem(1);
                        break;

                }
            }
        });

    }
}

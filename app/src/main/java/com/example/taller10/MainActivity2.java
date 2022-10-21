package com.example.taller10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

//Acá encontraremos enlazadas las tabs
public class MainActivity2 extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tabLayout = findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager(viewPager);

        Adapter myAdapter = new Adapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        myAdapter.addFragment(new BlankFragment(), "NOTAS" );
        myAdapter.addFragment(new BlankFragment2(), "HORARIO" );
        myAdapter.addFragment(new BlankFragment3(), "ACTDATOS" );

        viewPager.setAdapter(myAdapter);
    }
}
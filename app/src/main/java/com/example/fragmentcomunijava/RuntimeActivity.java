package com.example.fragmentcomunijava;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fragmentcomunijava.Fragments.FirstFragment;
import com.example.fragmentcomunijava.Fragments.SecondFragment;

public class RuntimeActivity extends AppCompatActivity implements FirstFragment.FirstListener, SecondFragment.SecondListener {

    FirstFragment firstFragment;
    SecondFragment secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runtime);
        initViews();

    }

    @Override
    public void onFirstSecond(String str) {
        secondFragment.updateSecondtext(str);
    }

    @Override
    public void onSecondSend(String str) {
        firstFragment.updateFirstText(str);
    }

    void initViews() {
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.firstfragnent,
                firstFragment).replace(R.id.secondfragment,secondFragment).commit();
    }
}
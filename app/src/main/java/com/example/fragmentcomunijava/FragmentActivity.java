package com.example.fragmentcomunijava;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fragmentcomunijava.Fragments.FirstFragment;
import com.example.fragmentcomunijava.Fragments.SecondFragment;

public class FragmentActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

    }


}
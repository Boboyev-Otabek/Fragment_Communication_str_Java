package com.example.fragmentcomunijava.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragmentcomunijava.R;

public class FirstFragment extends Fragment {
    private FirstListener listener;
    private TextView txt_first;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        txt_first = view.findViewById(R.id.txt_first);
        Button b_first = view.findViewById(R.id.b_first);
        b_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onFirstSecond("ACADEMY");
            }
        });

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof FirstListener) {
            listener = (FirstListener) context;
        } else {
            throw new RuntimeException(context.toString());
        }

    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    public void updateFirstText(String str) {
        txt_first.setText(str);
    }

    public interface FirstListener {
        void onFirstSecond(String str);
    }
}

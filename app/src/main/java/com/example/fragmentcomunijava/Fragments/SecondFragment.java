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

public class SecondFragment extends Fragment {

    private SecondListener listener;
    private TextView txt_second;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        txt_second = view.findViewById(R.id.txt_second);
        Button b_second = view.findViewById(R.id.b_second);
        b_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onSecondSend("PDP");
            }
        });
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof SecondListener) {
            listener = (SecondListener) context;
        } else {
            throw new RuntimeException(context.toString());
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    public void updateSecondtext(String str) {
        txt_second.setText(str);
    }

    public interface SecondListener {
        void onSecondSend(String str);
    }

}

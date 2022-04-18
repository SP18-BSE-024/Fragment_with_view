package com.example.fragmentusingviewmodel;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Left extends Fragment {
    private StringViewModel stv;
    private Button btn11,btn22;
    private EditText ed1;

    public Left() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        stv = new ViewModelProvider((MainActivity)context).get(StringViewModel.class);
    }

    public static Left newInstance(String param1, String param2) {
        Left fragment = new Left();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_left, container, false);
           btn11= view.findViewById(R.id.btn1);
           btn22= view.findViewById(R.id.btn2);
           ed1=view.findViewById(R.id.ed1);
           btn11.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   stv.setMessage(ed1.getText().toString());
               }
           });
           btn22.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   String s="hello there";
                   stv.setMessage(s);
               }
           });

        return view;

    }
}
package com.example.fragmentusingviewmodel;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class Right extends Fragment {
    private StringViewModel DataViewModel;
    private TextView ed;

    public Right() {
        // Required empty public constructor
    }


    //
    public static Right newInstance(String param1, String param2) {
        Right fragment = new Right();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        DataViewModel =new ViewModelProvider((MainActivity)context).get(StringViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_right, container, false);
        ed=v.findViewById(R.id.b);
        MutableLiveData<String> mtl=DataViewModel.getMessage();
        mtl.observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                ed.setText(s);
            }
        });
        return v;





    }
}
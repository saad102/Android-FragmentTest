package com.example.fragment;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class secondFragment extends Fragment {

    private static TextView txtTop;
    private static TextView txtBottom;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        txtTop = (TextView)view.findViewById(R.id.first_text);
        txtBottom = (TextView)view.findViewById(R.id.second_text);
        return view;
    }

    public void setClickedText(String top, String bottom){
        txtTop.setText(top);
        txtBottom.setText(bottom);
    }

}
package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements firstFragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView first_text=(TextView)findViewById(R.id.first_text);
        TextView second_text=(TextView)findViewById(R.id.second_text);

    }

    @Override
    public void createClick(String top, String bottom) {
        secondFragment bottomSection = (secondFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomSection.setClickedText(top, bottom);
    }
}

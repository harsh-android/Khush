package com.rnw.khush;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    TextView f_hobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        f_hobby = findViewById(R.id.f_hobby);
  
        String hobby = getIntent().getStringExtra("hobby");
        f_hobby.setText("Hobby : "+hobby);

    }
}
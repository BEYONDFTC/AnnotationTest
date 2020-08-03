package com.example.annotationtest;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

@Lance(id = "",value = 0)
public class MainActivity extends AppCompatActivity {

    @InJectView(R.id.tv)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectUtils.toInject(this);
        textView.setText("坚持！");
    }
}
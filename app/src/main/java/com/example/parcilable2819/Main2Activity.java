package com.example.parcilable2819;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tv_name1,tv_name2,tv_age;
    public static final String PERSON="person";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_name1=findViewById(R.id.tv_name1);
        tv_name2=findViewById(R.id.tv_name2);
        tv_age=findViewById(R.id.tv_age);

        Person person = getIntent().getParcelableExtra(PERSON);

        tv_name1.setText(person.getFirstname());
        tv_name2.setText(person.getLastname());
        tv_age.setText(String.valueOf(person.getAge()));


    }
}

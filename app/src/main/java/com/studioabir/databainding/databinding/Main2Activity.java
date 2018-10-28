package com.studioabir.databainding.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.studioabir.databainding.databinding.databinding.ActivityMain2Binding;

public class Main2Activity extends AppCompatActivity {


    private ActivityMain2Binding main2Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main2Binding = DataBindingUtil.setContentView(this,R.layout.activity_main2);

        Person mperson = new Person("Abir", "coxtunes");
        main2Binding.setMyvariable(mperson);
    }
}

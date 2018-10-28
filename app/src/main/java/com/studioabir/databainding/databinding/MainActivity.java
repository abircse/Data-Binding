package com.studioabir.databainding.databinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.studioabir.databainding.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {



    ///----------Initialize data binding with same name of xml
    /// file+binding where we use layout tag as root---/

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ///-------Remove old set content view-----------///
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.text1.setText("Abir");
        binding.text2.setText("Coxtunes Software Limited");
        binding.n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
            }
        });







    }
}

package com.example.ejercicio_individual_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.ejercicio_individual_11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button1.setOnClickListener(v -> {
            String  msg1 = getString(R.string.txt_btn_1);
            Toast.makeText(MainActivity.this, msg1, Toast.LENGTH_SHORT).show();
        });
        binding.button2.setOnClickListener(v -> {
            String  msg2 = getString(R.string.txt_btn_2);
            Toast.makeText(MainActivity.this, msg2, Toast.LENGTH_SHORT).show();
        });
        binding.button3.setOnClickListener(v -> {
            String  msg3 = getString(R.string.txt_btn_3);
            Toast.makeText(MainActivity.this, msg3, Toast.LENGTH_SHORT).show();
        });
        binding.button4.setOnClickListener(v -> {
            String  msg4 = getString(R.string.txt_btn_4);
            Toast.makeText(MainActivity.this, msg4, Toast.LENGTH_SHORT).show();
        });
        binding.button5.setOnClickListener(v -> {
            String  msg5 = getString(R.string.txt_btn_5);
            Toast.makeText(MainActivity.this, msg5, Toast.LENGTH_SHORT).show();
        });
        binding.button6.setOnClickListener(v -> {
            String  msg6 = getString(R.string.txt_btn_6);
            Toast.makeText(MainActivity.this, msg6, Toast.LENGTH_SHORT).show();
        });
    }
}
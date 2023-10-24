package com.example.tp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tp1.databinding.ActivityCreationquestionBinding;
import com.example.tp1.databinding.ActivityMainBinding;

public class ActivityCreationQuestion extends AppCompatActivity {
    private ActivityCreationquestionBinding binding;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_creationquestion);
        binding = ActivityCreationquestionBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.btnAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityCreationQuestion.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}

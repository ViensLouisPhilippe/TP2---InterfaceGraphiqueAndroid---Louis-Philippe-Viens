package com.example.tp1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Random;

public class ListeDesQuestion extends AppCompatActivity {

    QuestionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialisation du recycler
        this.initRecycler();
        this.remplirRecycler();
    }

    private void initRecycler() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        adapter = new QuestionAdapter();
        recyclerView.setAdapter(adapter);
    }
    private void remplirRecycler() {
        for (int i = 0 ; i < 4 ; i++) {
            Question p = new Question();
            p.Text = "Bob ?";
            adapter.list.add(p);
        }
        adapter.notifyDataSetChanged();
    }
}

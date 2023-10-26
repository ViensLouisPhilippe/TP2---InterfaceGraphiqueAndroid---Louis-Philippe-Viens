package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import com.example.tp1.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    QuestionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



        binding.btnCreationQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ActivityCreationQuestion.class);
                startActivity(i);
            }
        });
        this.initRecycler();
        this.remplirRecycler();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_search) {
            Toast.makeText(getApplicationContext(),"TODO Search",Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(),"Should go to settings",Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.action_poptoast) {
            Toast.makeText(getApplicationContext(),"Toast",Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initRecycler() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        adapter = new QuestionAdapter();
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);

    }
    private void remplirRecycler() {
        adapter.list.clear();
        Question a = new Question();
        a.Text = "Que penses-tu de l'ascension de la déscolarisation?";
        Question b = new Question();
        b.Text = "Que penses-tu du gouvernement Trudeau?";
        Question c = new Question();
        c.Text = "Que penses-tu du cours de prog web?";
        Question d = new Question();
        d.Text = "Que penses-tu de game of thrones?";
        Question e = new Question();
        e.Text = "Que penses-tu de trump?";
        Question f = new Question();
        f.Text = "Que penses-tu de programmation 3?";
        Question g = new Question();
        g.Text = "Que penses-tu de la danse?";
        Question h = new Question();
        h.Text = "Que penses-tu de révolution?";
        Question i = new Question();
        i.Text = "Que penses-tu du superbowl?";
        Question j = new Question();
        j.Text = "Que penses-tu de la musique?";
        Question k = new Question();
        k.Text = "Que penses-tu du genre rock?";
        Question l = new Question();
        l.Text = "Que penses-tu du genre house?";
        Question m = new Question();
        m.Text = "Que penses-tu du genre hip hop?";
        Question n = new Question();
        n.Text = "Que penses-tu du genre pop?";
        Question o = new Question();
        o.Text = "Que penses-tu du genre R&B?";
        Question p = new Question();
        p.Text = "Que penses-tu des artistes canadiens?";
        Question q = new Question();
        q.Text = "Que penses-tu de la situation en Israël?";
        Question r = new Question();
        r.Text = "Que penses-tu du canadien de montréal?";
        Question s = new Question();
        s.Text = "Que penses-tu du soccer au Canada?";
        Question t = new Question();
        t.Text = "Que penses-tu des médias sociaux?";
        adapter.list.add(a);
        adapter.list.add(b);
        adapter.list.add(c);
        adapter.list.add(d);
        adapter.list.add(e);
        adapter.list.add(f);
        adapter.list.add(g);
        adapter.list.add(h);
        adapter.list.add(i);
        adapter.list.add(j);
        adapter.list.add(k);
        adapter.list.add(l);
        adapter.list.add(m);
        adapter.list.add(n);
        adapter.list.add(o);
        adapter.list.add(p);
        adapter.list.add(q);
        adapter.list.add(r);
        adapter.list.add(s);
        adapter.list.add(t);

        adapter.notifyDataSetChanged();

    }
}
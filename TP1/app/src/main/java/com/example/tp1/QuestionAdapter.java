package com.example.tp1;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.MyViewHolder>{
    public List<Question> list;

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView tvQuestion;
        public MyViewHolder(LinearLayout v) {
            super(v);
            tvQuestion = v.findViewById(R.id.tvQuestion);
        }
    }
    public QuestionAdapter(){
        list = new ArrayList<>();
    }

    @Override
    public QuestionAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        // create a new view
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        Log.i("DEBOGAGE", "appel a onCreateViewHolder");
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Question personneCourante = list.get(position);
        holder.tvQuestion.setText(personneCourante.Text);
        Log.i("DEBOGAGE", "appel a onBindViewHolder " + position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

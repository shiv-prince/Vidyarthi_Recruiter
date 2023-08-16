package com.example.vidyarthirecruiter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    LayoutInflater inflater;
    List<Student> students;

    public Adapter(Context inflater, List<Student> students) {
        this.inflater = LayoutInflater.from(inflater);
        this.students = students;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_list_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.name.setText(students.get(position).getName());
        holder.clg.setText(students.get(position).getCollegeName());
        holder.gpa.setText(students.get(position).getGpa());
        holder.points.setText(students.get(position).getScore());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        TextView name,clg,gpa,points;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            clg = itemView.findViewById(R.id.clg);
            gpa = itemView.findViewById(R.id.gpa);
            points = itemView.findViewById(R.id.points);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "More info", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}

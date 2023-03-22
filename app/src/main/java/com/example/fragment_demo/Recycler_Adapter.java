package com.example.fragment_demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class Recycler_Adapter extends RecyclerView.Adapter<Recycler_Adapter.View_Holder> {
    Fragment fragment;
    String[] app;
    String[] name;
    public Recycler_Adapter(Fragment fragment, String[] app) {
        this.app=app;
//        this.name=name;
        this.fragment=fragment;
    }


    @NonNull
    @Override
    public Recycler_Adapter.View_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        View_Holder view_holder=new View_Holder(view);
        return view_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Recycler_Adapter.View_Holder holder, int position) {
        holder.textView.setText(app[position]);
    }

    @Override
    public int getItemCount() {
        return app.length;
    }

    public class View_Holder extends RecyclerView.ViewHolder {
        TextView textView;
        public View_Holder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.txt);
        }
    }
}

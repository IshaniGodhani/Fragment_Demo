package com.example.fragment_demo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Fragment_Two extends Fragment {
    RecyclerView recyclerView;
    String[] app={"facebook","twitter","whatsapp","instagram","you tube","hike","google",
    "snapchat","gmail"};
    Recycler_Adapter recycler_adapter;
    public Fragment_Two() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view=inflater.inflate(R.layout.fragment_two, container, false);
        recyclerView=view.findViewById(R.id.recyclerview2);
        recycler_adapter=new Recycler_Adapter(this,app);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recycler_adapter);
        return view;
    }
}
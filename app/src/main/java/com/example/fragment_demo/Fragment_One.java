package com.example.fragment_demo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class Fragment_One extends Fragment {

    RecyclerView recyclerView1;
    Recycler_Adapter recycler_adapter;
    String[] app={"facebook","twitter","whatsapp","instagram","you tube","hike",
            "google","snapchat","gmail"};
    public Fragment_One() {
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
        View view1=inflater.inflate(R.layout.fragment_one, container, false);
        recyclerView1=view1.findViewById(R.id.recyclerview1);
        recycler_adapter=new Recycler_Adapter(this,app);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView1.setLayoutManager(linearLayoutManager);
        recyclerView1.setAdapter(recycler_adapter);
    return view1;
    }
}
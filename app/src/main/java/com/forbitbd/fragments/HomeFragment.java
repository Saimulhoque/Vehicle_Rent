package com.forbitbd.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.forbitbd.vehiclerent.MainActivity;
import com.forbitbd.vehiclerent.R;
import com.forbitbd.vehiclerent.TripPostActivity;
import com.google.android.material.button.MaterialButton;

public class HomeFragment extends Fragment  {

    private MaterialButton btnnext;

    public HomeFragment() {
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
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btnnext = view.findViewById(R.id.next);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), TripPostActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}

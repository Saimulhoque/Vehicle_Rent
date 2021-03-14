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

public class TripFragment extends Fragment {

    private MaterialButton btncreatetrip;

    public TripFragment() {
        // Required empty public constructor
    }

    public static TripFragment newInstance(String param1, String param2) {
        TripFragment fragment = new TripFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_trip, container, false);

        btncreatetrip = view.findViewById(R.id.createtrip);
        btncreatetrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
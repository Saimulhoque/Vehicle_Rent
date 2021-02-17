package com.forbitbd.fragments;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.forbitbd.vehiclerent.R;
import com.google.android.material.button.MaterialButton;

public class RecipientFragment extends Fragment {

    private MaterialButton btnvehiclephoto;

    // TODO: Rename parameter arguments, choose names that match

    public RecipientFragment() {
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
        View view = inflater.inflate(R.layout.fragment_recipient, container, false);

        btnvehiclephoto = view.findViewById(R.id.vehicleimage);
        btnvehiclephoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent3=new   Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                startActivity(Intent3);
            }
        });
        return view;
    }
}
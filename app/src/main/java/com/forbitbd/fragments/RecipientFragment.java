package com.forbitbd.fragments;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.forbitbd.vehiclerent.R;
import com.google.android.material.button.MaterialButton;

public class RecipientFragment extends Fragment {

    private MaterialButton btnvehiclephoto;
    private AutoCompleteTextView vehiclecapacity,vehicletype;




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

        vehiclecapacity = view.findViewById(R.id.vehiclecapacity);
        vehicletype = view.findViewById(R.id.vehicletype);
        String[] VehicleCapacity = getResources().getStringArray(R.array.VehicleCapacity);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_dropdown_item,VehicleCapacity);
        vehiclecapacity.setAdapter(adapter);

        btnvehiclephoto = view.findViewById(R.id.vehicleimage);
        btnvehiclephoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                startActivity(Intent);
            }
        });
        return view;
    }

}
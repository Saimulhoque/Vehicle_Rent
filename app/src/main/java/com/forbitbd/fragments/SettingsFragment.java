package com.forbitbd.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.forbitbd.vehiclerent.LoginActivity;
import com.forbitbd.vehiclerent.PrivacyPolicyActivity;
import com.forbitbd.vehiclerent.R;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;

public class SettingsFragment extends Fragment implements View.OnClickListener {

    private MaterialButton btnlogout,btnhelpline,btnpolicy;

    public SettingsFragment() {
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
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        btnhelpline = view.findViewById(R.id.helpline);
        btnlogout = view.findViewById(R.id.logout);
        btnpolicy = view.findViewById(R.id.privacypolicy);
        btnlogout.setOnClickListener(this);
        btnpolicy.setOnClickListener(this);
        btnhelpline.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.logout){
            FirebaseAuth.getInstance().signOut();
            Intent intent = new Intent(getContext(), LoginActivity.class);
            startActivity(intent);
        }else if(id == R.id.helpline){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:01881269553"));
            startActivity(intent);
        }else if(id == R.id.privacypolicy){
            Intent intent = new Intent(getContext(), PrivacyPolicyActivity.class);
            startActivity(intent);
        }
    }
}
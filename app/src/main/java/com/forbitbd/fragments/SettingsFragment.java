package com.forbitbd.fragments;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.forbitbd.vehiclerent.login.LoginActivity;
import com.forbitbd.vehiclerent.PrivacyPolicyActivity;
import com.forbitbd.vehiclerent.ProfileActivity;
import com.forbitbd.vehiclerent.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;
import com.mikhaellopez.circularimageview.CircularImageView;
import com.squareup.picasso.Picasso;

public class SettingsFragment extends Fragment implements View.OnClickListener {

    private MaterialButton btnlogout, btnhelpline, btnpolicy,btnprofile;
    TextView username,useremail;
    CircularImageView imageView;
    GoogleSignInClient mGoogleSignInClient;

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

        username = view.findViewById(R.id.username);
        useremail = view.findViewById(R.id.useremail);
        imageView = view.findViewById(R.id.userphoto);

        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getContext());
        username.setText(account.getDisplayName());
        useremail.setText(account.getEmail());
        Picasso.with(getContext()).load(account.getPhotoUrl()).into(imageView);

        btnprofile = view.findViewById(R.id.profile);
        btnhelpline = view.findViewById(R.id.helpline);
        btnlogout = view.findViewById(R.id.logout);
        btnpolicy = view.findViewById(R.id.privacypolicy);

        btnprofile.setOnClickListener(this);
        btnlogout.setOnClickListener(this);
        btnpolicy.setOnClickListener(this);
        btnhelpline.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.logout) {
            FirebaseAuth.getInstance().signOut();
           Intent intent = new Intent(getContext(),LoginActivity.class);
           startActivity(intent);
        } else if (id == R.id.helpline) {
            String number="01881269553";
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setData(Uri.parse("tel:"+number));
            startActivity(intent);
        } else if (id == R.id.privacypolicy) {
            Intent intent = new Intent(getContext(), PrivacyPolicyActivity.class);
            startActivity(intent);
        }else if (id == R.id.profile){
            Intent intent = new Intent(getContext(), ProfileActivity.class);
            startActivity(intent);
        }
    }
}
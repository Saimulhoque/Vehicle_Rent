package com.forbitbd.vehiclerent;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Build;
import android.os.Bundle;
import com.forbitbd.fragments.DonorFragment;
import com.forbitbd.fragments.RecipientFragment;
import com.google.android.material.tabs.TabLayout;

public class RegistrationActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private DonorFragment donorFragment;
    private RecipientFragment recipientFragment;
    private ViewPager viewPager;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewpager);
        donorFragment  = new DonorFragment();
        recipientFragment = new RecipientFragment();
        tabLayout.setupWithViewPager(viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),0);
        viewPagerAdapter.addFragment(donorFragment, "Trip Donor");
        viewPagerAdapter.addFragment(recipientFragment, "Trip Recipient");
        viewPager.setAdapter(viewPagerAdapter);
    }
}
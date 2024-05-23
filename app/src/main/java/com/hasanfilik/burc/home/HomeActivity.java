package com.hasanfilik.burc.home;

import android.os.Bundle;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.hasanfilik.burc.R;
import com.hasanfilik.burc.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        initializeToolBars();
        initializeDrawerLayout();
        setOnClickListeners();

        setContentView(binding.getRoot());
    }

    private void setOnClickListeners() {
        binding.toolbar.setNavigationOnClickListener(v -> binding.getRoot().openDrawer(GravityCompat.START));
    }

    private void initializeDrawerLayout() {
        toggle = new ActionBarDrawerToggle(this, binding.getRoot(), 0, 0);
        binding.getRoot().addDrawerListener(toggle);
        toggle.syncState();
    }

    private void initializeToolBars() {
        setSupportActionBar(binding.toolbar);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.homeFragmentContainer);
        NavigationUI.setupWithNavController(
                binding.bottomNavigationView,
                navHostFragment.getNavController()
        );
    }
}
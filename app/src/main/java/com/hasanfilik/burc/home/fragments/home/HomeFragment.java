package com.hasanfilik.burc.home.fragments.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.hasanfilik.burc.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private HomeViewModel viewModel;
    private final HomeListAdapter listAdapter = new HomeListAdapter();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        viewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        viewModel.getHomeList().observe(getViewLifecycleOwner(), listAdapter::setList);
        viewModel.loadHoroscopeList();
        initializeRecyclerView();
        return binding.getRoot();
    }

    private void initializeRecyclerView() {
        binding.getRoot().setAdapter(listAdapter);
    }
}
package com.hasanfilik.burc.home.fragments.compatibility;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.hasanfilik.burc.databinding.FragmentCommentsBinding;
import com.hasanfilik.burc.databinding.FragmentCompatibilityBinding;


public class CompatibilityFragment extends Fragment {

    private FragmentCompatibilityBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCompatibilityBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
package com.hasanfilik.burc.home.fragments.dailyInfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.hasanfilik.burc.databinding.FragmentCommentsBinding;
import com.hasanfilik.burc.databinding.FragmentDailyInfoBinding;


public class DailyInfoFragment extends Fragment {

    private FragmentDailyInfoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDailyInfoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
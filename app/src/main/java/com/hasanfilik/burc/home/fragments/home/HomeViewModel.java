package com.hasanfilik.burc.home.fragments.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.hasanfilik.burc.R;
import com.hasanfilik.burc.model.HomeListData;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<HomeListData>> homeList = new MutableLiveData<>();

    public LiveData<ArrayList<HomeListData>> getHomeList() {
        return homeList;
    }

    public void loadHoroscopeList() {
        homeList.setValue(buildList());
    }

    private ArrayList<HomeListData> buildList() {
        ArrayList<HomeListData> list = new ArrayList<>();
        list.add(new HomeListData("Kova", R.drawable.aquarius200));
        list.add(new HomeListData("Koç", R.drawable.aries200));
        list.add(new HomeListData("Yengeç", R.drawable.cancer200));
        list.add(new HomeListData("Oğlak", R.drawable.capricorn200));
        list.add(new HomeListData("İkizler", R.drawable.gemini200));
        list.add(new HomeListData("Aslan", R.drawable.leo200));
        list.add(new HomeListData("Terazi", R.drawable.libra200));
        list.add(new HomeListData("Balık", R.drawable.pisces200));
        list.add(new HomeListData("Yay", R.drawable.sagittarius200));
        list.add(new HomeListData("Akrep", R.drawable.scorpio200));
        list.add(new HomeListData("Boğa", R.drawable.taurus200));
        list.add(new HomeListData("Başak", R.drawable.virgo200));
        return list;
    }
}

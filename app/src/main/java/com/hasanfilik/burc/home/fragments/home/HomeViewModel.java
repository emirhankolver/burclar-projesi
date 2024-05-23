package com.hasanfilik.burc.home.fragments.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.hasanfilik.burc.R;
import com.hasanfilik.burc.model.horoscope.Horoscope;
import com.hasanfilik.burc.model.horoscope.list.HoroscopeAquarius;
import com.hasanfilik.burc.model.horoscope.list.HoroscopeAries;
import com.hasanfilik.burc.model.horoscope.list.HoroscopeCancer;
import com.hasanfilik.burc.model.horoscope.list.HoroscopeCapricorn;
import com.hasanfilik.burc.model.horoscope.list.HoroscopeGemini;
import com.hasanfilik.burc.model.horoscope.list.HoroscopeLeo;
import com.hasanfilik.burc.model.horoscope.list.HoroscopeLibra;
import com.hasanfilik.burc.model.horoscope.list.HoroscopePisces;
import com.hasanfilik.burc.model.horoscope.list.HoroscopeSagittarius;
import com.hasanfilik.burc.model.horoscope.list.HoroscopeScorpio;
import com.hasanfilik.burc.model.horoscope.list.HoroscopeTaurus;
import com.hasanfilik.burc.model.horoscope.list.HoroscopeVirgo;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<Horoscope>> homeList = new MutableLiveData<>();

    public LiveData<ArrayList<Horoscope>> getHomeList() {
        return homeList;
    }

    public void loadHoroscopeList() {
        homeList.setValue(buildList());
    }

    private ArrayList<Horoscope> buildList() {
        ArrayList<Horoscope> list = new ArrayList<>();
        list.add(new HoroscopeAquarius());
        list.add(new HoroscopeAries());
        list.add(new HoroscopeCancer());
        list.add(new HoroscopeCapricorn());
        list.add(new HoroscopeGemini());
        list.add(new HoroscopeLeo());
        list.add(new HoroscopeLibra());
        list.add(new HoroscopePisces());
        list.add(new HoroscopeSagittarius());
        list.add(new HoroscopeScorpio());
        list.add(new HoroscopeTaurus());
        list.add(new HoroscopeVirgo());
        return list;
    }
}

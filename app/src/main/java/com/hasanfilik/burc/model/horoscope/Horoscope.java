package com.hasanfilik.burc.model.horoscope;

import android.os.Parcelable;

import androidx.annotation.DrawableRes;

public interface Horoscope extends Parcelable {
    String getName();
    String getDescription();
    @DrawableRes
    int getDrawableId();
}

package com.hasanfilik.burc.model;

import androidx.annotation.DrawableRes;

public class HomeListData {
    private final String name;
    @DrawableRes
    private final int drawableId;

    public HomeListData(String name, int drawableId) {
        this.name = name;
        this.drawableId = drawableId;
    }

    public String getName() {
        return name;
    }

    public int getDrawableId() {
        return drawableId;
    }


}

package com.fima.cardsui.objects;

import android.content.Context;
import android.view.View;

public abstract class AbstractCard {

    protected int image;

    protected String description, color, titleColor, desc, title, titlePlay;

    protected Boolean hasOverflow, isClickable;

    public abstract View getView(Context context);

    public abstract View getView(Context context, boolean swipable);

    public String getTitle() {
        return title;
    }

    public String getTitlePlay() {
        return titlePlay;
    }

    public String getDesc() {
        return desc;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    public String getColor() {
        return color;
    }

    public String getTitleColor() {
        return titleColor;
    }

    public Boolean getHasOverflow() {
        return hasOverflow;
    }

    public Boolean getIsClickable() {
        return isClickable;
    }

}

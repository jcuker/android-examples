package com.jordancuker.recyclerviewexample;

public class DataHolder {
    private String text;
    private int resId;

    public DataHolder(String text, int resId) {
        this.text = text;
        this.resId = resId;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
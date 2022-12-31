package com.demo.forevergems;

public class NumbersView {
    private int ivNumbersImageId;

    private String mNumbersInText;

    public NumbersView(int NumbersImageId, String NumbersInText) {
        ivNumbersImageId = NumbersImageId;
        mNumbersInText = NumbersInText;
    }

    public int getNumbersImageId() {
        return ivNumbersImageId;
    }

    public String getNumbersInText() {
        return mNumbersInText;
    }
}

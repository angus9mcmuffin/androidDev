package com.example.jason.diceroller;

/**
 * Created by Jason on 1/22/2017.
 */

public class Dice {
    private int mMaxVal;

    public Dice(int minVal, int maxVal) {
        mMaxVal = maxVal;
    }

    public int getMaxVal() {
        return mMaxVal;
    }

    public void setMaxVal(int maxVal) {
        mMaxVal = maxVal;
    }

    public int rollDice() {
        return (int)(Math.random() * getMaxVal());
    }
}

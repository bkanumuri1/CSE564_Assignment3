package com.company;

import java.util.Observable;

public class RandomNumberGenerator extends Observable {

    private int generatedData;

    public int getGeneratedData() {
        return generatedData;
    }

    public void generator () {
        generatedData = (int) (Math.random()*200 + (1));
        setChanged();
        notifyObservers();
    }

}


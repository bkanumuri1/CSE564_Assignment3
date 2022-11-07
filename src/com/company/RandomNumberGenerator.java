package com.company;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerator extends Observable {

    private List<Integer> randomNumbers = new ArrayList<>();
    private static RandomNumberGenerator data;

    private RandomNumberGenerator(){
    }

    public static RandomNumberGenerator getRandomNumberGenerator() {
		if (data == null)
			data = new RandomNumberGenerator();
		return data;
	}
    
    public void generate () {
        for(int i=0;i<50;i++)
            randomNumbers.add( (int) (Math.random() * 200) + 1);        
        notifyObservers();
    }

    @Override
    public void notifyObservers(){
        this.getObserver().update(randomNumbers);
    }

    public List<Integer> getData() {
		return randomNumbers;
	}
}


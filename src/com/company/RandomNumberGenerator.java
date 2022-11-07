package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

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
            TimerTask task = new TimerTask() {
            public void run() {
                randomNumbers.add( (int) (Math.random() * 200) + 1);
                notifyObservers();
            }
        };
        Timer timer = new Timer(true);
        timer.schedule(task, 0, 500); 
    }

    @Override
    public void notifyObservers(){
        this.getObserver().update(randomNumbers);
    }

    public List<Integer> getData() {
		return randomNumbers;
	}
}


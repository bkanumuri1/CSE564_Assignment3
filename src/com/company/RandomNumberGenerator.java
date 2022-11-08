package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Randomly generates integers to be plotted on the graph. Extends from the Observable class, is observed by PlotPanel
 * @author Haritej Lakshmi Narayan , Bhavana Priya Kanumuri
 */
public class RandomNumberGenerator extends Observable {

    private List<Integer> randomNumbers = new ArrayList<>();
    private static RandomNumberGenerator data;

    private RandomNumberGenerator(){
    }
    /**
     * creates an instance of RandomNumberGenerator (singleton pattern)
     * @return data of randomly generated integers
     */
    public static RandomNumberGenerator getRandomNumberGenerator() {
		if (data == null)
			data = new RandomNumberGenerator();
		return data;
	}

    /**
     * generates the integers randomly with a time gap
     */
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

    /**
     * notifies observers
     */
    @Override
    public void notifyObservers(){
        this.getObserver().update(randomNumbers);
    }

    /**
     * @return arraylist of integers randomly generated
     */
    public List<Integer> getData() {
		return randomNumbers;
	}
}


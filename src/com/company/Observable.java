package com.company;
/**
 * Observable class that is inherited by RandomNumberGenerator
 * @author Haritej Lakshmi Narayan , Bhavana Priya Kanumuri
 */
public abstract class Observable {
    private Observer observer;
    public Observer getObserver(){ return observer; }

    /**
     * sets the observer
     * @param observer
     */
    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    public abstract void notifyObservers();
}
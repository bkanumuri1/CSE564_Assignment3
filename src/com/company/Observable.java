package com.company;

public abstract class Observable {
    private Observer observer;
    public Observer getObserver(){ return observer; }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    public abstract void notifyObservers();
}
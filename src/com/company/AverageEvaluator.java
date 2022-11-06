package com.company;

public class AverageEvaluator {

    private static AverageEvaluator instance;
    private AverageEvaluator(){
    }

    public static AverageEvaluator getInstance(){
        if(instance == null){
            instance = new AverageEvaluator();
        }
        return instance;
    }

    public void calculate(){}
}

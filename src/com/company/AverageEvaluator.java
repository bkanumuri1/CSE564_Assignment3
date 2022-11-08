package com.company;
/**
 * Singleton class that calculates the average of data points generated in graph
 * @author Haritej Lakshmi Narayan , Bhavana Priya Kanumuri
 */
public class AverageEvaluator {
    private static AverageEvaluator instance;
    private AverageEvaluator() {
    }
    /**
     * creates a new instance if there is no instance present or returns a pre-existing instance
     * @return instance of average evaluator
     */
    public static AverageEvaluator getAverageEvaluator(){
        if(instance == null){
            instance = new AverageEvaluator();
        }
        return instance;
    }
    /**
     * Calculates the
     * @param total sum of all values randomly generated in graph
     * @param size of values present in graph at that instant of time
     * @return int average of data points generated in graph
     */
    public int calculate(int total, int size){
        return total/size;
    }
}

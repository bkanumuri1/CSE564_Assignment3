package com.company;
import java.util.*;
import java.awt.Point;
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
     * @param list of random Points
     * @return int average of data points generated in graph
     */
    public int calculate(List<Point> points){
        int total = 0;
        int size=points.size();
       for (int i = 0; i < size; i++) {
           total+= points.get(i).y;
       }
       return total/size;
    }
}

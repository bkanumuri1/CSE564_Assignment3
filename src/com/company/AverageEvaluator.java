package com.company;
import java.util.List;

public class AverageEvaluator {

    private static AverageEvaluator instance;
    
    private AverageEvaluator(){
    }

    public static AverageEvaluator getAverageEvaluator(){
        if(instance == null){
            instance = new AverageEvaluator();
        }
        return instance;
    }

    public int calculate(List<Integer> data){
        int sum=0;
        for(int i: data)
            sum+=i;
        return sum/data.size();
    }
}

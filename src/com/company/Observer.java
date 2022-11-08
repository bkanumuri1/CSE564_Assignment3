package com.company;
import java.util.List;

/**
 * Observer class that is realized by PlotPanel
 * @author Haritej Lakshmi Narayan , Bhavana Priya Kanumuri
 */
public interface Observer {
    public abstract void update(List<Integer> data);
}

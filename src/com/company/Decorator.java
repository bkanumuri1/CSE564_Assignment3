package com.company;
import javax.swing.*;
/**
 * Decorator parent class that defines properties for its decorators. Extension of JPanel and implements the Drawable interface
 * @author Haritej Lakshmi Narayan , Bhavana Priya Kanumuri
 */
public abstract class Decorator extends JPanel implements Drawable{
    Drawable drawable;
    public void addDecorator(Drawable d){
        drawable=d;
    }
    @Override
    public JPanel draw(){
        return drawable.draw();
    }
}

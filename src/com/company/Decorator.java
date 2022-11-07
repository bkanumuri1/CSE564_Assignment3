package com.company;

import javax.swing.*;
public abstract class Decorator extends JPanel implements Drawable{
    
    Drawable drawable;

//    public Decorator(Drawable d){
//        drawable=d;
//    }

    public void addDecorator(Drawable d){
        drawable=d;
    }

    @Override
    public JPanel draw(){
        return drawable.draw();
    }

}

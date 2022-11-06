package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class PlotPanel extends JPanel implements Observer {

    PlotPanel(){
        JPanel panel1 = new JPanel();
        panel1.setBounds(50,70,10,10);
        panel1.setSize(850,200);
        panel1.add(new JLabel("This is panel 1"));
        panel1.setBackground(Color.lightGray);
        add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setBounds(50,350,10,10);
        panel2.setSize(850,200);
        panel2.add(new JLabel("This is panel 2"));
        panel2.setBackground(Color.LIGHT_GRAY);
        add(panel2);

        JPanel panel3 = new JPanel();
        panel3.setBounds(50,450,10,10);
        panel3.setSize(850,200);
        panel3.add(new JLabel("This is panel 3"));
        panel3.setBackground(Color.LIGHT_GRAY);
        add(panel3);
    }

    @Override
    public void update(Observable o, Object arg) {
        int randomNumber = ((RandomNumberGenerator) o).getGeneratedData();
        System.out.println(randomNumber);
    }
}

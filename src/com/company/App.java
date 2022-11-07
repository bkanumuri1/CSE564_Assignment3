package com.company;
import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {

    static RandomNumberGenerator data= RandomNumberGenerator.getRandomNumberGenerator();
    static PlotPanel plotPanel = PlotPanel.getPlotPanel();
    
    App(){ 
         add(plotPanel.parentPanel);
        JButton runButton = new JButton("Run");
        runButton.setBounds(0,600,500,50);
        runButton.addActionListener(this);
        add(runButton);
        setSize(500,700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){ 
        data.generate();
    }

    public static void main(String[] args) {
        data.setObserver(plotPanel);
        new App();
    }
}

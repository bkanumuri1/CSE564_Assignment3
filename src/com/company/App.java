package com.company;
import javax.swing.*;
import java.awt.event.*;
/**
 * App class initializes the GUI, inherits from JFrame and implements ActionListener interface
 * @author Haritej Lakshmi Narayan , Bhavana Priya Kanumuri
 */
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
    /**
     * @param e action event that is generated on button click
     */
    public void actionPerformed(ActionEvent e){
        data.generate();
    }
    /**
     * @param args string of arguments
     */
    public static void main(String[] args) {
        data.setObserver(plotPanel);
        new App();
    }
}

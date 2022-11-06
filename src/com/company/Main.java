package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    JFrame frame;

    Main(){

        new PlotPanel();

        JButton button = new JButton("Run");
        button.setBounds(50,730,10,10);
        button.setSize(850,250);
        add(button);
        setSize(950,1050);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

//
    }

    public static void main(String[] args) {
	// write your code here
        new Main();
    }
}

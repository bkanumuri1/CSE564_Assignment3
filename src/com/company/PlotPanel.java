package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class PlotPanel implements Observer {
    protected List<Integer> data = new ArrayList<>();
    static protected PlotPanel plotPanel;
    protected JPanel linePanel, dotPanel, barPanel;
    protected JLayeredPane parentPanel;
    private PlotPanel(){
        parentPanel = new JLayeredPane();
        parentPanel.setBounds(0,0,500,600);
        parentPanel.setBackground(Color.gray);
    }

    public static PlotPanel getPlotPanel(){
        if(plotPanel==null)
            plotPanel= new PlotPanel();
        return plotPanel;
    }

    @Override
    public void update(List<Integer> data) {
        this.data=data;
        drawPanels(data);
    }

    public void drawPanels(List<Integer> data){
         Drawable linePlot = new Line();
         linePanel = linePlot.draw();
         linePanel.setBounds(0,400,500,200);
         linePanel.setBackground(Color.GRAY);
         parentPanel.add(linePanel);

         Line linePlot2 = new Line();
         Dots dotPlot = new Dots();
         dotPlot.addDecorator(linePlot2);
         dotPanel = dotPlot.draw();
         dotPanel.setBounds(0,200,500,200);
         dotPanel.setBackground(Color.LIGHT_GRAY);
         parentPanel.add(dotPanel);

         Line linePlot3 = new Line();
         Dots dotPlot2 = new Dots();
         Bar barPlot = new Bar();
         dotPlot2.addDecorator(linePlot3);
         barPlot.addDecorator(dotPlot2);
         barPanel = barPlot.draw();
         barPanel.setBounds(0,0,500,200);
         barPanel.setBackground(Color.WHITE);
         parentPanel.add(barPanel);

    }

}

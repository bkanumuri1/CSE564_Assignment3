package com.company;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.List;

/**
 * Base class for the decorator pattern. It's decorators are dots and bar classes.
 * @author Haritej Lakshmi Narayan , Bhavana Priya Kanumuri
 */
public class Line extends JPanel implements Drawable {
    @Override
    /**
     * method inherited from parent class(Decorator) to create a new JPanel
     * @return new panel
     */
    public JPanel draw() {
        System.out.println("Line");
        return new Line();
  }
   @Override
   /**
    * Plots the graph in panel
    * @param g creates the basic line graph
    */
   public void paint(Graphics g) {
       super.paint(g);
       Graphics2D g2 = (Graphics2D)g;
       g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

       double xScale = ((double) getWidth() - 2 * BORDER_GAP) / (data.getData().size() - 1);
       double yScale = ((double) getHeight() - 2 * BORDER_GAP) / (MAX_SCORE - 1);

       List<Point> graphPoints = new ArrayList<Point>();
       for (int i = 0; i < data.getData().size(); i++) {
           int x1 = (int) (i * xScale + BORDER_GAP);
           int y1 = (int) ((MAX_SCORE - data.getData().get(i)) * yScale + BORDER_GAP);
           System.out.println(x1+","+y1);
           graphPoints.add(new Point(x1, y1));
       }
       Stroke oldStroke = g2.getStroke();
       g2.setColor(GRAPH_COLOR);
       g2.setStroke(GRAPH_STROKE);
       for (int i = 0; i < graphPoints.size() - 1; i++) {
           int x1 = graphPoints.get(i).x;
           int y1 = graphPoints.get(i).y;
           int x2 = graphPoints.get(i + 1).x;
           int y2 = graphPoints.get(i + 1).y;
           g2.drawLine(x1, y1, x2, y2);
       }
       g2.setStroke(oldStroke);
       g2.setColor(GRAPH_AVG_LINE);
       int total = 0;
       for (int i = 0; i < graphPoints.size(); i++) {
           total+= graphPoints.get(i).y;
       }
       g.drawLine(0,AverageEvaluator.getAverageEvaluator().calculate(total, graphPoints.size()), PREF_W, AverageEvaluator.getAverageEvaluator().calculate(total, graphPoints.size()));
    }
}

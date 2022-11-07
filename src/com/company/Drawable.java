package com.company;
import java.awt.*;
import javax.swing.*;
//import java.awt.Graphics;

public interface Drawable {
    public static final int MAX_SCORE = 200;
    public static final int PREF_W = 500;
    public static final int PREF_H = 200;
    public static final int BORDER_GAP = 30;
    public static final Color GRAPH_COLOR = Color.blue;
    public static final Color GRAPH_POINT_COLOR = Color.blue;
    public static final Color GRAPH_BAR_COLOR = Color.DARK_GRAY;
    public static final Color GRAPH_AVG_LINE = Color.red;
    public static final Stroke GRAPH_STROKE = new BasicStroke(3f);
    public static final int GRAPH_POINT_WIDTH = 8;
    public RandomNumberGenerator data = RandomNumberGenerator.getRandomNumberGenerator();
    public JPanel draw();
}

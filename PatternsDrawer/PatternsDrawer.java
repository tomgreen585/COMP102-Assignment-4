// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102/112 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP-102-112 - 2022T1, Assignment 4
 * Name:
 * Username:
 * ID:
 */

import ecs100.*;
import java.awt.Color;

/** PatternsDrawer: 
 * Draws four different repetitive patterns. */

public class PatternsDrawer{

    public static final double PATTERN_LEFT = 50.0;   // Left side of the pattern
    public static final double PATTERN_TOP = 50.0;    // Top of the pattern
    public static final double PATTERN_SIZE = 300.0;  // The size of the pattern on the window

    /** 
     * Draws a row pattern consisting of a row of filled rectangles,
     *   alternating between the colours blue and orange
     * Asks the user for the number of rectangles.
     */
    public void drawRow(){
        UI.clearGraphics();
        double num = UI.askInt("How many rectangles:");
        /*# YOUR CODE HERE */

    }

    /** Draw a checkered board with alternating black and white squares
     *    Asks the user for the number of squares on each side
     *
     * CORE
     */
    public void drawDraughtsBoard(){
        UI.clearGraphics();
        UI.setColor(Color.black);
        int num = UI.askInt("How many rows:");
        /*# YOUR CODE HERE */

    }

    /** TriGrid
     * a triangular grid of squares that makes dark circles appear 
     * in the intersections when you look at it.
     *
     * COMPLETION
     */
    public void drawTriGrid(){
        UI.clearGraphics();
        UI.setColor(Color.black);
        int num = UI.askInt("How many rows:");
        /*# YOUR CODE HERE */

    }


    public void setupGUI(){
        UI.initialise();
        UI.addButton("Clear",UI::clearPanes);
        UI.addButton("Core: row", this::drawRow);
        UI.addButton("Core: draughts", this::drawDraughtsBoard);
        UI.addButton("Completion: TriGrid", this::drawTriGrid);
        UI.addButton("Quit",UI::quit);
    }   

    public static void main(String[] arguments){
        PatternsDrawer pd = new PatternsDrawer();
        pd.setupGUI();
    }

}


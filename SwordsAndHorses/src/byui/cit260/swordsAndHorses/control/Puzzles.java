/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.control;

/**
 *
 * @author Eduardo y Sandra
 */

import static java.lang.Math.PI;

public class Puzzles {
private int Constant = 2;


    public double calcTowerArea(double diameter, double height){
    
        double radius = diameter / 2;
        
    if (radius != 5){
    return -1;
    }

    
    double towerArea=(2 * Math.PI) * radius * (radius + height);
    return towerArea;

    }
}          



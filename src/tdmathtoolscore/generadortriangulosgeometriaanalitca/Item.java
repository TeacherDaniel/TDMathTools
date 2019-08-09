/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdmathtoolscore.generadortriangulosgeometriaanalitca;

import static java.lang.Math.*;

/**
 *
 * @author Víctor Daniel
 */
public class Item {
    private final int _xp;
    private final int _yp;
    private final int _theta;
    
    public double getM1(){
        return tan(_theta);
    }
    
    public double getTheta(){
        return atan(getM1());
    }
    public Item(int xp, int yp,int theta){
        _xp=xp;
        _yp=yp;
        _theta=theta;
    }
            
}

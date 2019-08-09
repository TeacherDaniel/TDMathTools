/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdmathtoolscore.generadortriangulosgeometriaanalitca;

import static java.lang.Math.*;
import static tdmathtoolscore.ElementaryTools.*;

/**
 *
 * @author Víctor Daniel
 */
public class Item {
    private final int _xp;
    private final int _yp;
    private final int _theta;
    private final int _longitudL1;
    
    public double getM1(){
        return truncado(tan(_theta*PI/180),2);
    }
    
    public double getTheta(){
        return atan(getM1())*180/PI+(getM1()<0?180:0);
    }
    
    
    public Item(int xp, int yp,int theta,int longitudL1,int longitudL2){
        _xp=xp;
        _yp=yp;
        _theta=theta;
        _longitudL1=longitudL1;
    }
     
    public double getAbscisaSegundoPunto(int id){
     double a = pow(getM1(),2)+1;
     double b = -2*_xp-2*pow(getM1(),2)*_xp;
     double c = pow(_xp,2)+pow(getM1()*_xp,2)-pow(_longitudL1,2);
     return (-b+(id==1?1:-1)*sqrt(pow(b,2)-4*a*c))/(2*a);
    }
    
    public double getOrdenadaSegundoPunto(int id){
        return getM1()*getAbscisaSegundoPunto(id)-getM1()*_xp+_yp;
    }

    
    @Override
    public String toString(){
        return "El primer punto es ("+_xp+","+_yp+") y el primer lado tendrá una"
                + " inclinación de "+truncado(getTheta(),2)+"°\n"+"Tanto el punto"+
                " ("+getAbscisaSegundoPunto(1)+","+getOrdenadaSegundoPunto(1)+") "+
                "como el ("+getAbscisaSegundoPunto(2)+","+getOrdenadaSegundoPunto(2)+") "
                + "están a una distancia de "+_longitudL1;
    }
}

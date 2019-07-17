/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdmathtoolscore.cuadradosporsumadecuadrados;

import static java.lang.Math.*;
import static tdmathtoolscore.ElementaryTools.*;

/**
 *
 * @author Víctor Daniel
 */
public class Item {
    private final int _id;
    private final int _limiteInspeccion;
    
    public Item(int id, int limiteInspeccion){
        _id=id;
        _limiteInspeccion=limiteInspeccion;
    }
    public int id(){
        return _id;
    }
    
    public int primero(){
        return (_id-1)/_limiteInspeccion+1;
    }
    
    public int segundo(){
        return (_id-1)%_limiteInspeccion+1;
    }
    
    public int cuadradoPrimero(){
        return (int)pow(primero(),2);
    }
    
    public int cuadradoSegundo(){
        return (int)pow(segundo(),2);
    }
    
    public double sumaCuadrados(){
        return cuadradoPrimero()+cuadradoSegundo();
    }
    
    public double raizSumaCuadrados(){               
        return sqrt(sumaCuadrados());
    }
    
    public boolean esSumaDeCuadrados(){
        return !(raizSumaCuadrados()>(int)raizSumaCuadrados());
    }
    
    public boolean esDuplaElegible(){
        return esSumaDeCuadrados()?(primero()<=segundo()):false;
    }
    
    public boolean esElegibleNatural(){
        return esDuplaElegible()?mcd(primero(),segundo())==1:false;
    }
    
}

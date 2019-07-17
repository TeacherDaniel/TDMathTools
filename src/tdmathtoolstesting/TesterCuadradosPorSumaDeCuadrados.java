/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdmathtoolstesting;

import tdmathtoolscore.cuadradosporsumadecuadrados.*;

/**
 *
 * @author Víctor Daniel
 */
public class TesterCuadradosPorSumaDeCuadrados{
    public static void main(String [] args){
        int limiteInspeccion=100;
        for(int i=1; i<=limiteInspeccion*limiteInspeccion;i++){
         mostrar(new Item(i,limiteInspeccion));
        }
    }

    public static void mostrar(Item nItem) {
        if(nItem.esElegibleNatural())
        System.out.println(nItem.id()+"\t"+nItem.primero()+"\t"+nItem.segundo()+
                           "\t"+nItem.cuadradoPrimero()+"\t"+
                           nItem.cuadradoSegundo()+"\t"+nItem.sumaCuadrados()+
                           "\t"+nItem.raizSumaCuadrados()+"\t"+
                           (nItem.esSumaDeCuadrados()?"Sí":"No")+"\t"+
                           (nItem.esDuplaElegible()?"Sí":"No")+"\t"+
                           (nItem.esElegibleNatural()?"Sí":"No"));   
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdmathtoolscore;

/**
 *
 * @author Víctor Daniel
 */
public class ElementaryTools {
    
    public static int mcd(int a, int b){
        return b==0?a:mcd(b,a%b);
    }
}

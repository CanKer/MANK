/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mank;

/**
 *
 * @author Omar
 */
public class Mask {
    int cadena [] = new int [10];
    
    public Mask(int cadena[])  {
        for(int x = 0 ;x < cadena.length; x++) {
            if(cadena[x] < 0)   {
                this.cadena[x] = 1;
            } else  {
                this.cadena[x] = 0;
            }
        }
    }
    void setMask(int cadena[])  {
        this.cadena = cadena;
    }
    int[] getMask() {
        return this.cadena;
    }
    
}

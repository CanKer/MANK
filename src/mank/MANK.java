/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mank;

import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class MANK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int cadena [] = new int [10];
        
        System.out.println("Bienvenido, por favor ingresa la cadena a evaluar en sus respectivas posiciones: ");
        for(int x = 0;x < cadena.length; x++) {
           System.out.print((x+1) +": ");
           cadena[x] = in.nextInt();
           
        }
        Mask mask = new Mask(cadena);
        
        System.out.println("La cadena es de tamaño: "+mask.getMask().length);
        System.out.print("La máscara que le corresponde es: ");
        
        for(int y = 0;y < mask.getMask().length;y++) {
            System.out.print(mask.getMask()[y]);
        }
        System.out.println("");
    }   
}

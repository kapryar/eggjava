/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import java.util.Scanner;

public class Ej3 {


    public static void main(String[] args) {
        
   /* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
    *La fórmula correspondiente es: F = 32 + (9 * C / 5).
    */
     45
             
    float grados, F;
    
    Scanner lee = new Scanner (System.in);
    
    System.out.print("Ingrese los Grados Centígrados para convertirlos a Fahrenheit: ");
           
    grados = lee.nextFloat();
    
    F = 32 + (9 * grados / 5);
    
    System.out.println("En grados Fahrenheit : " + F );
           
    }
    
}

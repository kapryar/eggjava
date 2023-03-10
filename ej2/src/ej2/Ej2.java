/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Ej2 {

 public static void main(String[] args) {
        
        String nombre;
        
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa Tu Nombre: ");
        
        nombre = lee.next();
        
        System.out.println("Tu nombre es: "+ nombre);
        
    }
    
    
}

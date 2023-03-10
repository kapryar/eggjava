/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Ej5 {
    public static void main(String[] args) {
        
//Escribir un programa que lea un número entero 
//por teclado y muestre por pantalla el doble, el triple y 
//la raíz cuadrada de ese número.         
        
 int num, doble, triple;
 float rc;
 
        Scanner lee = new Scanner(System.in);
        
        System.out.print("Ingrese un Número para dupli, trip y Raiz2: ");
        
        num = lee.nextInt();
        
        doble = num * 2;
        triple = num * 3;
        rc = (float) Math.sqrt(num); //pone variable en decimal
        
        System.out.println("El doble es: " +doble );
        System.out.println("El triple es: " +triple );
        System.out.println("La raiz cuadrada es: " +rc );
 
        
    }

}

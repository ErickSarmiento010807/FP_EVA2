/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int i = 1; i <= 20; i++ ){
            
            System.out.print(i + " - ");
           
        }
        
        //imprimir al reves (20-1)
        System.out.println("");
        System.out.println("");
        
        for(int i = 20; i >= 1; i-- ){
            
            System.out.print(i + " - ");
           
        }
        
        //Imprimir los pares de 0 a 100
        //0-2-4-6-8-10 .... 98-100
        //+=, -=, *=, /=
        System.out.println("");
        System.out.println("");
        
        for(int i = 0; i <= 100; i+=2 ){
            
            System.out.print(i + " - ");
           
        }
        
        //Imprimir al reves
        System.out.println("");
        System.out.println("");
        
        for(int i = 100; i >= 0; i-=2 ){
            
            System.out.print(i + " - ");
           
        }
        
        //Solicitar dos numeros al usuario, imprimir la lista
        //Entre esos numeros
        //-3 y 3 ---> -3 -2- 1 0 1 2 3
        //en orden inverso
        
        System.out.println("");
        System.out.println("");
        
        Scanner cap = new Scanner(System.in);
        double num1, num2;
        
        System.out.println("Numero inicial:");
        num1 = cap.nextDouble();
        
        System.out.println("Numero final: ");
        num2 = cap.nextDouble();
        
        System.out.println("");
        System.out.println("");
        
        for(double i = num1; i <= num2; i++)
            System.out.print(i + " | ");
        
        
        System.out.println("");
        System.out.println("");
        
        
        double num3, num4;
        
        System.out.println("Numero final:");
        num1 = cap.nextDouble();
        
        System.out.println("Numero inicial: ");
        num2 = cap.nextDouble();
        
        System.out.println("");
        System.out.println("");
        
        for(double i = num1; i >= num2; i--)
            System.out.print(i + " | ");
        
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_piramide;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA2_31_PIRAMIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner cap = new Scanner(System.in);
        
        int filas, i = 1;
        
        System.out.println("Cuantas filas va a ver: ");
        filas = cap.nextInt();
        
        System.out.println("patron para " + filas + " filas");
        
        do{
            
           for (int j = 1;j  <= i;j++) {
            System.out.print("*");
        }
            System.out.println("");
            i++;
            
        }while(i != filas);
        
        do{
            
           for (int j = 1;j  <= i;j++) {
            System.out.print("*");
        }
            System.out.println("");
            i--;
            
        }while(i >= 1);
    }
    
}

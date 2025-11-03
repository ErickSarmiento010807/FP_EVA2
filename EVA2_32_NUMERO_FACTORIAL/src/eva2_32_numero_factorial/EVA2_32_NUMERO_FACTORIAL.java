/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_numero_factorial;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA2_32_NUMERO_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner cap = new Scanner(System.in);
        
        int numero ,fac  = 1;
        
        System.out.println("Introduce un numero");
        numero = cap.nextInt();
        
        for(int i = 1; i <= numero; i++) {
        fac *= i;
        
            System.out.print(i);
            if (i > 0) {
                System.out.print(" * ");
            }
    }
        System.out.println("");
        System.out.println("El factorial de " + numero + " es " + fac);
    }
    
}

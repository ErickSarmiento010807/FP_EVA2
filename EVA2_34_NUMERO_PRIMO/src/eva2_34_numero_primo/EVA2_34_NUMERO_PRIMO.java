/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_numero_primo;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA2_34_NUMERO_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner cap = new Scanner(System.in);
        int num;
        int contador = 0;
        
        System.out.println("Escribe el numero: ");
        num = cap.nextInt();
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        
        }
        
        if (contador == 2) {
            System.out.println(num + " es primo ");
        } else {
            System.out.println(num + " no es primo");
        }
    }
    
}

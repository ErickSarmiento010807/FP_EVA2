/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA2_13_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner cap = new Scanner(System.in);
        int ini, fin;
        
        System.out.println("Numero inicial:");
        ini = cap.nextInt();
        
        System.out.println("Numero final: ");
        fin = cap.nextInt();
        
        System.out.println("");
        
        for(int i = ini; i <= fin; i++){
        
        int resi = i % 2;
        if(resi == 0)
             System.out.println(i + " - ");
        
        }
        
    }
    
}

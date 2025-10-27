/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_captura_datos;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA2_15_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner cap = new Scanner(System.in);
        
        int tama;
        System.out.println("¿Cuantas calificaciones quieres capturar?");
        tama = cap.nextInt();
        
        int califas[] = new int [tama];
        
        for(int i = 0; i < califas.length; i++){
        
            System.out.println("Calificacion #" + (i + 1) + ":");
            califas[i] = cap.nextInt();
        
        }
        //Lectura
        for(int i = 0; i < califas.length; i++){
        
            System.out.print("[" + califas[i] + "]");
        
        }
        
        //promedio del grupo
        //Sumar todas las calificaciones
        int sumacali = 0;
        for(int i = 0; i < califas.length; i++){
        
            sumacali = sumacali + califas[i];
            //sumacali += califas[i]
        }    
        
       System.out.println("acumulado = " + sumacali);
       double promedio = sumacali / (double)tama;
        System.out.println("Promedio: " + promedio);
        
    }
    
}

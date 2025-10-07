/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos_string;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA2_5_ARREGLOS_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] a,b,c;//son 3 arreglos
        int x[], y, z;//solo la x es un arreglo
        
        String cadenas[] = new String[7];
        cadenas[0] = "Lunes";
        cadenas[1] = "Martes";
        cadenas[2] = "Miercoles";
        cadenas[3] = "Jueves";
        cadenas[4] = "Viernes";
        cadenas[5] = "Sabado";
        cadenas[6] = "Domingo";
        
        Scanner cap = new Scanner(System.in);
        int dia;
        
        System.out.println("dia de la semana del (0 a 6): ");
        dia = cap.nextInt();
        System.out.println(cadenas[dia]);
    }
    
}

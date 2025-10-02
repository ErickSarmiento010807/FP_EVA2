/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_examen;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA2_1_EXAMEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int natacion, ciclismo, carrera;
        int total;
        
        Scanner cap = new Scanner(System.in);
       
        System.out.println("Tiempo en natacion: ");
        natacion = cap.nextInt();
        System.out.println("Tiempo en ciclismo: ");
        ciclismo = cap.nextInt();
        System.out.println("Tiempo en carrera: ");
        carrera = cap.nextInt();
        
        total = natacion + ciclismo + carrera;
        
    
        if((total < 120) && ((natacion < 60) && (ciclismo < 60) && (carrera < 60)))
            System.out.println("EXELENTE!!");
        else if((total < 150) || ((natacion < 70) && (ciclismo < 70) && (carrera < 70)))
            System.out.println("EXELENTE!!");
        else
            System.out.println("regular");
    }
    
}

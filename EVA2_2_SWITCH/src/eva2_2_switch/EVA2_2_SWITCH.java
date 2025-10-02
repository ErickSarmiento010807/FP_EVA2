/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA2_2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //SWITCH --> OPCION MULTIPLE
        Scanner cap = new Scanner(System.in);
        
        int dia;
        System.out.println("Dia de la semana en unmero (1/7): ");
        dia = cap.nextInt();
        /*if (dia == 1){
              System.out.println("lunes");
        }else if (dia == 2){
              System.out.println("Martes");
        }
        */
        switch(dia){//Opciones --> casos
        case 1:
             System.out.println("Lunes");
             break;
        case 2:
             System.out.println("Martes");
             break;
        case 3:
             System.out.println("Miercoles");
             break;
        case 4:
             System.out.println("Jueves");
             break;
        case 5:
             System.out.println("Viernes");
             break;
        case 6:
             System.out.println("Sabado");
             break;
        case 7:
             System.out.println("Domingo");
             break;
        default:
                
             System.out.println("Numero incorrecto");   
        }
        
        
    }
    
}

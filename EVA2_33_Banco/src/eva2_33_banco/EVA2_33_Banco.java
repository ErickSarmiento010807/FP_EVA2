/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_banco;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA2_33_Banco {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
       
        double retiro, dinero = 1000000;
        
        System.out.println(ANSI_RED + "-----Bienvenido al banco del bienestar-----" + ANSI_RESET);
        System.out.println("El dinero que tiene la cuenta es " + ANSI_GREEN + dinero + ANSI_RESET);
        
        while(dinero > 0) {
        
            System.out.println("Cuanto dinero quieres retirar: $");
            retiro = cap.nextDouble();
            
            dinero = dinero - retiro;
            
            System.out.println("El dinero restante es:" + dinero);
            
        }
        System.out.println("Saldo insuficiente");
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ciclo_infinito;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA2_24_CICLO_INFINITO {
    final static String USUARIO = "admin";
    final static String PWD = "admin";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner cap = new Scanner(System.in);
        
        String usu, contra;
        
        while (true){
        
        System.out.println("----Acceso al sistema---");
        
        System.out.println("Usuario:");
        usu = cap.nextLine();
        
        System.out.println("Contraseña:");
        contra = cap.nextLine();
        
        if(usu.equals(USUARIO) && contra.equals(PWD))
            break;
        }
        System.out.println("Bienvenido ");
    }
    
}

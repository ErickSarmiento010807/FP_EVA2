/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_do_while_pwd;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA2_21_DO_WHILE_PWD {
    final static String USUARIO = "admin";
    final static String PWD = "admin";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner cap = new Scanner(System.in);
        
        String usu, contra;
        
        do{
        System.out.println("----Acceso al sistema---");
        
        System.out.println("Usuario:");
        usu = cap.nextLine();
        
        System.out.println("Contraseña:");
        contra = cap.nextLine();
        
        
        }while(!(usu.equals(USUARIO) && contra.equals(PWD)));
        
        System.out.println("BIENVENIDO AL SISTEMA");
    }
    
}

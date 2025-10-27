/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_do_while;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA2_20_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner cap = new Scanner(System.in);
        int opcion;
        do{
        
        System.out.println("----MENU PRINCIPAL----");
        System.out.println("Presiona la opción");
        System.out.println("1. pedidos");
        System.out.println("2. probedores");
        System.out.println("3. facturacion");
        System.out.println("4. salir");
        
        System.out.println("elige la opcion:");
        opcion = cap.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Pedidos del sistema!!!");
                break;
            case 2:
                System.out.println("Proveedores del sistema!!!");
                break;
            case 3:
                System.out.println("Facturacion del sistema!!!");
                break;
        }
        } while(opcion != 4);//Mientras la opcion sea diferente de 4
        
        System.out.println("FIN DEL PROGRAMA");
        
    }
    
}

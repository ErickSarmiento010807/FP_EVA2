/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_menu;

/**
 *
 * @author Hogar
 */
public class EVA2_7_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                            //   0        1           3
        String platillo[] = {"Alitas", "Pizza", "Hamburgueza"};
        double precios[] = {250.0, 100, 200};
        
        System.out.println("-------MENÚ------");
        System.out.println("0-->" + platillo[0] + " $" + precios[0]);
        System.out.println("1-->" + platillo[1] + " $" + precios[1]);
        System.out.println("2-->" + platillo[2] + " $" + precios[2]);
    }
    
}

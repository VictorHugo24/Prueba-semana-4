/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        String producto;
        int cantidad;
        String [] inventario = null;
        int contador=0;
        
        System.out.print("¿Cuanto productos desea ingresar?: ");
        contador = scanner.nextInt();
        
        for (int i = 0; i < contador; i++) {
            
            System.out.print("Favor ingrese el nombre del producto: ");
            inventario[i] = scanner.next();
            
        }
        
        for (int i = 0; i < contador; i++) {
            
            System.out.println(inventario[i]);
            
        }
        
        
        
         
    }
    
}

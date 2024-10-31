/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int cantidad, cantidadProducto;
        int contador=0;
        int precio = 0;
        int total = 0;
        int sumarTotal = 0;
        
        
        System.out.print("Favor ingresar la canridad de productos que lleva: ");
        cantidad = scanner.nextInt();
        String[] carrito = new String[cantidad];
        
        for (int i = 0 ; i < cantidad; i++) {
            
            System.out.print("Producto "+(i+1)+" : ");
            carrito[i] = scanner.next();
           System.out.print("Ingrese el precio:  ");
           precio = scanner.nextInt();
           sumarTotal+=precio;
            
        }
       
        
        for (int i = 0; i < cantidad; i++) {
                System.out.println("Los productos que lleva son: ");
                System.out.println(carrito[i]);
                System.out.println("Con un total de: "+precio);
            
        }
        
        
    }
    
}

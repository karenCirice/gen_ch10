/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.org.generation;

import java.util.Scanner;

/**
 *Java08: uso de arreglos en Java
 * @author ernestoaldanallamas
 */
public class ArreglosConcepto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] edades = new int[5];
        String [] nombres = new String[5];
        
        System.out.println(edades);
        System.out.println(nombres);
        
        edades[1] = 20;
        nombres[2] = "Ernesto";
        
        System.out.println(edades);
        System.out.println(nombres);
//        
//        for (int i = 0; i < nombres.length; i++) {
//            System.out.println("Ingresa nombre para la posicion "+i+":");
//            nombres[i] = in.nextLine();
//        }
//        
//        for (String nombre : nombres) {
//            System.out.println(nombre);
//        }
        
        //Matrices
        String [][] frutas = new String[2][2];
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println("Ingrese fruta: ");
                frutas[i][j] = in.nextLine();
            }
        }
    }
}

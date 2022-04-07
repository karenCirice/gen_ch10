/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.org.generation;

import java.util.*;

/**
 *
 * @author ernestoaldanallamas
 */
public class ArrayListCollection {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        List<String> autos = new ArrayList<String>();
        autos.add("Volvo");
        autos.add("BMW");
        autos.add("Mazda");
        autos.add("Tsuru");
        
        System.out.println("Total de autos: "+autos.size());
        
        for (String auto : autos) {
            System.out.println(auto);
        }
        
        System.out.println("Eliminando el ultimo elemento del Arraylist: ");
        autos.remove(autos.size()-1);
        
        for (String auto : autos) {
            System.out.println(auto);
        }
        System.out.println("Imprimiendo autos con metodo get()");
        for (int i = 0; i < autos.size(); i++) {
            System.out.println(autos.get(i));
        }
        
        System.out.println("Imprimiendo con for each");
        autos.forEach(
        auto -> {
            System.out.println("auto: "+auto);
        });
    }
}

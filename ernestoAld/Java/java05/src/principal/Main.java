/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *Java05
 * @author ernestoaldanallamas
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        boolean condicion = true;
//        int bandera = 1;
//        //If, se ejecuta la condicion si es verdadera
//        if(condicion){
//            bandera = 2;
//            System.out.println("La condicion es verdadera");
//        }else{
//            bandera = 3;
//            System.out.println("La condicion es falsa");
//        }
//        
//        System.out.println("Se continua con otras instrucciones");
//        //Imprimimos la variable bandera
//        System.out.println("El valor de la bandera es: "+bandera);
//        System.out.println("Ingrese calificacion de la prueba: ");
        //Valor entre 0 y 100
//        int prueba = Integer.parseInt(in.nextLine());
//        char calificacion = ' ';
//        if(prueba >= 90){
//            calificacion = 'A';
//        }else if(prueba >= 80){
//            calificacion = 'B';
//        }else if(prueba >= 70){
//            calificacion = 'c';
//        }else if(prueba >= 60){
//            calificacion = 'D';
//        }else{
//            calificacion = 'F';
//        }
//        
//        System.out.println("Calificacion: "+prueba+"\tNota: "+calificacion);
//        System.out.println("Ingrese numero del mes a elegir");
//        int mes = Integer.parseInt(in.nextLine());
//        String mesString = "No elegido";
//        switch(mes){
//            case 1:
//                mesString = "Enero";
//                break;
//            case 2:
//                mesString = "Febrero";
//                break;
//            case 3:
//                mesString = "Marzo";
//                break;
//            case 4:
//                mesString = "Abril";
//                break;
//            case 5:
//                mesString = "Mayo";
//                break;
//            case 6:
//                mesString = "Junio";
//                break;
//            case 7:
//                mesString = "Julio";
//                break;
//            case 8:
//                mesString = "Agosto";
//                break;
//            case 9:
//                mesString = "Septiembre";
//                break;
//            case 10:
//                mesString = "Octubre";
//                break;
//            case 11:
//                mesString = "Noviembre";
//                break;
//            case 12:
//                mesString = "Diciembre";
//                break;
//            default:
//                System.out.println("Ingreso un numero fuera del rango");
//        }
//        System.out.println("Mes elegido: "+mesString);
        System.out.println("Ingresa mes del año numerico: ");
        int mesCalendario = Integer.parseInt(in.nextLine());
        String estacion;
        switch(mesCalendario){
            case 1,2,12:
                estacion = "Invierno";
                break;
            case 3,4,5:
                estacion = "Primavera";
                break;
            case 6,7,8:
                estacion = "Verano";
                break;
            case 9,10,11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes invalido";
        }
        System.out.println("Mes: "+mesCalendario+" \tEstacion: "+estacion);
    }
}

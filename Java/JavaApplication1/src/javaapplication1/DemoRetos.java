/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DemoRetos {
    public static void main (String[] args) {
        int anio = 0;
        int bono = 100;
        Scanner entrada = new Scanner(System.in);
        anio = entrada.nextInt();
        bono = entrada.nextInt();
        System.out.println(calcularPorcentajeBono(bono,anio));
   }
    public static double calcularPorcentajeBono(int bono, int anio){
        double porcentaje=2;
        double respuesta=3;
        if (anio>=10){
            porcentaje=0.30;
            respuesta = bono*porcentaje;}
        if ((5<=anio)&&(anio<10)){
            porcentaje=0.20;
            respuesta = bono*porcentaje;}
        if (3<=anio && anio<5){
            porcentaje=0.10;
            respuesta=bono*porcentaje;}
        if (3>anio){
            porcentaje=0.05;
            respuesta=bono*porcentaje;}
        return porcentaje*bono;
       }
    
}
    


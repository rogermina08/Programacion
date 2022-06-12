/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Reto2 {

    public static void main (String[] args) {
         Usuario obj = new Usuario("lucia gomez",1149686193,"correo",26,"desarrollo", true);
        obj.info();
    }
    
     public static class Usuario{
        private String nombre;
        private int identificacion;
        private String Email;
        private int edad;
        private String area;
        private boolean jefe;
        private float salario;
        private float devengado;
        
     
        public  Usuario(String nombre, int identificacion, String Email, int edad, String area, boolean jefe){
         this.nombre = nombre;
         this.identificacion = identificacion;
         this.Email = Email;
         this.edad = edad;
         this.area = area;
         this.salario=0.0f;
         this.jefe = jefe;
         this.devengado=this.valor();
         }
        public float valor(){
            float total=0.0f;
            if (this.area=="desarrollo"){
                 this.salario=4500000.0f;
                 if (this.jefe==true){
                     this.salario+=2500000.0f;
                 }
            }
            if (this.area=="administrativa"){
                 this.salario=3500000.0f;
                 if (this.jefe==true){
                     this.salario+=3000000.0f;
                    }
             }
            total=this.salario-this.salario*0.08f;
            if (this.salario>=908526*4){
            total=total-this.salario*0.01f;
                }
             return total;
           
        }
       public void info(){
        System.out.println("[Usuario]:");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Identificacion: "+ identificacion);
        System.out.println("Email: "+ Email);
        System.out.println("Edad: "+ edad);
        System.out.println("Area: "+ area);
        System.out.println("Salario: "+ devengado);
        }
    }
}

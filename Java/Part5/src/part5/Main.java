/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part5;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Main {

 
    public static void main(String[] args) {
     Ventana formulario1 = new Ventana();
     formulario1.setBounds(5,10,800,600);
     formulario1.setVisible(true);
     formulario1.setTitle("mi ventanita");
     formulario1.setDefaulCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

   

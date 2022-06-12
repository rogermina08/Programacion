/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part5;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Ventana extends JFrame implements ActionListener{

    private JLabel label1, label2;
    private JPanel panel1;
    private JTextField campoTexto1;
    private JButton boton1;

    public Ventana() {
        panel();
        cajaDeTexto();
        botones();
    }

    public void etuiquetas() {
        label1 = new JLabel("mensaje en el panel 1");
        label1.setBounds(5, 250, 200, 15);
        add(label1);
        label2 = new JLabel("version 0.0.2");
        label2.setBounds(5, 200, 100, 15);
        add(label2);
        panel();
    }

    public void panel() {
        panel1 = new JPanel();
        panel1.setLayout(null); //desactiva el poicionamiento por defecto
        panel1.setBackground(Color.cyan);
        label1 = new JLabel("mensaje en el panel 1");
        label1.setBounds(5, 20, 150, 15);
        add(label1);
        label2 = new JLabel("version 0.0.2");
        label2.setBounds(5, 150, 150, 15);
        panel1.add(label2);
        add(panel1);
    }
    public void cajaDeTexto (){
        campoTexto1 = new JTextField ();
        campoTexto1.setBounds (160,20,140,15);
        panel1.add(campoTexto1);
    }
    public void botones (){
    boton1 = new JButton ("cerrar la app");
    boton1.setBounds (100,150,200,20);
    panel1.add(boton1);
    boton1.addActionListener(this);//se debe implementar la interfaz en la clase
    }
    public void actionPerformed(ActionEvent e){
    
    System.out.println("el boton ha sido presionado");
    }
}

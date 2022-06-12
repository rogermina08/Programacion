/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Animal {
    protected double peso;
    protected double altura;
    protected Alimento alimsIngeridos[];

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Alimento[] getAlimsIngeridos() {
        return alimsIngeridos;
    }

    public void setAlimsIngeridos(Alimento[] alimsIngeridos) {
        this.alimsIngeridos = alimsIngeridos;
    }
    public double getIMC (){
       double IMC=0;
        IMC=(peso)/altura*altura;
        return IMC;
    }
}

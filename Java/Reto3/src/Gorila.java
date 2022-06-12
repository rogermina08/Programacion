/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Gorila extends Animal{
    public Gorila (double peso, double altura){
        this.peso=peso;
        this.altura=altura;
    }
    public double getPesoAlims (){
        double sumapeso=0.0;
        for (Alimento alimsIngerido : alimsIngeridos) {
            sumapeso=sumapeso+alimsIngerido.getGramos();
        }
        return Math.floor(sumapeso);
    }

    @Override
    public double getIMC() {
    return (this.peso+(getPesoAlims())/1000)/(altura*altura);
            }
}

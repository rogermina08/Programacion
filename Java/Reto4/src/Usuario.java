
import java.util.TreeSet;
import java.util.Set;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Usuario {
    private Set <String> telefonos;
    
    public Usuario (){
    this.telefonos = new TreeSet<>();
    }
    public void addTelefono (String telefono){
        this.telefonos.add(telefono);
    
    }
    public void mostrarTelefonos(){
        System.out.println(this.telefonos);
    }
}
    

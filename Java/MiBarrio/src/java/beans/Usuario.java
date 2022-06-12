
package beans;

import javax.faces.bean.ManagedBean;


@ManagedBean(name = "usuario", eager = true)
public class Usuario {
    private  String correo;
    private  String nombre;
    private  String contraseña;

    public Usuario() {
        correo = "";
        nombre = "";
        contraseña = "";
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}

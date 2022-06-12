
package beans;


import java.util.Date;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "Producto", eager = true)
public class Producto {
  
    private long id;
    private  String categoria;
    private  String marca;
    private  String proveedor;
    private  String factura;     
    private  float contenido;
    private  int cantidad;
    private  double costo;
    private  Date fecha;

    public Producto() {
     id = 0;
     categoria = "";
     marca = "";
     proveedor = "";
     factura = "";
     contenido  = 0.0f;
     cantidad = 0;
     costo = 0.0;
     fecha = new Date();
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public float getContenido() {
        return contenido;
    }

    public void setContenido(float contenido) {
        this.contenido = contenido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}

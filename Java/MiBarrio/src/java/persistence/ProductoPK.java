/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author User
 */
@Embeddable
public class ProductoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CONTENIDO")
    private double contenido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COSTO")
    private double costo;

    public ProductoPK() {
    }

    public ProductoPK(int id, double contenido, int cantidad, double costo) {
        this.id = id;
        this.contenido = contenido;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getContenido() {
        return contenido;
    }

    public void setContenido(double contenido) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) contenido;
        hash += (int) cantidad;
        hash += (int) costo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoPK)) {
            return false;
        }
        ProductoPK other = (ProductoPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.contenido != other.contenido) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (this.costo != other.costo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistence.ProductoPK[ id=" + id + ", contenido=" + contenido + ", cantidad=" + cantidad + ", costo=" + costo + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class Productos {
    private String descripcion,
            categoria;
    private int precio_u,
            unid_stock;

    public Productos(String descripcion, String categoria, int precio_u, int unid_stock) {
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio_u = precio_u;
        this.unid_stock = unid_stock;
    }

    public Productos() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Productos{" + "descripcion=" + descripcion + ", categoria=" + categoria + ", precio_u=" + precio_u + ", unid_stock=" + unid_stock + '}';
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio_u() {
        return precio_u;
    }

    public void setPrecio_u(int precio_u) {
        this.precio_u = precio_u;
    }

    public int getUnid_stock() {
        return unid_stock;
    }

    public void setUnid_stock(int unid_stock) {
        this.unid_stock = unid_stock;
    }
    
}

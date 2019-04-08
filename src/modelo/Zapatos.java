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
public class Zapatos extends Productos{
    private String talla,
            marca,
            color;

    @Override
    public String toString() {
        return "Zapatos{" + "talla=" + talla + ", marca=" + marca + ", color=" + color + '}';
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Zapatos(String talla, String marca, String color, String descripcion, String categoria, int precio_u, int unid_stock) {
        super(descripcion, categoria, precio_u, unid_stock);
        this.talla = talla;
        this.marca = marca;
        this.color = color;
    }

    public Zapatos(String talla, String marca, String color) {
        this.talla = talla;
        this.marca = marca;
        this.color = color;
    }
}

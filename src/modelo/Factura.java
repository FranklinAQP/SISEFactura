/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Factura {
    private int codigo;
    private String ruc_user,
            razon_social,
            direccion,
            telefono;
    private double Total;
    private Cliente cliente;
    ArrayList<Productos> productos;

    public Factura(int codigo, String ruc_user, String razon_social, String direccion, String telefono, double Total, Cliente cliente, ArrayList<Productos> productos) {
        this.codigo = codigo;
        this.ruc_user = ruc_user;
        this.razon_social = razon_social;
        this.direccion = direccion;
        this.telefono = telefono;
        this.Total = Total;
        this.cliente = cliente;
        this.productos = productos;
    }

    public Factura() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRuc_user() {
        return ruc_user;
    }

    public void setRuc_user(String ruc_user) {
        this.ruc_user = ruc_user;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }
    
}

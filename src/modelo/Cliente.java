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
public class Cliente extends Persona{
    private String cod_c;
    private int telefono;

    public Cliente(String cod_c, int telefono, String nombre, String apellidos, String direccion, String dni) {
        super(nombre, apellidos, direccion, dni);
        this.cod_c = cod_c;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cod_c=" + cod_c + ", telefono=" + telefono + '}';
    }

    

    public String getCod_c() {
        return cod_c;
    }

    public void setCod_c(String cod_c) {
        this.cod_c = cod_c;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}

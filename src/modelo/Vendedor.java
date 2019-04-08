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
public class Vendedor extends Persona {
    private String cod_v;

    public Vendedor(String cod_v, String nombre, String apellidos, String direccion, String dni) {
        super(nombre, apellidos, direccion, dni);
        this.cod_v = cod_v;
    }

    public String getCod_v() {
        return cod_v;
    }

    public void setCod_v(String cod_v) {
        this.cod_v = cod_v;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "cod_v=" + cod_v + '}';
    }
    
}

package automoviles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charlie
 */
public class Auto {
    //atrib
    private String marca;
    private String modelo;
    private float precio;
    //metod

    public Auto(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public float getPrecio(){
            return precio;
    }
        public String mostrarDatos(){
            return"la marca mas barata es "+marca+"'\nEl mod es "+modelo+"\nY su precio es $"+precio;
        }
          
}

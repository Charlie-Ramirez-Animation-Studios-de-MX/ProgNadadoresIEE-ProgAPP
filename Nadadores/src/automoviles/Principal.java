/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automoviles;

import java.util.Scanner;

/**
 *
 * @author charlie
 */
public class Principal {
    public static int indiceAutoBarato(Auto coches[]){
        float precio;
        int indice=0;
        precio=coches[0].getPrecio();
        for (int i = 0; i <coches.length; i++) {
            if(coches[i].getPrecio()<precio){
                precio=coches[i].getPrecio();
                indice=i;
                
            }
            
        }return indice;
    }
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numAutos,indiceBarato;
        System.out.println("Programa que compara carros");
        System.out.println("cuantos vetras");
        numAutos=teclado.nextInt();
        Auto coches[]=new Auto[numAutos];
        for (int i = 0; i < coches.length; i++) {
            teclado.nextLine();
System.out.println("Introduzca las caracteristicas de "+ "coche " + (i + 1) + ":");
System.out.println("Cual es la marca? ");
marca = teclado.nextLine();
System.out.println("Cual es el modelo? ");
modelo = teclado.nextLine();
System.out.println("Cual es su precio? ");
precio = teclado.nextInt();
coches[i] = new Auto(marca, modelo, precio);
}
indiceBarato = indiceAutoBarato(coches);
System.out.println("El coche mas barato es: ");
System.out.println(coches[indiceBarato].mostrarDatos());
    }
}

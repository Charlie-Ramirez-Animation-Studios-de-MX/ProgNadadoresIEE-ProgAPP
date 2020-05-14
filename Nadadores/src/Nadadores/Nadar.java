/*Copyright (c) 2020 Boyzo Ramirez Carlos|©-Archivo Historico Digitalizado Charlie Ramirez Animation Studios de Mexico-Ing. Juan Gastaldi Perez.
UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO-FACULTAD DE ESTUDIOS SUPERIORES ARAGON-INGENIERIA ELECTRICA ELECTRONICA.
        Programa que compara Tiempos de Competicion, Version 14 de mayo 2020. 
CODIGO BAJO "LICENCIA MIT". PARA CODIGO ABIERTO (OPEN SOURCE  https://opensource.org/licenses/MIT).
*/
package Nadadores;
public class Nadar {
     //atribb
    private String nombre;
    private String carril;
    private float tiempo;
    //metod Construct

    public Nadar(String nombre, String carril, float tiempo) {
        this.nombre = nombre;
        this.carril = carril;
        this.tiempo = tiempo;
    }
    public float getTime(){
            return tiempo;
    }
        public String mostrarDatos(){
            return"El Competidor "+nombre+"\nDel Carril "+carril+"\nY su tiempo es "+tiempo;
        }
          
}


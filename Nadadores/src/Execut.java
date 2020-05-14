/*Copyright (c) 2020 Boyzo Ramirez Carlos|©-Archivo Historico Digitalizado Charlie Ramirez Animation Studios de Mexico-Ing. Juan Gastaldi Perez.
UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO-FACULTAD DE ESTUDIOS SUPERIORES ARAGON-INGENIERIA ELECTRICA ELECTRONICA.
        Programa que compara Tiempos de Competicion, Version 14 de mayo 2020. 
CODIGO BAJO "LICENCIA MIT". PARA CODIGO ABIERTO (OPEN SOURCE  https://opensource.org/licenses/MIT).
*/
import Nadadores.Nadar;
import java.util.Scanner;
public class Execut {
       public static int indiceNadadorRapido(Nadar competidor[]){
        float tiempo;
        int indice=0;
        tiempo=competidor[0].getTime();
        for (int i = 0; i <competidor.length; i++) {
            if(competidor[i].getTime()<tiempo){
                tiempo=competidor[i].getTime();
                indice=i;
                
            }
            
        }return indice;
    }
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String nombre, Carril;
        float tiempo;
        int numNadar,indiceRapido;
        System.out.println("Programa que Compara Tiempos de Competicion, By Charlie");
        System.out.println("Cuantos competidores hay?");
        numNadar=teclado.nextInt();
        Nadar competidor[]=new Nadar[numNadar];
        for (int i = 0; i < competidor.length; i++) {
            teclado.nextLine();
System.out.println("Introduzca la Ficha del "+ "Nadador " + (i + 1) + ":");
System.out.println("Cual es su nombre? ");
nombre = teclado.nextLine();
System.out.println("Cual es el Carril? ");
Carril = teclado.nextLine();
System.out.println("Cual es su tiempo? ");
tiempo = teclado.nextInt();
competidor[i] = new Nadar(nombre, Carril, tiempo);
}
indiceRapido = indiceNadadorRapido(competidor);
System.out.println("El nadador mas rapido es: ");
System.out.println(competidor[indiceRapido].mostrarDatos());
    }
}
 


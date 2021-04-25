/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproyect;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class GameProyect {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        double recorrido;
        double dado;
        int numeroJugadores;
        int banderaDo=0;
        
        System.out.println("Digite la cantidad de jugadores que participarán en el juego");
        numeroJugadores = leer.nextInt();
                
        Jugador jugador[] = new Jugador[numeroJugadores];
        
        for (int i = 0; i < jugador.length; i++) {            
                leer.nextLine();
                System.out.println("Digite el nombre del jugador " + (i+1));
                nombre = leer.nextLine();
                recorrido = 0;
                Jugador mijugador = new Jugador(nombre,recorrido);
                jugador[i]= mijugador;
                                   
        }           
        for (int i = 0; i < jugador.length; i++) {   
                System.out.println("------------------------------------------------------------");
                System.out.println("El nombre del jugador "+ (i+1)+" es: "+jugador[i].getNombre());
                System.out.println("Se le ha asignado el coche número: "+ (i+1) + " y el carril número " + (i+1));
                System.out.println("Su recorrido es "+jugador[i].getRecorrido());  
                System.out.println("------------------------------------------------------------");
        }
        
        Circuito circuito = new Circuito();
        circuito.escogerPista();
                
        System.out.println("Comienza el juego");
        
        do {
            for (int i = 0; i < jugador.length; i++) {
            System.out.println("Turno del jugador " + (i+1));
            System.out.println("Oprima ENTER para lanzar el dado");
            leer.nextLine();
            System.out.println("**Tirando el dado**");
            dado = Math.floor(Math.random()*(6-1+1)+1);
            System.out.println("El valor del dado es: "+ dado);
            dado=dado*100;
            dado=dado+jugador[i].getRecorrido();
            jugador[i].setRecorrido(dado);
            System.out.println("El recorrido del jugador es " + jugador[i].getRecorrido());
            if (jugador[i].getRecorrido()>=circuito.getKilometros()) {
                System.out.println("El jugador" + jugador[i].getNombre() + "ha llegado a la meta");
                banderaDo=1;
                break;
            }else{
                System.out.println("Ningun jugador ha llegado a la meta, siguiente jugador\n");
                System.out.println("--------------------------------------------------------");
            }
            }
        } while (banderaDo==0);
          
        System.out.println("Así ha quedado el podio:\n");
        for (int i = 0; i < jugador.length; i++) {   
                System.out.println("------------------------------------------------------------");
                System.out.println("Nombre " + jugador[i].getNombre() + " Ha recorrido " +jugador[i].getRecorrido());  
                System.out.println("------------------------------------------------------------");
        }
        
        
        
        
        
        
        
        
    }
    
}

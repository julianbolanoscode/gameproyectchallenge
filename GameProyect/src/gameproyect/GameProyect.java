
package gameproyect;

import java.util.Scanner;

public class GameProyect {

   
    public static void main(String[] args) {
        
        //Inicializacion de variables
        Scanner leer = new Scanner(System.in);
        String nombre;
        double recorrido;
        double dado;
        int numeroJugadores;
        int banderaDo=0;
        int Bandera=0;
        
        do { //estructura de control general para repetición de juego
            Juego juego = new Juego();
        juego.validacionNumeroJugadores();
        numeroJugadores=juego.getNumeroJugadores();        
                              
        Jugador jugador[] = new Jugador[numeroJugadores]; //array general donde se guardan los nombres y recorrido de cada jugador
        
        for (int i = 0; i < jugador.length; i++) {      // Estructura para llenar el array de nombres      
                System.out.println("Digite el nombre del jugador " + (i+1));
                leer.nextLine();
                nombre = leer.nextLine();
                recorrido = 0;
                Jugador mijugador = new Jugador(nombre,recorrido);
                jugador[i]= mijugador;
                                   
        }           
        for (int i = 0; i < jugador.length; i++) {   //Estructura para mostrar los nombres
                System.out.println("------------------------------------------------------------");
                System.out.println("El nombre del jugador "+ (i+1)+" es: "+jugador[i].getNombre());
                System.out.println("Se le ha asignado el coche número: "+ (i+1));
                System.out.println("Se le ha asignado el carril número: " + (i+1));  
                System.out.println("------------------------------------------------------------");
        }       
        
        Circuito circuito = new Circuito(); //Metodo para escoger el circuito
        circuito.escogerPista();
                
        System.out.println("Comienza el juego");
        
        do {
            for (int i = 0; i < jugador.length; i++) { //Estructura para funcionamiento de rondas
            System.out.println("Turno del jugador " + (i+1));
            System.out.println("Oprima ENTER para lanzar el dado"); 
            leer.nextLine();
            System.out.println("**Tirando el dado**");
            dado = Math.floor(Math.random()*(6-1+1)+1); // Uso de clase Math para simular funcion de un dado común
            System.out.println("El valor del dado es: "+ dado);
            dado=dado*100;
            dado=dado+jugador[i].getRecorrido();
            jugador[i].setRecorrido(dado);
            System.out.println("El recorrido del jugador es " + jugador[i].getRecorrido());
            if (jugador[i].getRecorrido()>=circuito.getKilometros()) {                
                System.out.println("El jugador " + jugador[i].getNombre() + " ha llegado a la meta");
                banderaDo=1;
                break;
            }else{
                System.out.println("Ningun jugador ha llegado a la meta, siguiente jugador\n");
                System.out.println("--------------------------------------------------------");
            }
            }
        } while (banderaDo==0);
        
        //Orden de array para generar podio. NOTA: Se necesita optimizar para su funcionamiento (se sobreescribe la variable recorrido)
        double aux;        
        for (int i = 0; i < (jugador.length-1); i++) {
            for (int j = 0; j < (jugador.length-1); j++) {
                if (jugador[j].getRecorrido()<jugador[j+1].getRecorrido()) {
                    aux=jugador[j].getRecorrido();
                    jugador[j].setRecorrido(jugador[j+1].getRecorrido());
                    aux = jugador[j+1].getRecorrido();
                }
            }
        }
        System.out.println("Así ha quedado el podio:\n"); // Estructura para mostrar el podio
        for (int i = (jugador.length-1); i >=0; i--) {
            System.out.println("---------------------------------------------------------");
            System.out.println((i+1) + " " + jugador[i].getNombre() + " - " + jugador[i].getRecorrido());
            System.out.println("---------------------------------------------------------");
            }           
        
        //Validación nuevo juego (Marque 1 si quiere seguir jugando, marque 2 si quiere salir del juego)
        
        System.out.println("Desea jugar de nuevo?");
            System.out.println("1. SI \n 2. NO");
            int desicion=0;
            desicion=leer.nextInt();
        
            if (desicion==1) {
                System.out.println("Siguiente partida:");
            }else{
                System.out.println("Gracias por jugar");
                Bandera=1;                               
            }
            
        } while (Bandera==0);
    }
    
}

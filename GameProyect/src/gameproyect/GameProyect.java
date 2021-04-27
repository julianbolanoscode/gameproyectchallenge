
package gameproyect;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
                nombre = JOptionPane.showInputDialog("Digite el nombre del jugador " + (i+1));
                recorrido = 0;
                Jugador mijugador = new Jugador(nombre,recorrido);
                jugador[i]= mijugador;
        }           
        for (int i = 0; i < jugador.length; i++) {   //Estructura para mostrar los nombres
                JOptionPane.showMessageDialog(null,"El nombre del jugador "+ (i+1)+" es: "+jugador[i].getNombre() + "\n Se le ha asignado el coche número: " + (i+1));
        }       
        
        Circuito circuito = new Circuito(); //Metodo para escoger el circuito
        circuito.escogerPista();
                
        JOptionPane.showMessageDialog(null,"Comienza el juego");
        
        do {
            for (int i = 0; i < jugador.length; i++) { //Estructura para funcionamiento de rondas
            JOptionPane.showMessageDialog(null,"Turno del jugador " + (i+1));
            JOptionPane.showMessageDialog(null,"Oprima ENTER para lanzar el dado");
            dado = Math.floor(Math.random()*(6-1+1)+1); // Uso de clase Math para simular funcion de un dado común
            JOptionPane.showMessageDialog(null,"El valor del dado es: "+ dado);
            dado=dado*100;
            dado=dado+jugador[i].getRecorrido();
            jugador[i].setRecorrido(dado);
            JOptionPane.showMessageDialog(null,"El recorrido del jugador es " + jugador[i].getRecorrido());
            if (jugador[i].getRecorrido()>=circuito.getKilometros()) {                
                JOptionPane.showMessageDialog(null,"El jugador " + jugador[i].getNombre() + " ha llegado a la meta");
                banderaDo=1;
                break;
            }else{
                JOptionPane.showMessageDialog(null,"No has llegado a la meta, siguiente turno");
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
        // Estructura para mostrar el podio
        for (int i = (jugador.length-1); i >=0; i--) {
            JOptionPane.showMessageDialog(null,"Así ha quedado el podio: " + (i+1) + " " + jugador[i].getNombre() + " - " + jugador[i].getRecorrido()+"\n");
        
            }           
        
        //Validación nuevo juego (Marque 1 si quiere seguir jugando, marque 2 si quiere salir del juego)
        
        
            int desicion=0;
            desicion = Integer.parseInt(JOptionPane.showInputDialog("Desea seguir jugando \n 1. SI \n 2. NO"));
            if (desicion==1) {
                JOptionPane.showMessageDialog(null,"Siguiente partida:");
            }else{
                JOptionPane.showMessageDialog(null,"Gracias por jugar");
                Bandera=1;                               
            }
            
        } while (Bandera==0);
    }
    
}

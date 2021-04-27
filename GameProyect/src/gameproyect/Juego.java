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
public class Juego {
    
    
    Scanner leer = new Scanner(System.in);
    int numeroJugadores;
    int desicion;
    int Bandera=0;
        
    public void validacionNumeroJugadores(){
        int banderaDo=0;
        do {            
        System.out.println("Digite la cantidad de jugadores que participarán en el juego");
        numeroJugadores = leer.nextInt();            
            if (numeroJugadores>=3) {
                banderaDo=1;
            }else{
                System.out.println("La cantidad minima de jugadores deben ser: 3");
            }
        } while (banderaDo==0);               
    }
    
    public void nuevoJuego(){            
            
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }  

    public int getBandera() {
        return Bandera;
    }

    public void setBandera(int Bandera) {
        this.Bandera = Bandera;
    }
    
    
}

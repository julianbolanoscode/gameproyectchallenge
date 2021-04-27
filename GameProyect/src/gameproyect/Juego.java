/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproyect;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
            numeroJugadores = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de jugadores que desean jugar"));
            if (numeroJugadores>=3) {
                banderaDo=1;
            }else{
                JOptionPane.showMessageDialog(null,"La cantidad minima de jugadores deben ser: 3");
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

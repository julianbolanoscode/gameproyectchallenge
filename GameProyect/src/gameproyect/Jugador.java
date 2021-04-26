/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproyect;

/**
 *
 * @author Julian
 */
public class Jugador{
    
    private String nombre;
    private double recorrido;
    
    
    public Jugador(String nombre, double recorrido) {
        this.nombre = nombre;
        this.recorrido = recorrido;
    }
    
    public Jugador(){
        
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(double recorrido) {
        this.recorrido = recorrido;
    }
    
    @Override
    public String toString() {
        return nombre;
    }    
    
}

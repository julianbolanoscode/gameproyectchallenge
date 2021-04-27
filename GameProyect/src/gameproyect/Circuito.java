
package gameproyect;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Circuito {
   
    Scanner leer = new Scanner(System.in);
    int seleccion;
    int kilometros;
    
    public void escogerPista(){
    
        int bandera=0;
                
        do {
            seleccion = Integer.parseInt(JOptionPane.showInputDialog("Selecciona la pista en la que desean participar \n 1. Pista: 1km \n 2. Pista: 2km \n 3. Pista: 3km"));
             
            if (seleccion>=1 && seleccion<=3) {
                bandera = 1;
            }else{
                JOptionPane.showMessageDialog(null,"Elección incorrecta, intenta de nuevo");
            }
            
        } while (bandera==0);        
        switch(seleccion){
            case 1: kilometros=1000;
            break;
            case 2: kilometros=2000;
            break;
            case 3: kilometros=3000;
            break;
        }
        JOptionPane.showMessageDialog(null,"Esta pista tiene: " + kilometros + " metros");
    }

    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
    
   
}


package gameproyect;

import java.util.Scanner;


public class Circuito {
   
    Scanner leer = new Scanner(System.in);
    int seleccion;
    int kilometros;
    
    public void escogerPista(){
    
        int bandera=0;
                
        do {
            System.out.println("Selecciona la pista en la que desean participar");
            System.out.println("1. pista: 1km");
            System.out.println("2. pista: 2km");
            System.out.println("3. pista: 3km");
            seleccion = leer.nextInt();
            
            if (seleccion>=1 && seleccion<=3) {
                bandera = 1;
            }else{
                System.out.println("Elección incorrecta, intenta de nuevo");
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
        System.out.println("Esta pista tiene: " + kilometros + " metros");
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

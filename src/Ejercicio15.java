
import java.util.Scanner;

/*
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
    muestre por pantalla en orden descendente.
 */

/**
 *
 * @author franc
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int [] vectorEnteros = new int [100];
        
        for (int i = 0; i <= 99 ; i++) {
            
            vectorEnteros[i] = (i+1);
        }
        
        for (int i = 99 ; i >= 0 ; i--) {
    
            System.out.println(vectorEnteros[i]);
        }
        
        
        
        // TODO code application logic here
    }
    
}

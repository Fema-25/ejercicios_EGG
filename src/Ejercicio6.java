
import java.util.Scanner;

/*
 * Crear un programa que dado un numero determine si es par o impar.
 */

/**
 *
 * @author franc
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int numeroIngresado;
        
        
        
        System.out.println("Ingrese un numero");
        numeroIngresado = leer.nextInt();
        
        esPar(numeroIngresado);
        
        
        
        
        // TODO code application logic here
    }
    
    public static void esPar(int numero) {
    
        if(numero%2==0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }
            
   
    
    
}
    
    
}

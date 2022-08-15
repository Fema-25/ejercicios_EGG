
import java.util.Scanner;

/*
    Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
    es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
    diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
    la función Substring y equals() de Java.
 */

/**
 *
 * @author franc
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase.");
        frase = leer.nextLine();
        
        if(primeraLetraA(frase)) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }
        
        
        // TODO code application logic here
    }
    
    public static boolean primeraLetraA(String frase) {
        String aux;
        boolean respuesta;
        aux=frase.substring(0, 1).toUpperCase();
      
        respuesta = aux.equals("A");
      return respuesta;
       
     
        
    }
}

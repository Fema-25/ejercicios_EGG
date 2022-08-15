
import java.util.Scanner;

/*
 *  Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
    la función equals() en Java.
 */

/**
 *
 * @author franc
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String frase;
        String fraseDos;
        
        fraseDos="eureka";
        
        System.out.println("Ingrese una frase.");
        frase = leer.nextLine();
        
        if(frase.equals(fraseDos)) {
            System.out.println("La palabras son inguales");
        }
        else {
            System.out.println("La frases son diferentes");
        }
                
        
        
        // TODO code application logic here
    }
   
}

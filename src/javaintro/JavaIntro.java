/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
    dos. El programa deberá después mostrar el resultado de la suma 
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int numeroA;
        int numeroB;
        
        System.out.println("Ingrese el primero numero");
        numeroA=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        numeroB=leer.nextInt();
        
        System.out.println("La suma de los dos numero es: "+(numeroA+numeroB));
        
        // TODO code application logic here
    }
    
}

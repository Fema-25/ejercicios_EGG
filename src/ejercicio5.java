
import java.util.Scanner;

/*
 *  Escribir un programa que lea un número entero por teclado y muestre por pantalla el
    doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */

/**
 *
 * @author franc
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
         
         int numeroIngresado;
         double raiz;
         System.out.println("Ingrese un numero");
         numeroIngresado=leer.nextInt();
         raiz=Math.sqrt(numeroIngresado);
         
         System.out.println("Su numero ingresado es: "+numeroIngresado+"\nSu doble: "+(numeroIngresado*2)+"\nSu triple: "+(numeroIngresado*3)+"\nSu raiz Cuadrada: "+raiz);
        // TODO code application logic here
    }
    
}

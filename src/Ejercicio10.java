
import java.util.Scanner;

/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
 números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */

/**
 *
 * @author franc
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int limite;
        int numeroIngresado;
        int acumuladorNumero;
        
        acumuladorNumero=0;
        
        System.out.println("ingrese un limite mayor a cero");
        limite=leer.nextInt();
        while(limite<1){
            System.out.println("DIJE POSITIVO");
            limite=leer.nextInt();
        }
        System.out.println("Ingrese numeros hasta sobrepasar el limite ingresado");
        do{
            System.out.println("Ingrese un numero");
            numeroIngresado=leer.nextInt();
            acumuladorNumero=acumuladorNumero+numeroIngresado;
        }while(acumuladorNumero<limite+1);
        
        System.out.println("Se rompio el limite con: " + acumuladorNumero );
        
        
        // TODO code application logic here
    }
    
}


import java.util.Scanner;

/*
    Realizar un algoritmo que rellene un vector de tamaño N con valores
    aleatorios y le pida al usuario un numero a buscar en el vector. el
    programa mostrara donde se encuentra el numero y si se encuentra repetido
 */

/**
 *
 * @author franc
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int tam;
        int numeroABuscar;
        
        //le pido al usuario el tamaño del vector
        System.out.println("Ingrese el tamaño del vector plis");
        tam=leer.nextInt();
        while(tam<1) {
            System.out.println("No seas pendejo pone un numero positivo");
            tam=leer.nextInt();
        }
        //creo el vector con el tamaño asignado por el user
        int vectorDeNumeros[] = new int [tam];
        
      //cargo aleatoriamente el vector
          for (int i = 0; i < tam-1; i++) {
            
            vectorDeNumeros[i] = (int) (Math.random() * 10);
            
        }
        
        System.out.println("Que numero desea buscar dentro del vector");
        numeroABuscar=leer.nextInt();
        while(numeroABuscar>9 || numeroABuscar<0) {
            System.out.println("Solo se pueden buscar numeros de 0 a 9");
            numeroABuscar=leer.nextInt();          
        }
        
        //creo otro for donde voy a buscar el numero igresado 
        
        for (int i = 0; i < tam-1; i++) {
           
            if(numeroABuscar==vectorDeNumeros[i]) {
                System.out.println("Se encontro el numero: " + numeroABuscar + " en la posicion: " +i);
            }
            
        }
        
        
          
        
        // TODO code application logic here
    }
    
}
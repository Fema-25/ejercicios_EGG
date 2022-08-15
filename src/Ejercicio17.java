
import java.util.Scanner;

/*
 *  Recoore un vector de N enteros contabilizando cuantos numeros son de 1 digito
    cunatos de 2 hasta 5  como maximo
 */

/**
 *
 * @author franc
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int tam;
        
        
        //le pido al usuario el tamaño del vector
        System.out.println("Ingrese el tamaño del vector plis");
        tam=leer.nextInt();
        while(tam<1) {
            System.out.println("No seas pendejo pone un numero positivo");
            tam=leer.nextInt();
        }
        //creo el vector con el tamaño asignado por el user
        int vectorDeNumeros[] = new int [tam];
        
        cargarVectorInt(vectorDeNumeros, tam);
        contabilizarNumerosPorDigitos(vectorDeNumeros, tam);
        
        
        
        // TODO code application logic here
    }
    
    public static void cargarVectorInt ( int vector[], int tam) {
        Scanner leer = new Scanner (System.in);
        
        for (int i = 0; i < tam-1; i++) {
            System.out.println("Ingrese un numero para la posicion: "+i);
            vector[i]=leer.nextInt();
            
        }
    }
    
    public static void contabilizarNumerosPorDigitos(int vector[], int tam) {
        String digitos;
        int contadorUno = 0;
        int contadorDos = 0;
        int contadorTres = 0;
        int contadorCuatro = 0;
        int contadorCinco = 0;
        
        
        
        for (int i = 0; i < tam-1; i++) {
            
            digitos=Integer.toString(vector[i]);
            switch(digitos.length()) {
                case 1:
                    contadorUno++;
                    break;
                case 2:
                    contadorDos++;
                    break;
                case 3:
                    contadorTres++;
                    break;
                case 4:
                    contadorCuatro++;
                    break;
                case 5:
                    contadorCinco++;
                    break;
                    
            }
            
        }
        System.out.println("Cantidad de numeros segun su digito");
        System.out.println("Un digito: " +contadorUno);
        System.out.println("Dos digitos: "+contadorDos);
        System.out.println("Tres digitos: "+contadorTres);
        System.out.println("Cuatro digitos: "+contadorCuatro);
        System.out.println("Cinco digitos: "+contadorCinco);
        
    }
    
}

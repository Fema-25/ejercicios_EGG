
import java.util.Scanner;

/*
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

/**
 *
 * @author franc
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int gradoC;
        int gradoF;
        
        System.out.println("Cuantos grados hace hoy ? (En centigrados)");
        gradoC=leer.nextInt();
        
        gradoF=convertidorAFahrenheit(gradoC);
        
        System.out.println(gradoC+"C "+gradoF+"30"
                + "F");
        
        // TODO code application logic here
    }
    public static int convertidorAFahrenheit(int centigrados){
       // F = 32 + (9 * C / 5).
       return 32+(9*centigrados/5);
        
    }
    
}

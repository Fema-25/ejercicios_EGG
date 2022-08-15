
import java.util.Scanner;

/*
 *  Crea una aplicación que a través de una función nos convierta una cantidad de euros
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
    función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
    (void).
    El cambio de divisas es:
*   0.86 libras es un 1 €
*   1.28611 $ es un 1 €
*   129.852 yenes es un 1 €
 */

/**
 *
 * @author franc
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double euros;
        String moneda;
        
        //pido la cantidad de euros
        System.out.println("Ingrese la cantidad de Euros a comvertir");
        euros=leer.nextDouble();
        while(euros<0) {
            System.out.println("Ingrese una cantidad positiva");
          euros=leer.nextFloat();
        }
        //pido el tipo de cambio
        System.out.println("A que moneda desea convertir? (dolar,yenes,libras)");
        moneda=leer.next().toLowerCase();
        while (!moneda.equals("dolar") && !moneda.equals("yenes") && !moneda.equals("libras")) {
            System.out.println("Ingrese una moneda valida");
            moneda=leer.next().toLowerCase();
                
        }
        
        //uso mi subproceso para convertir y mostrar
        convertido((float) euros, moneda);
        // TODO code application logic here
    }   
    public static void convertido(float euro, String moneda) {
        //  El cambio de divisas es:
        //  0.86 libras es un 1 €
        //  1.28611 $ es un 1 €
        //  129.852 yenes es un 1 €
        double libras =0.86;
        double dolar = 1.28611;
        double yenes = 129.852;
        
        switch(moneda) {
            case"dolar":
                System.out.println(euro +"€ a dolar es: "+ euro*dolar );
                break;
            case"yenes":
                System.out.println(euro +"€ a yenes es: "+ euro*yenes);
                break;
            case"libras":
                System.out.println(euro+ "€ a libras es: " + euro*libras);
                break;
                
        }
        
    }
    
}

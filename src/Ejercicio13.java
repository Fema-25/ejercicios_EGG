
import java.util.Scanner;

/*
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
*  *  *  *
*        *
*        *
*  *  *  *
 */

/**
 *
 * @author franc
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int tamanio;
        
        System.out.println("Ingrese un tamaño para el cuadrado de *");
        tamanio=leer.nextInt();
        
        for (int i = 0; i < tamanio; i++) {
            
             if (i==0 || i==tamanio-1) {
                 for (int j = 0; j < tamanio; j++) {
                     System.out.print("*");
                 }
            }
             if(i>0 && i<tamanio-1) {
                 for (int j = 0; j < tamanio; j++) {
                     if (j==0 || j==tamanio-1) {
                        System.out.print("*");
                     }else {
                         System.out.print(" ");
                     }
                         
                 }
                 
             }
       
               
            
                
            System.out.print("\n");
        }
        
        
        
        
        // TODO code application logic here
    }
    
    }


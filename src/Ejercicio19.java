
import java.util.Scanner;

/*
 *  realice un programa que compruebe si una matriz dada es anti simetrica.
     se dice que una matriz A es anti simetrica cuando esta es igual a su propia traspuesta,
     pero cambiada de signo. Es decir, A es anti simetrica si A=-AT. La matriz trasousta 
     de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas
     (o viceversa).
 */

/**
 *
 * @author franc
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matrizEntero [][] = new int [3][3];
        
        System.out.println("Ingrese numeros para su matriz");
        //Cargarmos la matriz
        cargarMatrizInt(matrizEntero, 3, 3);
        
        //mostramos la matriz
        mostrarMatriz(matrizEntero, 3, 3);
        //esta es la transpuesta
        System.out.println("Esta es la traspuesta");
        System.out.println("");
        mostrarMatrizTraspuesta(matrizEntero, 3, 3);
        
        if(comprobarAntiSimetrica(matrizEntero, 3, 3)) {
            System.out.println("La matriz es anti simetrica");
        }
        else{
            System.out.println("La matriz no es anti simetrica");
        }
        
        
        
        
        
            
    }
    public static void cargarMatrizInt (int matriz[][],int fila,int colum) {
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                matriz[i][j]=leer.nextInt();
            }
        }
        
    }
    
    public static void mostrarMatriz(int matriz[][],int fila,int colum) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                  if(matriz[i][j]>=0) {
                    System.out.print(" ");
                }
                System.out.print(matriz[i][j]);
                
                
                
            }
            System.out.print("\n");
            
        }
    }
    
    public static void mostrarMatrizTraspuesta(int matriz[][],int fila,int colum) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                  if(matriz[j][i]>=0) {
                    System.out.print(" ");
                }
                System.out.print(matriz[j][i]);
                
                
                
            }
            System.out.print("\n");
            
        }
    }
    public static boolean comprobarAntiSimetrica(int matriz[][],int fila,int colum) {
        boolean respuesta = false;
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                respuesta = matriz[i][j]==matriz[j][i]*(-1);
                if(respuesta==false) {
                    break;
                }
            }
        }
        return respuesta;
                
    }
    
}
            


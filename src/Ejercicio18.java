
import java.util.Scanner;

/*
     Realizar un programa que rellene un matriz de 4x4 de valores aleatorios
     y muestre ala traspuesta  de la matriz. La matriz traspuest de una matriz. A se denota por
     B y se obtiene cambiando sus filas por columnas o (o viceversa)
 */

/**
 *
 * @author franc
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matrizEnteros [][] = new int [4][4];
        
        cargaAleatoriaMatrizInt(matrizEnteros, 4, 4);
        System.out.println("matriz");
        mostrarMatriz(matrizEnteros, 4, 4);
        System.out.println("traspuesta");
        mostrasTraspuesta(matrizEnteros, 4, 4);
        
        
        
        
        // TODO code application logic here
    }
    public static void cargaAleatoriaMatrizInt(int matriz[][],int fila, int columna) {
        for (int i = 0; i < fila-1; i++) {
            for (int j = 0; j <columna-1; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static void mostrarMatriz(int matriz[][],int fila,int columna) {
        for (int i = 0; i < fila-1; i++) {
            for (int j = 0; j < columna-1; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
    }
   public static void mostrasTraspuesta(int matriz[][],int fila,int colum) {
       for (int j = 0; j < colum-1; j++) {
           for (int i = 0; i < fila-1; i++) {
               System.out.print(matriz[i][j]);
           }
           System.out.print("\n");
       }
   }
}

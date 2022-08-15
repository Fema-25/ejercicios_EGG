
import java.util.Scanner;



/**
 *
 * @author franc
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numeroA;
        int numeroB;
        int opcion;
        
        System.out.println("Ingrese un numero");
        numeroA=leer.nextInt();
        System.out.println("Ingrese otro numero");
        numeroB=leer.nextInt();
        
        do{
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir \n Elija una opcion.");
            
            
            opcion=leer.nextInt();
            
            switch (opcion) {
                case 1:
                  

                    System.out.println("1. sumar");
                    System.out.println(numeroA+numeroB);
                    break;
                    
                case 2:
                    System.out.println("2. Restar");
                    System.out.println(numeroA-numeroB);
                    break;
                    
                case 3:
                    System.out.println("3. Multiplicar");
                    System.out.println(numeroA*numeroB);
                    break;
                    
                case 4:
                    System.out.println("4. Dividir");
                    System.out.println(numeroA/numeroB);
                    break;
                    
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    
                    if("S".equals(leer.next().toUpperCase())){
                        opcion=5;
                    }
                    else
                        opcion=0;
                    break;
            }
                    
            
        }while(opcion!=5);
        
        System.out.println("Aplicacion Finalizada");
               
        
        

        // TODO code application logic here
    }
    
}


import java.util.Scanner;

/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */

/**
 *
 * @author franc
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String cadena;
        String especial="&";
        boolean primeraX;
        boolean ultimaO;
        
        int contadorEntradas;
      
        contadorEntradas=0;
      
        do{
            
            System.out.println("Ingrese la cadena");
        
            cadena = leer.nextLine().toUpperCase();
            
            
                
            primeraX=(cadena.charAt(0)=='X');
            ultimaO=(cadena.charAt(cadena.length()-1)=='O');
            
            if(primeraX && ultimaO && cadena.length()<6)  {
                contadorEntradas++;
            }
            else {
                
                System.out.println("Se ingreso un formato incorrecto");
            }
                
        }while(!"&&&&&".equals(cadena));
        
        System.out.println("Se ingresaron: "+ contadorEntradas +" codigos" );
          
    }
}
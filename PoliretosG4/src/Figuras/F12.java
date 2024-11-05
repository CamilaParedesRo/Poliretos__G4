package Figuras;

import java.util.Scanner;

/*      ... 
        123456789 
        12345678 
        1234567 
        123456 
        12345 
        1234 
        123 
        12 
        1 
 * 
 */
public class F12 {
public void figura12() {
       int numeros;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de la extención de}l triángulo de números invertido: ");
        numeros = scanner.nextInt();
        System.out.println( " ");

        for (int filas = 1; filas <= numeros; filas++) {                      
            for (int columnas = 1 ; columnas <= numeros; columnas++){   
                if (columnas <= numeros - filas + 1){
                    System.out.print(columnas);
                } else { 
                System.out.print(" ");
                }  
        }
        System.out.println( " ");
    }   
}
}

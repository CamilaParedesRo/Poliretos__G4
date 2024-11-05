package Figuras;

import java.util.Scanner;

/* ___ 
      | _  
          | _  
              | _ 
                  | _ 
                      | _

 */
public class F7 {

    public void figura7() {
       int desplazamiento;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de la extención de la escalera: ");
        desplazamiento = scanner.nextInt();
        for (int filas = 1; filas <= desplazamiento; filas++) {                      
            for (int columnas = 1 ; columnas <= desplazamiento; columnas++){   
                if (filas == columnas){ 
                System.out.print(  " |__ ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" " );
        }
    }
}

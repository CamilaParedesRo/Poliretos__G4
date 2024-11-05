package Loading;
        /* Pedir y mostrar el nombre completo, mostrando solo una letra en la misma 
        linea 0% hasta 100%  
        Ejemplo: Patricio Paccha 
            t                   15% 
        r                       20% 
                o               50% 
                    a          100% 
*/

import java.util.Scanner;

public class L9 {

    public void porcenjateNombre (){
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el nombre completo
        System.out.print("Ingresa tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();
        
        int longitud = nombreCompleto.length();
        
        for (int i = 0; i < longitud; i++) {
            // Calcular el porcentaje actual
            int porcentaje = (i * 100) / (longitud - 1);
            
            // Imprimir espacios para alinear la letra en la posición correspondiente
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            // Imprimir la letra y el porcentaje
            System.out.println(nombreCompleto.charAt(i) + "\t " + porcentaje + "%");
        }
        
        scanner.close();
    }
}
    

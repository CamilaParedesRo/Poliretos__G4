package SeriesCaracteres;

import java.util.Scanner;

// + - + - + - + ...  
public class SC1 {
    
    public void serie_SC1 (){
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
        cantidad = scanner.nextInt();
        System.out.println(" La serie es la siguiente: ");
        for (int i = 0 ; i < cantidad; i++) {
            if (i == 0 || i % 2 == 0) {
                System.out.print("+ ");
            } else {
                System.out.print("- ");
            }
        }


     }
}

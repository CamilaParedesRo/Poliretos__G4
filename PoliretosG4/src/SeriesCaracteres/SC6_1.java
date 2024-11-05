package SeriesCaracteres;

import java.util.Scanner;

// a  b   c   d   e   f   g   h   ... 
public class SC6_1 {
    public void serieSC6_1 (){
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
        cantidad = scanner.nextInt();
        System.out.println(" La serie es la siguiente: ");
        for (int i = 0 ; i < cantidad; i++) {
            
            System.out.print((char)('a' + (i % 26)) + " "); // Codigo ASCII empieza de a es 97
        }
    }
}
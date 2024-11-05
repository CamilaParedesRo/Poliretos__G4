package SeriesCaracteres;

import java.util.Scanner;
//  a  +   c   -   e   +   g   -   ... 
public class SC6_2 {

     public void serieSC6_2 (){
        Scanner scanner = new Scanner(System.in);
        int cantidad, b;
        System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
        cantidad = scanner.nextInt();
        System.out.println(" La serie es la siguiente: ");
        for (int i = 0 ; i < cantidad; i++) {
            if (i == 0 || i % 2 == 0) {          
                System.out.print((char)('a' + (i % 26))  + " ");
            }else if (i % 4 == 1) {
                System.out.print("+ ");
            }else{ 
                System.out.print("- ");
            }
        }
    }
 }

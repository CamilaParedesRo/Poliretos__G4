package SerieNumericas;

import java.util.Scanner;

// 1  4   9   16  25  36  49  64 .... 
public class S6 {

        public void serieN2 (){
        Scanner scanner = new Scanner(System.in);
        int a = 1, n ;
        System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
        n = scanner.nextInt();
        System.out.println(" La serie es la siguiente: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a = a + (2*i) + 3;
        }
        
    }
}

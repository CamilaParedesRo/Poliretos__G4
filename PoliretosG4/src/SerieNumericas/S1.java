package SerieNumericas;
import java.util.Scanner;
// 0 1 1 2 3 5 8 13 ...  
public class S1 {

    public void serie (){
        Scanner scanner = new Scanner(System.in);
        int a = 0, b =1, c = 0, n;
        System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
        n = scanner.nextInt();
        System.out.println(" La serie es la siguiente: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    
        
    }
}


package CadenaCaracteres;
import java.util.Scanner;

/*  Pedir una frase y una vocal, eliminar la vocal ingresada de la frase.  
        Ejemplo, frase: ballena azul   
                vocal : a 
                salida: b ll n   z l 
*/
public class CC3 {
    public void cadena3() {
        String frase;
        char vocal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
       frase = scanner.nextLine();
       String sinVocales = frase.replaceAll("[a,e,i,o,u,A,E,I,O,U]", " ");
       System.out.println(sinVocales);
    }
    
}

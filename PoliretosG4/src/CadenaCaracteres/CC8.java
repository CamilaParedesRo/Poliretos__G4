package CadenaCaracteres;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/* Anagramas de palabras.  
        Se forman cuando se utilizan todas las letras de una palabra pero 
modificando el orden. 
        Mostrar una palabra de un conjunto y solicita que ingrese el Anagramas de 
esa palabra. 
        Si falla a la tercera mostrar la respuesta 
            Ejemplo, palabra : delira 
                     salida  : lidera  
        conjunto = {delira, lidera, Ballena: llenaba, Alondra, Ladrona, España, 
apañes, Enrique, quieren} 
*/
public class CC8 {

       public void cadena8() {
        // Listado de palabras y sus anagramas correspondientes
        Map<String, String> palabrasYAnagramas = new HashMap<>();
        palabrasYAnagramas.put("delira", "lidera");
        palabrasYAnagramas.put("ballena", "llenaba");
        palabrasYAnagramas.put("alondra", "ladrona");
        palabrasYAnagramas.put("españa", "apanes");
        palabrasYAnagramas.put("enrique", "quieren");

        // Mostrar las palabras disponibles al usuario
        System.out.println("Las palabras son: " + palabrasYAnagramas.keySet());
        System.out.println("Ingresa una palabra y su anagrama correspondiente:");

        Scanner scanner = new Scanner(System.in);
        boolean acierto = false;

        // Intentos máximos
        int maxIntentos = 3;

        // Ciclo para los intentos
        for (int intentos = 1; intentos <= maxIntentos; intentos++) {
            System.out.print("Ingrese la palabra: ");
            String palabra = scanner.nextLine().toLowerCase();

            System.out.print("Ingrese el anagrama: ");
            String anagramaIntento = scanner.nextLine().toLowerCase();

            // Verificamos si el anagrama es correcto
            if (palabrasYAnagramas.containsKey(palabra) && 
                anagramaIntento.equalsIgnoreCase(palabrasYAnagramas.get(palabra))) {
                acierto = true;
                System.out.println("¡Correcto! El anagrama de " + palabra + " es " + anagramaIntento);
                break;
            } else {
                System.out.println("Incorrecto.");
            }
        }

        // Mensaje final en caso de fallar todos los intentos
        if (!acierto) {
            System.out.println("Lo siento, has fallado tres veces. Aquí están los anagramas correctos:");
            for (Map.Entry<String, String> entrada : palabrasYAnagramas.entrySet()) {
                System.out.println("Palabra: " + entrada.getKey() + " -> Anagrama: " + entrada.getValue());
            }
        }

        scanner.close();
    }
       
}
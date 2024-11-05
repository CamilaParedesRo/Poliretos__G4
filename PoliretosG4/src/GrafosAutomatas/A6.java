package GrafosAutomatas;


import java.util.Scanner;

/*
    Crear un compilador para validar el sigueinte lenguaje L ={for, if, else, 
    ifelse, foreach} 
        considerar los caracteres de aceptacion, Ejemplo: 
        for( 
        for (  
*/
public class A6 {
    
    public enum Estado {
        inicial, f, fo, for_, i, if_, ifel, ifels, ifelse, forea, foreac, foreach, error
    }

    public static Estado transicion(Estado estadoActual, char c) {
        switch (estadoActual) {
            case inicial:
                if (c == 'f') return Estado.f;
                if (c == 'i') return Estado.i;
                return Estado.error;

            case f:
                if (c == 'o') return Estado.fo;
                if (c == 'o') return Estado.forea;
                return Estado.error;

            case fo:
                if (c == 'r') return Estado.for_;
                return Estado.error;

            case for_:
                if (c == '(') return Estado.inicial; // Estado de aceptación para "for("
                return Estado.error;

            case i:
                if (c == 'f') return Estado.if_;
                if (c == 'f') return Estado.ifel;
                return Estado.error;

            case if_:
                if (c == '(') return Estado.inicial; // Estado de aceptación para "if("
                return Estado.error;

            case ifel:
                if (c == 's') return Estado.ifels;
                return Estado.error;

            case ifels:
                if (c == 'e') return Estado.ifelse;
                return Estado.error;

            case ifelse:
                if (c == '(') return Estado.inicial; // Estado de aceptación para "ifelse("
                return Estado.error;

            case forea:
                if (c == 'e') return Estado.foreac;
                return Estado.error;

            case foreac:
                if (c == 'h') return Estado.foreach;
                return Estado.error;

            case foreach:
                if (c == '(') return Estado.inicial; // Estado de aceptación para "foreach("
                return Estado.error;

            default:
                return Estado.error;
        }
    }

    // Método para verificar si una cadena es válida en el lenguaje
    public static boolean validarCadena(String cadena) {
        Estado estadoActual = Estado.inicial;

        for (char c : cadena.toCharArray()) {
            estadoActual = transicion(estadoActual, c);
            if (estadoActual == Estado.error) {
                return false; // La cadena no es válida
            }
        }

        // Verificar si el estado final es un estado de aceptación
        return estadoActual == Estado.for_ || estadoActual == Estado.if_ || estadoActual == Estado.ifelse || estadoActual == Estado.foreach;
    }

    // Método para ejecutar el autómata
    public void automata1() {
        Scanner scanner = new Scanner(System.in);   
        System.out.print("Ingrese una palabra: ");
        String cadena = scanner.nextLine();

        if (validarCadena(cadena)) {
            System.out.println("La palabra es válida en el lenguaje L.");
        } else {
            System.out.println("La palabra no es válida en el lenguaje L.");
        }
    }
}
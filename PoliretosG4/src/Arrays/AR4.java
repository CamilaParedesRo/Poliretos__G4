package Arrays;
/*Crear un matriz donde forme una X con su nombre y apellido 
        P                           P 
            a                   a 
                t           c 
                    r   c 
                    h   i 
                a           c 
                                i 
                                    o  */
public class AR4 {
    public void array4() {
        
        String nombre = "Camila";
        String apellido = "Parede";
        int longitudNombre = nombre.length();
        int longitudApellido = apellido.length();

        char[][] matriz = new char[longitudNombre][longitudApellido];
        
        
        for (int filas = 0; filas < longitudNombre; filas++) {
            for (int columnas = 0; columnas < longitudApellido; columnas++) {
                if (filas + columnas == longitudApellido - 1) {
                    matriz[filas][columnas] = apellido.charAt(filas);
                } else if (filas == columnas) {

                    matriz[filas][columnas] = nombre.charAt(filas);
                   
                }else {
                    matriz[filas][columnas] = ' ';
                }
            }
        }
        
        for (int filas = 0; filas < longitudNombre; filas++) {
            for (int columnas = 0; columnas < longitudNombre; columnas++) {
                System.out.print(matriz[filas][columnas]);
            }
            System.out.println();
        }
        
    }
}

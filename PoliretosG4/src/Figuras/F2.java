package Figuras;
/*      * + * + * 
        +       + 
        *       *    
        +       + 
        * + * + * 
*/
public class F2 {

    public void figura2() {
        int tamano = 5;

        for (int filas = 1; filas <= tamano; filas++) {                      
            for (int columnas = 1 ; columnas <= tamano ; columnas++){        
                if ((filas == 1 && columnas == 1)| (filas == 5 && columnas == 5)||(filas == 1 && columnas == 5)||(filas == 5 && columnas == 1) 
                    ||(filas == 3 && columnas == 1)||(filas == 3 && columnas == 5)||(filas == 1 && columnas == 3)||(filas == 5 && columnas == 3)){   
                    System.out.print( "* ");                        
                } else if ((filas == 1 && columnas == 2)| (filas == 1 && columnas == 4)||(filas == 2 && columnas == 1)||(filas == 2 && columnas == 5)
                 ||(filas == 4 && columnas == 1)| (filas == 4 && columnas == 5)||(filas == 5 && columnas == 4)||(filas == 5 && columnas == 2)    ) {
                    System.out.print("+ ");                         
                } else {
                    System.out.print( "  ");
                }
            }
            System.out.println();  
               
        }
         }
 
  }
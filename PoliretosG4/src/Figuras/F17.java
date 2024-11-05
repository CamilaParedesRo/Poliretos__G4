package Figuras;

import java.util.Scanner;

/*
       1           1
         0      0
            1
         0      0
       1           1   
*/
public class F17 {
  public void figura17() {
       int longitud = 5 ;
        for (int filas = 1; filas <= longitud ; filas++) {                      
            for (int columnas = 1 ; columnas <= longitud ; columnas++){   
              if (filas == columnas || filas + columnas == longitud + 1) {
                if (filas % 2 == 1) {
                  System.out.print("1");
              } else {
                  System.out.print("0");
              }
          } else {
              System.out.print(" "); 
          }
        }
        System.out.println();
    } 
  } 
}
 

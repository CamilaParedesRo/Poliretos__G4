package Recursion;
//crear un metodo recursivo para obtener la suma(a,b) 
public class R2 {
   public static int sumaRecursiva(int [] A, int i){
      if (i == A.length){
         return 0;
      }else {
         return A[i] + sumaRecursiva(A, i+1);
      }
   }

   int A [] = {2,1,5,4,3,2,7,8,5};
   int resusultado;
   public void sumaDeRecursion(){
      resusultado = sumaRecursiva(A, 0);
      System.out.println(resusultado);
   }

}

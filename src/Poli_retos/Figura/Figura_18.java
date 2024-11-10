package Poli_retos.Figura;

public class Figura_18 {
   // 2
   // 1 2
   // 1 3 2
   // 1 4 5 2
   // 1 5 9 7 2
   // 1 6 14 16 9 2
   // ....
   public void G4_Figuras_18() {
      int longitud = 10;

      System.out.println("Figura 18");
  
      int triangulo_pascal[][] = new int[longitud][longitud];
  
      for (int filas = 0; filas < longitud; filas++) {                      
          for (int columnas = 0; columnas <= filas; columnas++) {   
              triangulo_pascal[filas][columnas] = triangulo(filas + 1, columnas + 1);
          }
      }
  
      for (int filas = 0; filas < longitud; filas++) {                      
          for (int columnas = 0; columnas <= filas; columnas++) {   
              System.out.print(triangulo_pascal[filas][columnas] + " ");
          }
          System.out.println();
      }
  }
  
  public static int triangulo(int i, int j) {
      if (j == 1 ) {
          return 1;
      } else if (i == j) {
            return 2;
      }  else {
            return triangulo(i - 1, j - 1) + triangulo(i - 1, j);
      }
   }
 }

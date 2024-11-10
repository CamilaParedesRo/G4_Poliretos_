package Poli_retos.Figura;

public class Figura_18 {
   public void G4_Figuras_18(int extension) {
      System.out.println("Figura 18");
  
      int triangulo_pascal[][] = new int[extension][extension];
  
      for (int filas = 0; filas < extension; filas++) {                      
          for (int columnas = 0; columnas <= filas; columnas++) {   
              triangulo_pascal[filas][columnas] = triangulo(filas + 1, columnas + 1);
          }
      }
  
      for (int filas = 0; filas < extension; filas++) {                      
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

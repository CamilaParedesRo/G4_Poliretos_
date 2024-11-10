
package Poli_retos.Recursion;

public class Recursion_3 {

   public static int multiplicacion_recursiva(int a, int b) {
      if (b == 0) {
          return 0;
      } else if (b > 0) {
          return a + multiplicacion_recursiva(a, b - 1);
      } else {
          return -multiplicacion_recursiva(a, -b);
      }
  }
  
    public void G4_Recursion_3(){
      int resultado = multiplicacion_recursiva(100, 4); // multiplicacion 
      System.out.println("Resultado: " + resultado);
      System.out.println( " ");
  }
}

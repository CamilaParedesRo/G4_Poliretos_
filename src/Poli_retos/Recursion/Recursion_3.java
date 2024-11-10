
package Poli_retos.Recursion;

import java.util.Scanner;

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

        System.out.println("Recursión 3");
       Scanner scanner = new Scanner(System.in);

      int a = 0;
      while (true) {
         System.out.print("Ingresa el primer número: ");
         if (scanner.hasNextInt()) {
            a = scanner.nextInt(); 
            break; 
         } else {
            System.out.println("Error: Por favor, ingrese un número entero válido.");
            scanner.next(); 
         }
      }

      int b = 0;
      while (true) {
         System.out.print("Ingresa el segundo número: ");
         if (scanner.hasNextInt()) {
            b = scanner.nextInt(); 
            break; 
         } else {
            System.out.println("Error: Por favor, ingrese un número entero válido.");
            scanner.next();
         }
      }


      int resultado = multiplicacion_recursiva(a, b);
      System.out.println("El resultado de " + a + " * " + b + " es: " + resultado);
   }
  }


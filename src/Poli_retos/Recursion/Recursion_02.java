package Poli_retos.Recursion;

import java.util.Scanner;

public class Recursion_02 {
   public static int sumaRecursiva(int [] A, int i){
      if (i == A.length){
         return 0;
      }else {
         return A[i] + sumaRecursiva(A, i+1);
      }
   }

   public void G4_Recursion_2(){
      
         Scanner scanner = new Scanner(System.in);
         int cantidad;
         while (true) {
            System.out.println("¿Cuántos números deseas ingresar?: ");
            if (scanner.hasNextInt()) {
                cantidad = scanner.nextInt();
                if (cantidad > 0) {
                 break; 
             } else {
                 System.out.println("Error: Por favor, ingrese un número entero positivo.");
             } 
            } else {
                System.out.println("Error: Por favor, ingrese un número entero válido.");
                scanner.next(); 
            }
         }

         int[] A = new int[cantidad];
      
         System.out.println("Por favor, ingresa " + cantidad + " números:");
      for (int i = 0; i < cantidad; i++) {
         int numero = 0;
         while (true) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
               numero = scanner.nextInt(); 
               break; 
            } else {
               System.out.println("Error: Por favor, ingrese un número entero válido.");
               scanner.next(); 
            }
         }
         A[i] = numero; // Almacenar los numeros
      }

         int resultado = sumaRecursiva(A, 0);
         System.out.println("La suma de los números es: " + resultado);
         System.out.println(" ");
      }
   }



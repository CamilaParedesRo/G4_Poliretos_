package Poli_retos.Figura;

import java.util.Scanner;

public class Figura_12 {
public void G4_Figuras_12( Scanner scanner) {
      int numeros;
      System.out.println("Figura 12");    
       System.out.println("Ingrese el numero de la extención de}l triángulo de números invertido: ");
       numeros = scanner.nextInt();
       System.out.println( " ");

       for (int filas = 1; filas <= numeros; filas++) {                      
           for (int columnas = 1 ; columnas <= numeros; columnas++){   
               if (columnas <= numeros - filas + 1){
                   System.out.print(columnas);
               } else { 
               System.out.print(" ");
               }  
       }
       System.out.println( " ");
   }  
   System.out.println(" ");
}
}

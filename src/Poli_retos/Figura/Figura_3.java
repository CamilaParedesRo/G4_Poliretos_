 package Poli_retos.Figura;

import java.util.Scanner;

public class Figura_3 {
 public void G4_Figuras_3 (Scanner scanner){
        int tamano;
      System.out.println("Figura 03");    
        System.out.println("Ingrese el numero de la extención de la escalera: ");
        tamano = scanner.nextInt();
        for (int filas = 1; filas <= tamano; filas++) {                      
            for (int columnas = 1 ; columnas <= tamano; columnas++){
                if (columnas <= filas){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println ("");
        }
        System.out.println(" ");
   }
}

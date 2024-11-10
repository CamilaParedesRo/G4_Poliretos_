package Poli_retos.Figura;

import java.util.Scanner;

public class Figura_7 {
public void G4_Figuras_7(Scanner scanner){
       int desplazamiento;
      System.out.println("Figura 07");    
        System.out.println("Ingrese el numero de la extención de la escalera: ");
        desplazamiento = scanner.nextInt();
        for (int filas = 1; filas <= desplazamiento; filas++) {                      
            for (int columnas = 1 ; columnas <= desplazamiento; columnas++){   
                if (filas == columnas){ 
                System.out.print(  " |__ ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" " );
        }
      System.out.println(" ");    
    }
}

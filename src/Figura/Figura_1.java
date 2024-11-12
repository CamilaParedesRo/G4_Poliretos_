package Figuras;

import java.util.Scanner;

public class Figura_1 {
    /**
    muestra la figura F1:
    * * * * *
    *       *
    *       *  
    *       *           
    * * * * *
    */
    public void G4_Figuras_1(Scanner scanner) {
        System.out.println("Figura 01"); 
         System.out.println("Ingrese el numero de * que tendra la figura de ancho y largo (solo ingrese un numero): ");
         int numeroNiveles = scanner.nextInt();
         for (int i = 0; i < numeroNiveles; i++) {
            for (int j = 0; j < numeroNiveles; j++) {
                if (i == 0 || i == numeroNiveles - 1 || j == 0 || j == numeroNiveles - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Espacio para el interior
                }
            }
            System.out.println();
        }
    }

}

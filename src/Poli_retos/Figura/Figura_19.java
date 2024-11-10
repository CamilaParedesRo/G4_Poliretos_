package Poli_retos.Figura;

import java.util.Scanner;

public class Figura_19 {
 public void G4_Figura_19(Scanner scanner){
        System.out.println("Figura 19");
        System.out.print("Introduce el número de filas para el patrón triangular: ");
        int filas = scanner.nextInt();
        
        System.out.print("Introduce el número inicial: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("+ ");
                } else if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print(numero + " ");
                    numero++;
                }
            }
            System.out.println();
        }

        
    }
}

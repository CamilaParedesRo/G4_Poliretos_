package Poli_retos.Figura;

import java.util.Scanner;

public class Figura_14 {
public void G4_Figura_14(Scanner scanner) {
        System.out.println("Figura 14");
        System.out.print("Introduce el número de filas para el Triángulo de Pascal: ");
        int filas = scanner.nextInt();

        for (int i = 0; i < filas; i++) {
           
            for (int j = 0; j < filas - i; j++) {
                System.out.print(" ");
            }

            int valor = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(valor + " ");
                valor = valor * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

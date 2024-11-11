package Poli_retos.Figura;

import java.util.Scanner;

public class Figura_04 {
public void G4_Figura_4(Scanner scanner) {

        System.out.println("Figura 4");
        
        System.out.print("Ingrese el tamaño: ");
        int tamaño = scanner.nextInt();
        
        for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= tamaño - i; j++) {
                System.out.print("  "); 
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}

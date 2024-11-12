package Poli_retos.Figura;

import java.util.Scanner;

public class Figura_19 {
 public void G4_Figura_19(int extension){
        System.out.println("Figura 19");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el número inicial: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= extension; i++) {
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

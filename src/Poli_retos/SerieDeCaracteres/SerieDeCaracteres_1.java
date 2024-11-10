package Poli_retos.SerieDeCaracteres;

import java.util.Scanner;

public class SerieDeCaracteres_1 {
public void G4_SeriesDeCaracteres_SC1 (Scanner scanner){
        int cantidad;
      System.out.println("Serie de caractes 01");
        System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
        cantidad = scanner.nextInt();
        System.out.println(" La serie es la siguiente: ");
        for (int i = 0 ; i < cantidad; i++) {
            if (i % 2 == 0) {
                System.out.print("+ ");
            } else {
                System.out.print("- ");
            }
        }
       System.out.println(" ");

   }
}

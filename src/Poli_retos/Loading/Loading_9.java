package Poli_retos.Loading;

import java.util.Scanner;

public class Loading_9 {
 public void G4_Loading_9 (Scanner scanner){
         System.out.print("Loading 9");
        System.out.print("Ingresa tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();
        int longitud = nombreCompleto.length();
        
        for (int i = 0; i < longitud; i++) {
            int porcentaje = (i * 100) / (longitud - 1);
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(nombreCompleto.charAt(i) + "\t " + porcentaje + "%");
        }
        System.out.print("");
    }
}

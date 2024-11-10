package Poli_retos.Loading;

import java.util.Scanner;

public class Loading_9 {
    
 public void G4_Loading_9 (Scanner scanner) throws InterruptedException {
    System.out.print("Loading 9");
    String nombreCompleto;
    while (true) {
        System.out.print("Ingrese su nombre completo:: ");
        nombreCompleto = scanner.nextLine();
        nombreCompleto = nombreCompleto.replace(" ", "");
        if (nombreCompleto.matches("[a-zA-Z]+")) {
            break; 
         } else {
            System.out.println("El nombre solo puede contener letras.");
         }
    }


     int longitud = nombreCompleto.length();
        for (int i = 0; i < longitud; i++) {
            System.out.print("\r");
            int porcentaje = (i * 100) / (longitud - 1);
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(nombreCompleto.charAt(i) + "\t " + porcentaje + "%");
            Thread.sleep(700); 
        }
        System.out.print("");
    }
}

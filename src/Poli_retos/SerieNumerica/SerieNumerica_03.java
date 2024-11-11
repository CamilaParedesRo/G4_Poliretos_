package Poli_retos.SerieNumerica;

import java.util.Scanner;

public class SerieNumerica_03 {
    public void G4_SerieNumerica_S3(Scanner scanner) {
        System.out.println("Serie numerica S3");

        System.out.print("Ingrese el límite de la serie S3: ");
        int limit = scanner.nextInt(); 
    
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador = 1;
    
        for (int i = 0; i < limit; i++) {
            System.out.print(numerador1 + "/" + denominador + " ");
    
            int temp = numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = temp;
    
            denominador += 2;
        }
        System.out.println(); 
    }
}

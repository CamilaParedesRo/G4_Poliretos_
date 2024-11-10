package Poli_retos.SerieNumerica;

import java.util.Scanner;

public class SerieNumerica_08 {
    public void G4_SerieNumerica_S8(Scanner scanner) {
        System.out.println("Serie numerica S8");
        System.out.print("Ingrese el límite de la serie S8: ");
        int limite = scanner.nextInt(); 
        int termino = 3;
        int aumentador = 5;
    
        for (int i = 0; i < limite; i++) {
            termino = termino + aumentador;
            System.out.print(termino + " ");
        }
        System.out.println(); 
    }
}

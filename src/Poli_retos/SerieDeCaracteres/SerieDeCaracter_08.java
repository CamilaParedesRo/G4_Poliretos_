package Poli_retos.SerieDeCaracteres;

import java.util.Scanner;

public class SerieDeCaracter_08 {
    public  void G4_SerieDeCaracter08(Scanner scanner) {
        System.out.println("Serie de Caracteres S8");
        System.out.print("Ingrese la longitud de la serie: ");
        int longitudSerie = scanner.nextInt();
        char letra = 'a'; 
         int repeticiones = 1; 
        int contador = 0; 
        while (contador < longitudSerie && letra <= 'z') { 
            for (int i = 0; i < repeticiones; i++) {
                System.out.print(letra); // 
            }
            System.out.print(" ");
            
            letra++; 
            repeticiones += 2; 
            contador++; 
        }
    }
}


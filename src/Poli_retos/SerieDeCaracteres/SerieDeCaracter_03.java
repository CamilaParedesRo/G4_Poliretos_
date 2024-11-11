package Poli_retos.SerieDeCaracteres;

import java.util.Scanner;

public class SerieDeCaracter_03 {
    public class SerieDeCarecteres_03 {
 public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;  
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true;  
    }

    public void G4_Secuencia_CaracterS3(Scanner scanner) {
        System.out.println("Secuencia de Caracteres S3");
        System.out.print("Ingrese el límite de la serie S3: ");
        int limit = scanner.nextInt(); 
        int contador = 0;
       

        for (int numero = 2; contador < limit; numero++) {
            if (esPrimo(numero)) {
                for (int i = 0; i < numero; i++) {
                    System.out.print("+");
                }
                System.out.print(" ");
                contador++;
            }
        }
        System.out.println();
    }
}
}
package Poli_retos.SerieDeCaracteres;

import java.util.Scanner;

public class SerieDeCaracter_03 {
    
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

    public void G4_Secuencia_CaracterS3(int extension) {
        System.out.println("Secuencia de Caracteres S3");

        int contador = 0;
       
        for (int numero = 2; contador < extension; numero++) {
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

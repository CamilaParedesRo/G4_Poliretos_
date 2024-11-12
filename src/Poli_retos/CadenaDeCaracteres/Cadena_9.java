package Poli_retos.CadenaDeCaracteres;

import java.util.Scanner;

public class Cadena_9 {
/**
     *muestra la cadena C09: Ingresa una frase y convertir una letra a mayusculas y otra a minisculas 
     */
    public void G4_CadenadeCaracteres_9 (Scanner scanner){
        System.out.println("Cadena de caracteres 09");
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();
        char [] fraseCaracteres;
        fraseCaracteres = frase.toCharArray();
        System.out.println();
        for (int i = 0; i < fraseCaracteres.length; i++) {
            if (i % 2 == 0)
                System.out.print(Character.toUpperCase(fraseCaracteres[i]));
            else 
                System.out.print(Character.toLowerCase(fraseCaracteres[i]));
        }   
    }
}
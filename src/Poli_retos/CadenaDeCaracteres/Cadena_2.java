package Poli_retos.CadenaDeCaracteres;

import java.util.Scanner;

public class Cadena_2 {
    /**
     * muestra el número de letras de una cadena C02) Pedir una frase y contador las letras. 
     */
    public void G4_CadenadeCaracteres_2(Scanner scanner) {
        System.out.println("Cadena de caracteres 02"); 
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)) {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " letras.");
    }

}

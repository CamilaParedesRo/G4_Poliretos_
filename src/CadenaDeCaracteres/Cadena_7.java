package Cadenas;

import java.util.Scanner;

public class Cadena_7 {
     /**
     * muestra la cadena C07: Pedir una frase y presentarla en mayusculas y sin la J.
     */
    public void G4_CadenadeCaracteres_7(Scanner scanner) {
        System.out.println("Cadena de caracteres 03");
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();
        char [] fraseCaracteres;
        fraseCaracteres = frase.toCharArray();
        System.out.println();
        for (char fraseInvertida : fraseCaracteres) {
            if (fraseInvertida != 'j')
                System.out.print(Character.toUpperCase(fraseInvertida));
            }
    }

}

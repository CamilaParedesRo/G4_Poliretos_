package Poli_retos.CadenaDeCaracteres;
import java.util.Scanner;
public class Cadena_01 {

    public void G4_CadenadeCaracteres_1(Scanner scanner) {
        System.out.println("Cadena de caracteres 01");
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();
        int contadorVocales = GR4_contarVocalesEnFrase(frase);
        System.out.println("La frase \"" + frase + "\" tiene " + contadorVocales + " vocales.");
    }

    private int GR4_contarVocalesEnFrase(String frase) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toLowerCase(frase.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }

        return contador;
    }
}

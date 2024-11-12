package Poli_retos.CadenaDeCaracteres;
import java.util.Scanner;
public class Cadena_06 {
    public void G4_CadenadeCaracteres_6(Scanner scanner) {
        System.out.println("Cadena de caracteres 06");
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();
        String fraseInvertida = GR4_invertirYConvertirAMayusculas(frase);
        System.out.println("Frase invertida y en mayúsculas: " + fraseInvertida);
    }

    private String GR4_invertirYConvertirAMayusculas(String frase) {
        StringBuilder builder = new StringBuilder(frase);
        builder.reverse();
        return builder.toString().toUpperCase();
    }
}

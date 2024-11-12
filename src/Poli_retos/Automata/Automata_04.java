package Poli_retos.Automata;

import java.util.Scanner;

public class Automata_04 {
    public void G4_Automata_4(Scanner scanner) {
        System.out.println("Automata 4");
        System.out.println();
        System.out.print("Introduce varias cadenas separadas por espacios para verificar si son decimales válidos: ");
        String input = scanner.nextLine();
        String[] pruebas = input.split(" "); // Divide las cadenas ingresadas en un array
        for (String prueba : pruebas) {
            System.out.println("La cadena \"" + prueba + "\" es un número decimal válido: " + GR4_esDecimal(prueba));
        }
    }

    public static boolean GR4_esDecimal(String cadena) {
        boolean tienePunto = false; // Marca si ya encontramos un punto decimal
        boolean tieneDigito = false; // Marca si ya encontramos al menos un dígito

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (Character.isDigit(c)) {
                tieneDigito = true; // Marcamos que hay al menos un dígito
            } else if (c == '.') {
                // Si ya hay un punto, es inválido
                if (tienePunto) {
                    return false;
                }
                tienePunto = true; // Marcamos que encontramos un punto
            } else {
                // Cualquier otro carácter hace que la cadena no sea válida
                return false;
            }
        }
        // La cadena es válida si tiene al menos un dígito
        return tieneDigito;
    }
}

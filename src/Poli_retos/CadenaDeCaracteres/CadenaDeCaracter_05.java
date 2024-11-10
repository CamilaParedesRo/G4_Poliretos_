package Poli_retos.CadenaDeCaracteres;

import java.util.Scanner;

public class CadenaDeCaracter_05 {
    public void G4_Cadena_5(Scanner scanner) {
        System.out.println("Cadena 5");

        String palabra;
        while (true) {
            System.out.print("Ingresa una palabra: ");
            palabra = scanner.nextLine();

           
            if (palabra.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("Por favor, ingresa solo letras, no se permiten números.");
            }
        }

        String resultado = invertirYConvertirVocales(palabra);
        System.out.println("Salida: " + resultado);
    }

    public String invertirYConvertirVocales(String palabra) {
        StringBuilder invertida = new StringBuilder(palabra).reverse();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < invertida.length(); i++) {
            char letra = invertida.charAt(i);
            if ("aeiouAEIOU".indexOf(letra) != -1) {
                resultado.append(Character.toUpperCase(letra));
            } else {
                resultado.append(Character.toLowerCase(letra));
            }
        }

        return resultado.toString();
    }
}


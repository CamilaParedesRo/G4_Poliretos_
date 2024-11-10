package Poli_retos.CadenaDeCaracteres;

import java.util.Scanner;

public class CadenaDeCaracter_04 {
    public void G4_CadenaDeCaracter04(Scanner scanner) {

        String frase;
        while (true) {
            if (scanner.hasNextLine()) {  
                scanner.nextLine();
            }
            System.out.print("Ingresa una frase: ");
            frase = scanner.nextLine();

           
            if (frase.matches("\\d+")) {
                System.out.println("Por favor, ingresa una frase, no un número.");
            } else {
                break; 
            }
        }
       String letra;
        while (true) {
            System.out.print("Ingresa la letra a eliminar: ");
            letra = scanner.nextLine();

            if (letra.length() != 1 || !letra.matches("[a-zA-Z]")) {
                System.out.println("Por favor, ingresa solo una letra, no una palabra.");
            } else {
                break; 
            }
        }

        String resultado = frase.replace(letra, "");
        System.out.println("Salida: " + resultado);
    }
}




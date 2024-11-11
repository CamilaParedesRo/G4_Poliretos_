package Poli_retos.CadenaDeCaracteres;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CadenaDeCaracteres_08 {
 public void G4_CadenadeCaracteres_8(Scanner scanner) {
         System.out.println("Cadena de caracteres 8"); 
        int maxIntentos = 3;
        Map<String, String> palabraConSuAnagrama = new HashMap<>();
        palabraConSuAnagrama.put("delira", "lidera");
        palabraConSuAnagrama.put("ballena", "llenaba");
        palabraConSuAnagrama.put("alondra", "ladrona");
        palabraConSuAnagrama.put("españa", "apanes");
        palabraConSuAnagrama.put("enrique", "quieren");

        System.out.println("Las palabras son: " + palabraConSuAnagrama.keySet());
        System.out.println("Ingresa una palabra y su anagrama correspondiente:");
        boolean acierto = false;

        for (int intentos = 1; intentos <= maxIntentos; intentos++) {
            String palabra;
            while (true) {
                System.out.print("Ingrese la palabra: ");
                palabra = scanner.nextLine().toLowerCase();
                palabra = palabra.replace(" ", "");
                if (palabra.matches("[a-zA-Z]+") && palabraConSuAnagrama.containsKey(palabra)) {
                    break; 
                } else if (!palabra.matches("[a-zA-Z]+")) {
                    System.out.println("El nombre solo puede contener letras.");
                } else {
                    System.out.println("La palabra no está en el listado de palabras válidas.");
                }
            }
            
            String anagramaIntento;
            while (true) {
                System.out.print("Ingrese el anagrama: ");
                anagramaIntento = scanner.nextLine().toLowerCase();
                anagramaIntento = anagramaIntento.replace(" ", "");
                if (anagramaIntento.matches("[a-zA-Z]+")) {
                    break; 
                } else {
                    System.out.println("El nombre solo puede contener letras.");
                }
            }
            
            if (palabraConSuAnagrama.containsKey(palabra) && 
                anagramaIntento.equalsIgnoreCase(palabraConSuAnagrama.get(palabra))) {
                acierto = true;
                System.out.println("¡Correcto! El anagrama de " + palabra + " es " + anagramaIntento);
                break;
            } else {
                System.out.println("Incorrecto.");
            }
        }

        if (!acierto) {
            System.out.println("Lo siento, has fallado tres veces. Aquí están los anagramas correctos:");
            for (Map.Entry<String, String> entrada : palabraConSuAnagrama.entrySet()) {
                System.out.println("Palabra: " + entrada.getKey() + " -> Anagrama: " + entrada.getValue());
            }
        }
       System.out.println(" "); 

    }
}

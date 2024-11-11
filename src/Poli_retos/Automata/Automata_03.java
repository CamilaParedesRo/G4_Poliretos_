package Poli_retos.Automata;

import java.util.Scanner;

public class Automata_03 {
    public void G4_Automata03(Scanner scanner) {
        System.out.println("Automata 3");
        String entrada = "";

        // Bucle para pedir la cadena hasta que sea válida
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println("Ingresa la cadena a validar (debe seguir el patrón a+/b+/c+):");
            entrada = scanner.nextLine();

            if (esCadenaValida(entrada)) {
                entradaValida = true; // Si la cadena es válida, salir del bucle
            } else {
                System.out.println("Cadena inválida. Solo puedes ingresar 'a', 'b' o 'c'. Inténtalo de nuevo.");
            }
        }

        ValidadorAutomata automata = new ValidadorAutomata();
        if (automata.esValidaABC(entrada)) {
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena es inválida.");
        }
    }

   
    public boolean esCadenaValida(String entrada) {
        for (char ch : entrada.toCharArray()) {
            if (ch != 'a' && ch != 'b' && ch != 'c') {
                return false; 
            }
        }
        return true; 
    }

    class ValidadorAutomata {
        int Q0 = 0;
        int Q1 = 1;
        int Q2 = 2;
        int Q3 = 3;
        int ERROR = -1;

        int[][] matrizTransicionABC = {
           // a     b     c
           { 1,   -1,   -1 },  // q0
           { 1,    2,   -1 },  // q1
           { -1,   2,    3 },  // q2
           { -1,  -1,    3 }   // q3
        };

        public boolean esValidaABC(String entrada) {
            int estadoActual = Q0;

            for (char ch : entrada.toCharArray()) {
                int columna = obtenerColumnaABC(ch);
                if (columna == ERROR) {
                    return false;
                }
                estadoActual = matrizTransicionABC[estadoActual][columna];
                if (estadoActual == ERROR) {
                    return false;
                }
            }

            return estadoActual == Q3;
        }

        public int obtenerColumnaABC(char ch) {
            switch (ch) {
                case 'a': return 0;
                case 'b': return 1;
                case 'c': return 2;
                default: return ERROR;
            }
        }
    }
}

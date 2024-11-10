package Poli_retos.Automata;

import java.util.Scanner;

public class Automata_02 {
    public void G4_Automata02(Scanner scanner) {
        System.out.println("Automata para el patrón ab+ca");
        System.out.println("Ingresa la cadena a validar (debe seguir el patrón ab+ca):");
        String entrada = scanner.nextLine();

        ValidadorAutomataABCA automata = new ValidadorAutomataABCA();
        if (automata.esValidaABCA(entrada)) { 
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena es inválida.");
        }
    }

    public class ValidadorAutomataABCA {
        
        int[][] matrizTransicionABCA = {
            // a     b     c
            {  1,   -1,   -1 },  // Estado 0 (q0)
            { -1,    2,    3 },  // Estado 1 (q1)
            { -1,   -1,   -1 },  // Estado 2 (q2, 
            { -1,   -1,   -1 }   // Estado 3 (q3, 
        };

        public boolean esValidaABCA(String entrada) {
            int estadoActual = 0; 
            for (char ch : entrada.toCharArray()) {
                int columna = obtenerColumnaABCA(ch);
                if (columna == -1) {
                    return false; 
                }
                estadoActual = matrizTransicionABCA[estadoActual][columna];
                if (estadoActual == -1) {
                    return false;
                }
            }

            
            return (estadoActual == 2 || estadoActual == 3);
        }

        public int obtenerColumnaABCA(char ch) {
            switch (ch) {
                case 'a': return 0;
                case 'b': return 1;
                case 'c': return 2;
                default: return -1; 
            }
        }
    }
}

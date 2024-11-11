package Poli_retos.Automata;

import java.util.Scanner;

public class Automata_02 {
    public void G4_Automata02(Scanner scanner) {
        System.out.println("Automata para el patrón ab+ca");
        String entrada = "";
        
       
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println("Ingresa la cadena a validar (debe seguir el patrón ab+ca):");
            entrada = scanner.nextLine();
            
            if (esCadenaValida(entrada)) {
                entradaValida = true; 
            } else {
                System.out.println("Cadena inválida. Solo puedes ingresar 'a', 'b' o 'c'. Inténtalo de nuevo.");
            }
        }

        ValidadorAutomataABCA automata = new ValidadorAutomataABCA();
        if (automata.esValidaABCA(entrada)) { 
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena es inválida.");
        }
    }

    
    public boolean esCadenaValida(String entrada) {
        for (char ch : entrada.toCharArray()) {
            if (ch != 'a' && ch != 'b' && ch != 'c') {
                return false; // 
            }
        }
        return true;
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


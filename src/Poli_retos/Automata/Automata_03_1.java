package Poli_retos.Automata;

import java.util.Scanner;

public class Automata_03_1 {
public void G4_Automata3(Scanner scanner) {

        System.out.println("Automata 3.1");
        System.out.println("Ingresa la cadena a validar (debe seguir el patrón 1/0+/1*):");
        String entrada = scanner.nextLine();

        ValidadorAutomata101 automata = new ValidadorAutomata101();
        if (automata.esValida101(entrada)) { 
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena es inválida.");
        }
    }

    public class ValidadorAutomata101 {

        int Q0_ = 0;
        int Q1_ = 1;
        int Q2_ = 2;
        int Q3_ = 3;
        int ERROR_ = -1;

        int[][] matrizTransicion101 = {
            // 1     0
            {  1,   -1 },  // q0: 
            { -1,    2 },  // q1: 
            {  3,    2 },  // q2: 
            {  3,   -1 }   // q3: 
        };

        public boolean esValida101(String entrada) {
            int estadoActual = Q0_;

            for (char ch : entrada.toCharArray()) {
                int columna = obtenerColumna101(ch);
                if (columna == ERROR_) {
                    return false;
                }
                estadoActual = matrizTransicion101[estadoActual][columna];
                if (estadoActual == ERROR_) {
                    return false;
                }
            }

            return (estadoActual == Q2_ || estadoActual == Q3_);
        }

        public int obtenerColumna101(char ch) {
            switch (ch) {
                case '1': return 0;
                case '0': return 1;
                default: return ERROR_;
            }
        }
    }
}

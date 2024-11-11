package Poli_retos.Figura;

import java.util.Scanner;

public class Figura_09 {

    public void G4_Figura_09(Scanner scanner) {
        System.out.println("Figura 9: ");
        System.out.print("Ingrese el número de niveles: ");
        int nivel = scanner.nextInt();
        int numeroColumna = (2 * nivel) - 1;

        for (int fila = 0; fila < nivel; fila++) {
            for (int columna = 1; columna <= numeroColumna; columna++) {
                if (fila == 0 && columna == nivel) {
                    System.out.print("_");
                }
                else if (fila > 0 && columna == (nivel - fila)) {
                    System.out.print("__|");
                }
                else if (fila > 0 && columna == (nivel + fila) - 1) {
                    System.out.print("|__");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}



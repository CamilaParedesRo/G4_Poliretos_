package Poli_retos.Figura;

import java.util.Scanner;

public class Figura {
    // Figura Numero 5
    public void dibujarF5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas para la Figura F5 (Pirámide Invertida): ");
        int numeroFilas = scanner.nextInt();
        generarF5(numeroFilas);
        scanner.close(); // Cerramos el scanner
    }

    private void generarF5(int numeroFilas) {
        System.out.println("Figura F5: Pirámide Invertida");

        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * (numeroFilas - i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Figura Numero 10
    public void dibujarF10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas para la Figura F10: ");
        int numeroFilas = scanner.nextInt();
        generarF10(numeroFilas);
        scanner.close(); // Cerramos el scanner
    }

    private void generarF10(int numeroFilas) {
        System.out.println("Figura F10:");

        for (int i = 1; i <= numeroFilas; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("   ");
            }
            System.out.print("+");
            for (int k = 1; k < i; k++) {
                System.out.print(" _");
            }
            System.out.println();
        }
    }

    // Figura 15
    public void dibujarF15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas para el Triángulo de Pascal (Figura F15): ");
        int numeroFilas = scanner.nextInt();
        generarF15(numeroFilas);
        scanner.close(); // Cerramos el scanner
    }

    private void generarF15(int numeroFilas) {
        System.out.println("Triángulo de Pascal:");

        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroFilas - i; j++) {
                System.out.print("  ");
            }

            int numero = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(numero + "   ");
                numero = numero * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

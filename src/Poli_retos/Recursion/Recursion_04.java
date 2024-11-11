package Poli_retos.Recursion;

import java.util.Scanner;

public class Recursion_04 {
    public int G4_Recursion_4(Scanner scanner) {
        System.out.println("Recursion 4");

        int a = solicitarEntero(scanner, "Ingrese la base: ");
        int b = solicitarEntero(scanner, "Ingrese el exponente: ");

        int resultado = calcularPotencia(a, b);
        System.out.println("Resultado: " + resultado);

        return resultado;
    }

    public int solicitarEntero(Scanner scanner, String mensaje) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                scanner.nextLine(); 
                break; 
            } else {
                System.out.println("Entrada inválida. Por favor ingrese un número entero.");
                scanner.nextLine(); 
            }
        }
        return numero;
    }

    public int calcularPotencia(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * calcularPotencia(a, b - 1);
    }
}


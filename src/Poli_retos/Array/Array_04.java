package Poli_retos.Array;

import java.util.Scanner;

public class Array_04 {
   public void G4_Array_4() {

      System.out.println("Array 4");
      Scanner scanner = new Scanner(System.in);
        String nombre = "";
        while (true) {
            System.out.print("Ingrese su nombre (solo letras): ");
            nombre = scanner.nextLine();

            if (nombre.matches("[a-zA-Z]+")) {
                break; 
            } else {
                System.out.println("El nombre solo puede contener letras.");
            }
        }

        String apellido = "";
        while (true) {
            System.out.print("Ingrese su apellido (solo letras): ");
            apellido = scanner.nextLine();

            if (apellido.matches("[a-zA-Z]+")) {
                break; 
            } else {
                System.out.println("El apellido solo puede contener letras.");
            }
        }
        int longitudNombre = nombre.length();
        int longitudApellido = apellido.length();
        int longitudMatriz = Math.max(longitudNombre, longitudApellido);
        char[][] matriz = new char[longitudMatriz][longitudMatriz];

        for (int filas = 0; filas < longitudMatriz; filas++) {
            for (int columnas = 0; columnas < longitudMatriz; columnas++) {
                if (filas < longitudNombre && filas == columnas) {
                    // Colocar caracteres del nombre en la diagonal principal
                    matriz[filas][columnas] = nombre.charAt(filas);
                } else if (filas < longitudApellido && filas + columnas == longitudMatriz - 1) {
                    // Colocar caracteres del apellido en la diagonal secundaria
                    matriz[filas][columnas] = apellido.charAt(filas);
                } else {
                    matriz[filas][columnas] = ' ';
                }
            }
        }

        // Imprimir la matriz
        for (int filas = 0; filas < longitudMatriz; filas++) {
            for (int columnas = 0; columnas < longitudMatriz; columnas++) {
                System.out.print(matriz[filas][columnas] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

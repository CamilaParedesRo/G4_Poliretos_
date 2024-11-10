package Poli_retos.Array;

import java.util.Scanner;

public class Arreglo_01 {
    public void G4_Areglo_01(Scanner scanner) {
        System.out.println("Arreglo 1");

        String nombreCompleto = "Anahi Valentina Pillajo Teran";
        String[] palabras = nombreCompleto.split(" ");
        int[] porcentajes = new int[palabras.length];

        System.out.println("Ingrese el porcentaje de carga para cada palabra (0-100):");

        for (int i = 0; i < palabras.length; i++) {
            int porcentaje = -1; 
            while (porcentaje < 0 || porcentaje > 100) {  
                System.out.printf("Porcentaje para '%s': ", palabras[i]);
                if (scanner.hasNextInt()) {
                    porcentaje = scanner.nextInt();
                    if (porcentaje < 0 || porcentaje > 100) {
                        System.out.println("Por favor ingrese un número entre 0 y 100.");
                    } else {
                        porcentajes[i] = porcentaje;
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor ingrese un número entero.");
                    scanner.next();  
                }
            }
        }

        for (int i = 0; i < palabras.length; i++) {
            mostrarProgreso(palabras[i], porcentajes[i]);
        }
    }

    public void mostrarProgreso(String palabra, int porcentaje) {
        int barras = porcentaje / 10;
        StringBuilder barra = new StringBuilder("[");

        for (int i = 0; i < 10; i++) {
            if (i < barras) {
                barra.append("=");
            } else {
                barra.append(" ");
            }
        }

        barra.append("] ");
        System.out.printf("%s %d%% %s%n", barra.toString(), porcentaje, palabra);
    }
}

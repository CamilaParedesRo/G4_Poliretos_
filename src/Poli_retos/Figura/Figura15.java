// Figura15.java
package Poli_retos.Figura;

public class Figura15 {
    public void dibujar(int numeroFilas) {
        generar(numeroFilas);
    }

    private void generar(int numeroFilas) {
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

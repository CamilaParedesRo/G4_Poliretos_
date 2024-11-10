// Figura5.java
package Poli_retos.Figura;

public class Figura5 {
    public void dibujar(int numeroFilas) {
        generar(numeroFilas);
    }

    private void generar(int numeroFilas) {
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
}

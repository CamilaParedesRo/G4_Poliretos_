// Figura5.java
package Poli_retos.Figura;

public class Figura_05 {
    public void GR4_dibujar(int numeroFilas) {
        GR4_generar(numeroFilas);
    }

    private void GR4_generar(int numeroFilas) {
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

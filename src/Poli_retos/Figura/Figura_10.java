// Figura10.java
package Poli_retos.Figura;

public class Figura_10 {
    public void GR4_dibujar(int numeroFilas) {
        GR4_generar(numeroFilas);
    }

    private void GR4_generar(int numeroFilas) {
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
}

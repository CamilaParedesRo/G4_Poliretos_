// Figura15.java
package Poli_retos.Figura;

public class Figura_15 {
    public void G4_Figura_15(int extension) {
        GR4_generar(extension);
    }

    private void GR4_generar(int extension) {
        System.out.println("Figura 15:");

        for (int i = 0; i < extension; i++) {
            for (int j = 0; j < extension - i; j++) {
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

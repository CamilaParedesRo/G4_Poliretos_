// Figura5.java
package Poli_retos.Figura;

public class Figura_05 {
    public void G4_Figura_5(int extension) {
        GR4_generar(extension);
    }

    private void GR4_generar(int extension) {
        System.out.println("Figura F5: Pirámide Invertida");

        for (int i = 0; i < extension; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * (extension - i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

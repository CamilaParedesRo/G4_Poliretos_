// Figura10.java
package Poli_retos.Figura;

public class Figura_10 {
    public void G4_Figura_10(int extension) {
        GR4_generar(extension);
    }

    private void GR4_generar(int extension) {
        System.out.println("Figura F10:");

        for (int i = 1; i <= extension; i++) {
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

package Poli_retos.Figura;

public class Figura_14 {
public void G4_Figura_14(int extension) {
        System.out.println("Figura 14");

        for (int i = 0; i < extension; i++) {
           
            for (int j = 0; j < extension - i; j++) {
                System.out.print(" ");
            }

            int valor = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(valor + " ");
                valor = valor * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

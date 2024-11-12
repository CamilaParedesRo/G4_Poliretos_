package Poli_retos.Loading;

import java.util.Random;

public class Loading_11 {
public  void G4_Loading_11(int cantidad, Random random) {
        for (int i = 0; i < cantidad; i++) {
            G4_Loading_11(random);
        }
    }

    public void G4_Loading_11(Random random) {
        System.out.println("Loading 11");
        int nivel = random.nextInt(51);
        StringBuilder senal = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            senal.append("-");
        }
        senal.append("|");
        for (int i = 0; i < nivel; i++) {
            senal.append("-");
        }

        String colorAzul = "\u001B[34m";
        String resetColor = "\u001B[0m";
        System.out.println(colorAzul + senal + resetColor + "    Nivel: " + nivel);
    }
}

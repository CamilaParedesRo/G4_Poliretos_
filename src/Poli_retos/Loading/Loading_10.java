package Poli_retos.Loading;

import java.util.Random;

public class Loading_10 {
/**
     * muestra la serie L10) Generar un numero random entre 10 y 100 para simular una carga
     * de un archivo en kB.
     *       Ponerle color a la barra y detener la carga al copletar el valor
     *      Downloadung ArchivoYarl-win_amd64.whl (76 kB)
     *      ________________________      66.4 / 76.4 kB
     */
    public void G4_Loading_10() {
        int numero = new Random().nextInt(91)+ 10;
        String archivo ="ArchivoYarl-win_amd64.whl";
        double total = numero;
        double progreso = 0;
        String ANSI_RESET = "\u001B[0m";
        String ANSI_GREEN = "\u001B[32m";

                System.out.println("Downloading " + archivo + " (" + numero + " kB)");
        while (progreso < total) {
            progreso += new Random().nextInt(5) + 1;
            int progresoPorcentaje = (int) ((progreso / total) * 100);
            String barraProgreso = "";
            for (int i = 0; i < 50; i++) {
                if (i < progresoPorcentaje / 2) {
                    barraProgreso += "-";
                } else {
                    barraProgreso += " "; 
                }
            }
            System.out.print("\r" + ANSI_GREEN + barraProgreso + ANSI_RESET + " " + String.format("%.1f", progreso) + " / " + numero + " kB");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nDownload complete!");
    }

}

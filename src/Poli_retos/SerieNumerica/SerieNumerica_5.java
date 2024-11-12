package Poli_retos.SerieNumerica;


public class SerieNumerica_5 {
    //*** muestra la serie  S5: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31... 
    public void G4_SeriesNumericas_S5(int extension) {
        System.out.println("Serie numerica 05");

        int count = 0;
        for (int i = 2; count < extension; i++) { 
            boolean esPrimo = true; 
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false; 
                }
            }
            if (esPrimo) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

}

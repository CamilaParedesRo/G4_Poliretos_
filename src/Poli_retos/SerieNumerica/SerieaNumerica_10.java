package Poli_retos.SerieNumerica;

public class SerieaNumerica_10 {
     //*** muestra la serie  S10: 3, 9, 27, 81, 243, 729, 2187, ...
    public void G4_SeriesNumericas_S10(int extension){
        System.out.println("Serie numerica 10");

        int numero = 3;
        for (int i = 1; i <= extension; i++) {
            System.out.print(numero + " ");
            numero *= 3; 
        }
    }

}

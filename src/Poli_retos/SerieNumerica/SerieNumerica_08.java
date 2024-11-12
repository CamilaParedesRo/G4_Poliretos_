package Poli_retos.SerieNumerica;

public class SerieNumerica_08 {
    public void G4_SerieNumerica_S8(int extension) {
        System.out.println("Serie numerica S8");

        int termino = 3;
        int aumentador = 5;
    
        for (int i = 0; i < extension; i++) {
            termino = termino + aumentador;
            System.out.print(termino + " ");
        }
        System.out.println(); 
    }
}

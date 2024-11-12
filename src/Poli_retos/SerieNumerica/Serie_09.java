package Poli_retos.SerieNumerica;

public class Serie_09 {
    public void G4_SerieNumerica_S9(int numeroTerminos) {
        System.out.println("Serie numerica S9:");
        int valor = 2;
        
        for (int i = 0; i < numeroTerminos; i++) {
            System.out.print(valor + " ");
            valor *= 2;
        }
        System.out.println();
    }
}

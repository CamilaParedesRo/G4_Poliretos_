package Poli_retos.SerieNumerica;

public class Serie_07 {
    // Serie Numérica S7: 1 4 7 10 13 16 19 22 25 ...
    public void G4_SerieNumerica_S7(int numeroTerminos) {
        System.out.println("Serie numerica S7:");
        int valor = 1;
        for (int i = 0; i < numeroTerminos; i++) {
            System.out.print(valor + " ");
            valor += 3; // Incremento de 3 en cada término
        }
        System.out.println();
    }
}

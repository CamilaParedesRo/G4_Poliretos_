package Poli_retos.SerieNumerica;

public class Serie_02 {
    // Serie Numérica S2: 1 0 3 0 5 0 7 0 9 ...
    public void GR4_generarSerieDos(int numeroTerminos) {
        System.out.println("Serie numerica S2:");
        for (int i = 1; i <= numeroTerminos * 2; i++) {
            if (i % 2 == 0) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

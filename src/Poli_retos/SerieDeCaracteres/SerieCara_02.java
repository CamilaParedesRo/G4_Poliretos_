package Poli_retos.SerieDeCaracteres;

public class SerieCara_02 {
    // Secuencia de caracteres S2: + + ++ +++ +++++ ++++++++ +++++++++++++ ...
    public void GR4_generarSecuenciaDos(int numeroTerminos) {
        System.out.println("Secuencia de caracteres S2:");
        int incremento = 1;
        for (int i = 0; i < numeroTerminos; i++) {
            for (int j = 0; j < incremento; j++) {
                System.out.print("+");
            }
            System.out.print(" ");
            incremento += incremento; // Duplicar el incremento en cada paso
        }
        System.out.println();
    }
}

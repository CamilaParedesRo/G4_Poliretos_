package Poli_retos.SerieDeCaracteres;

public class SerieCara_07 {
    // Secuencia de caracteres S7: aa bbbb cccccc dddddddd ...
    public void GR4_generarSecuenciaSiete(int numeroTerminos) {
        System.out.println("Secuencia de caracteres S7:");
        char letra = 'a';
        int repeticion = 2;
        for (int i = 0; i < numeroTerminos; i++) {
            for (int j = 0; j < repeticion; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++; // Avanzar al siguiente carácter
            repeticion += 2; // Incrementar el número de repeticiones en 2
        }
        System.out.println();
    }
}

package Poli_retos.SerieDeCaracteres;

public class SerieCara_09 {
    public void GR4_generar(int extension) {
        System.out.println("Serie de caracteres S9:");
        int repeticiones = 1;
        int siguienteRepeticiones = 1;
        
        char letra = 'a';
        
        for (int i = 0; i < extension; i++) {
            for (int j = 0; j < repeticiones; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++;
            int nuevoRepeticiones = repeticiones + siguienteRepeticiones;
            repeticiones = siguienteRepeticiones;
            siguienteRepeticiones = nuevoRepeticiones;
        }
        System.out.println();
    }
}

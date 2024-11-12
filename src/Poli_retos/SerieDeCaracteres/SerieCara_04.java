package Poli_retos.SerieDeCaracteres;

public class SerieCara_04 {
    public void GR4_generar(int extension) {
        System.out.println("Serie de caracteres S4:");
        char[] simbolos = {'+', '-', '*', '/'};
        
        for (int i = 0; i < extension; i++) {
            System.out.print(simbolos[i % 4] + " ");
        }
        System.out.println();
    }
}

package Poli_retos.CadenaDeCaracteres;

public class Cadena_01 {
    public void GR4_contarVocales(String frase) {
        int contadorVocales = GR4_contarVocalesEnFrase(frase);
        System.out.println("La frase \"" + frase + "\" tiene " + contadorVocales + " vocales.");
    }

    private int GR4_contarVocalesEnFrase(String frase) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toLowerCase(frase.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }

        return contador;
    }
}

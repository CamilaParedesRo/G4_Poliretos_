package Poli_retos.CadenaDeCaracteres;

public class CadenaDeCaracteres {
    //Algoritmo de conteo de vocales
    public void contarVocales(String frase) {
        int contadorVocales = contarVocalesEnFrase(frase);
        System.out.println("La frase \"" + frase + "\" tiene " + contadorVocales + " vocales.");
    }

    private int contarVocalesEnFrase(String frase) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toLowerCase(frase.charAt(i));

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }

        return contador;
    }
    //Algoritmo de inversion de palabras
    public void invertirMayusculas(String frase) {
        String fraseInvertida = invertirYConvertirAMayusculas(frase);
        System.out.println("Frase invertida y en mayúsculas: " + fraseInvertida);
    }

    private String invertirYConvertirAMayusculas(String frase) {
        StringBuilder builder = new StringBuilder(frase);
        builder.reverse();
        return builder.toString().toUpperCase();
    }
}

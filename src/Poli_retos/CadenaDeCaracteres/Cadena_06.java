package Poli_retos.CadenaDeCaracteres;

public class Cadena_06 {
    public void GR4_invertirMayusculas(String frase) {
        String fraseInvertida = GR4_invertirYConvertirAMayusculas(frase);
        System.out.println("Frase invertida y en mayúsculas: " + fraseInvertida);
    }

    private String GR4_invertirYConvertirAMayusculas(String frase) {
        StringBuilder builder = new StringBuilder(frase);
        builder.reverse();
        return builder.toString().toUpperCase();
    }
}

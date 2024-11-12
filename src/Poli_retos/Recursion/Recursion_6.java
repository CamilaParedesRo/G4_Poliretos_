package Poli_retos.Recursion;

public class Recursion_6 {
 /**
     * muestra una recursividad para R06) crear un metodo recursivo para obtener la conteoRegresivo(n)  hasta 0
     */ 
    public void G4_Recursion_6(int numero_re) {
        System.out.println("Recursion 06");
        if (numero_re >= 0) {
            System.out.println("Conteo: " + numero_re);
            G4_Recursion_6(numero_re - 1);
        }  
    }
}

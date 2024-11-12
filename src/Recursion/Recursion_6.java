package Recursion;

public class Recursion_6 {
 /**
     * muestra una recursividad para R06) crear un metodo recursivo para obtener la conteoRegresivo(n)  hasta 0
     */ 
    public void G4_Recursion_6(int numero) {
        System.out.println("Recursion 06");
        if (numero >= 0) {
            System.out.println("Conteo: " + numero);
            G4_Recursion_6(numero - 1);
        }  
    }
}

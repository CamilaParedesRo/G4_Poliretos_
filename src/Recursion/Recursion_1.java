package Recursion;

public class Recursion_1 {
     /**
     * muestra una recursividad para R01) crear un metodo recursivo para obtener factorial(n)  
     * @return: Integer
     */
    public int G4_Recursion_1(int factorial) {
        System.out.println("Recursion 01");
    if (factorial == 0) {
        return 1;
    } else {
        // Llamada recursiva: n! = n * (n-1)!
        return factorial * G4_Recursion_1(factorial - 1);
    }    
}

}

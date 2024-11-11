package Poli_retos.SerieNumerica;

public class Serie_04 {
    public void GR4_generar(int numeroTerminos) {
        System.out.println("Serie numerica S4:");
        int fibonacciUno = 0;
        int fibonacciDos = 1;
        int denominador = 2;
        
        for (int i = 0; i < numeroTerminos; i++) {
            System.out.print(fibonacciUno + "/" + denominador + " ");
            int siguienteFibonacci = fibonacciUno + fibonacciDos;
            fibonacciUno = fibonacciDos;
            fibonacciDos = siguienteFibonacci;
            denominador += 2;
        }
        System.out.println();
    }
}

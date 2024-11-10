package Poli_retos.Recursion;

public class Recursividad5 {
    public void contarProgresivo(int n) {
        conteoProgresivoHasta(n);
    }

    private void conteoProgresivoHasta(int n) {
        if (n == 1) {
            System.out.println(1);
        } else {
            conteoProgresivoHasta(n - 1);
            System.out.println(n);
        }
    }
}

package Poli_retos.Recursion;

public class Recursividad_05 {
    public void G4_Recursividad_5(int n) {
        System.out.println("Recursion 05");
        GR4_conteoProgresivoHasta(n);
    }

    private void GR4_conteoProgresivoHasta(int n) {
        if (n == 1) {
            System.out.println(1);
        } else {
            GR4_conteoProgresivoHasta(n - 1);
            System.out.println(n);
        }
    }
}

package Poli_retos.Loading;

public class Loading_06 {
    public void G4_Loading_6() {
        System.out.println("Loading 6");
        int longitudBarra = 20;
        int progreso = 0;

        while (progreso <= 100) {
            System.out.print("\r[");
            int posicion = (progreso * longitudBarra) / 100;

            for (int i = 0; i < longitudBarra; i++) {
                if (i == posicion) {
                    System.out.print("<=>");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("] " + progreso + "%");
            progreso += 5;

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("La carga fue interrumpida.");
                break;
            }
        }
        System.out.println("\nProgreso completado.");
    }
}

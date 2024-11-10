package Poli_retos.Loading;

public class Loading_01 {
    public void G4_Loading_01() {
        System.out.println("Loading 1");
        String[] rotacion = {"|", "/", "-", "\\"};
        int carga = 0;

        while (carga <= 100) {
            System.out.print("\r" + rotacion[carga % 4] + " " + carga + "%");
            carga += 5;

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("\nLa operación fue interrumpida.");
                Thread.currentThread().interrupt();
                break;
            }
        }

        System.out.println("\nCarga completa: 100%");
    }

}

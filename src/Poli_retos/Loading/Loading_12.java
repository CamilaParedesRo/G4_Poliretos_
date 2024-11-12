package Poli_retos.Loading;

public class Loading_12 {
    public void G4_Loading_12() {
        System.out.print("Loading 12");
        String[] figura = {
            "    \\|||//     ",
            "     (> <)      ",
            "  ooO-(_)-Ooo   "
        };
        int espaciosMaximos = 20;
        int pausa = 200;

        for (int i = 0; i <= espaciosMaximos; i++) {
            GR4_mostrarFigura(figura, i);
            try {
                Thread.sleep(pausa);
            } catch (InterruptedException e) {
                System.out.println("Proceso interrumpido.");
                return;
            }
        }

        for (int i = espaciosMaximos; i >= 0; i--) {
            GR4_mostrarFigura(figura, i);
            try {
                Thread.sleep(pausa);
            } catch (InterruptedException e) {
                System.out.println("Proceso interrumpido.");
                return;
            }
        }
    }

    private void GR4_mostrarFigura(String[] figura, int espacios) {
        System.out.println("\033[H\033[2J");
        for (String linea : figura) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            System.out.println(linea);
        }
    }
}

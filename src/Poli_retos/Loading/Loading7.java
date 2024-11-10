package Poli_retos.Loading;

public class Loading7 {
    public void mostrar() {
        char[] rotacion = {'\\', '|', '/', '-'};
        
        for (int progreso = 0; progreso <= 20; progreso++) {
            int porcentaje = progreso * 5;
            String barra = "[";
            for (int i = 0; i < 20; i++) {
                if (i < progreso) {
                    barra += "=";
                } else if (i == progreso) {
                    barra += rotacion[progreso % rotacion.length];
                } else {
                    barra += " ";
                }
            }
            barra += "] " + porcentaje + "%";
            System.out.print("\r" + barra);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Proceso interrumpido.");
                return;
            }
        }
        System.out.println("\nProceso completado.");
    }
}

package Poli_retos.Loading;

public class Loading_05 {
    public void G4_Loading05()  {
        System.out.print("Loading 5");
        int longitudBarra = 20;
        char[] punta = {'>', '-'};
        int progreso = 0;
        int indicePunta = 0;

        while (progreso <= 100) {
            int cantidadIguales = (progreso * longitudBarra) / 100;
            StringBuilder barra = new StringBuilder("[");
            for (int i = 0; i < cantidadIguales; i++) {
                barra.append("=");
            }
            barra.append(punta[indicePunta]);
            for (int i = cantidadIguales + 1; i < longitudBarra; i++) {
                barra.append(" ");
            }
            barra.append("] ").append(progreso).append("%");
            System.out.print("\r" + barra);
            progreso += 5;
            indicePunta = 1 - indicePunta;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}

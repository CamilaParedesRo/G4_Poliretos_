package Loading;

import java.util.Scanner;

public class Loading_8 {
    /**
     *muestra la serie L08) pedir el nombre y apellidos y realizar la carga mostrando letra a letra hasta el 100%
     *[Patricio         ] 50%
     */
    public void G4_Loading_8( Scanner scanner) {
        System.out.print("Loading 08");
        System.out.println("Ingrese su nombre completo");
        String nombreCompleto = scanner.nextLine();
        int longitudBarra = 20;
        int porcentaje = 0;
        int longitudNombre = nombreCompleto.length();

        for (int i = 0; i < longitudNombre; i++) {
            porcentaje = (i + 1) * 100 / longitudNombre;

            System.out.print("\r[");
            System.out.print(nombreCompleto.substring(0, i + 1));
            for (int j = i + 1; j < longitudBarra; j++) {
                System.out.print(" ");
            }
            System.out.print("] " + porcentaje + "%");

            try {
                Thread.sleep(300); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\r[" + nombreCompleto + "] 100%");
    }

}

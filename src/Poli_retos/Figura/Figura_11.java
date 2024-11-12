package Poli_retos.Figura;

import java.util.Scanner;

public class Figura_11 {
    /**
     * muestra la figura F11:	
            | _ 
               | _ _
                    | _ _ _
                           | _ _ _ _            
                                    | _ _ _ _ _
     */  
    public void G4_Figuras_11(Scanner scanner) {
        System.out.println("Figura 11"); 
        System.out.println("Ingrese el numero de niveles de la escalera: ");
        int numeroNiveles = scanner.nextInt();
        StringBuilder caracteres = new StringBuilder("|");
        StringBuilder espacios = new StringBuilder(""); 
        StringBuilder addespacios = new StringBuilder("   ");
        for (int filas = 0; filas < numeroNiveles; filas++){
            System.out.println(caracteres.append(" _"));
            System.out.print(espacios.append(addespacios));
            addespacios.append("  ");
        }
    }

}

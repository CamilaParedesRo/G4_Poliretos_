package Poli_retos.Figura;

import java.util.Scanner;

public class Figura_16 {
     /**
     * muestra la figura F16:
            +				+
                -		-
                    +                       
                -		-
            +				+
            ....
     */
    public void G4_Figuras_16(Scanner scanner) {
        System.out.println("Figura 16");  
        System.out.println("Ingrese el numero de niveles : ");
        int numeroNiveles = scanner.nextInt();
        for (int i = 0; i < numeroNiveles; i++) {
            for (int j = 0; j < numeroNiveles; j++) {
                if (i==j || i==numeroNiveles-1-j) {
                    if (i%2==0 && j%2==0) {
                        System.out.print("- ");
                    }
                    else
                        System.out.print("+ ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }    
    }

}

package Figuras;

import java.util.Scanner;

public class Figura_6 {
    /**
     * muestra la figura F6:	
		     *
		    ***
		   *****                    
		  *******
		 ********* 
     */
    public void G4_Figuras_6(Scanner scanner) {
        System.out.println("Figura 06");  
        System.out.println("Ingrese el numero de niveles de la piramide: ");
        int numeroNiveles = scanner.nextInt();
        for (int filas = numeroNiveles; filas > 0; filas--) {
            for (int espacio = 0; espacio < filas; espacio++) {
                System.out.print(" ");
            }
            for (int nroCaracteres = numeroNiveles; nroCaracteres >= filas; nroCaracteres--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

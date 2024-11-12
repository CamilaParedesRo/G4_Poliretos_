package SerieNumerica;

import java.util.Scanner;

public class SerieaNumerica_10 {
     //*** muestra la serie  S10: 3, 9, 27, 81, 243, 729, 2187, ...
    public void G4_SeriesNumericas_S10(Scanner scanner){
        System.out.println("Serie numerica 10");
        System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
        int numeroDeTerminos = scanner.nextInt();
        int numero = 3;
        for (int i = 1; i <= numeroDeTerminos; i++) {
            System.out.print(numero + " ");
            numero *= 3; 
        }
    }

}

package Figuras;

import java.util.Scanner;

public class Figura_13 {
    /**
     *muestra la figura F13:	
        1
        12
        123
        1234
        12345               
        123456
        1234567
        12345678
        123456789
        ...
     */  
    public void G4_Figuras_13(Scanner scanner){
        System.out.println("Figura 13"); 
        System.out.println("Ingrese el numero de niveles: ");
        int numeroNiveles = scanner.nextInt();
        for(int i=0; i<=numeroNiveles; i++){
        
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

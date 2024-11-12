package Poli_retos.Figura;

public class Figura_1 {
    /**
    muestra la figura F1:
    * * * * *
    *       *
    *       *  
    *       *           
    * * * * *
    */
    public void G4_Figuras_1(int extension) {
        System.out.println("Figura 01"); 
         for (int i = 0; i < extension ; i++) {
            for (int j = 0; j < extension  ; j++) {
                if (i == 0 || i == extension    - 1 || j == 0 || j == extension    - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Espacio para el interior
                }
            }
            System.out.println();
        }
    }

}

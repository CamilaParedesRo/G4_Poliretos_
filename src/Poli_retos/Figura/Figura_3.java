 package Poli_retos.Figura;

public class Figura_3 {
 public void G4_Figuras_3 (int extension){
      System.out.println("Figura 03");    
        for (int filas = 1; filas <= extension; filas++) {                      
            for (int columnas = 1 ; columnas <= extension; columnas++){
                if (columnas <= filas){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println ("");
        }
        System.out.println(" ");
   }
}

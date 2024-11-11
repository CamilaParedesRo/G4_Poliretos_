package Poli_retos.Figura;

public class Figura_07 {
public void G4_Figuras_7(int extension){

      System.out.println("Figura 07");    
        for (int filas = 1; filas <= extension; filas++) {                      
            for (int columnas = 1 ; columnas <= extension; columnas++){   
                if (filas == columnas){ 
                System.out.print(  " |__ ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" " );
        }
      System.out.println(" ");    
    }
}

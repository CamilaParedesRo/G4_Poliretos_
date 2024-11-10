package Poli_retos.Figura;

public class Figura_2 {
   public void G4_Figuras_2(int extension) {
      System.out.println("Figura 02");    
      for (int filas = 1; filas <= extension; filas++) {                      
          for (int columnas = 1 ; columnas <= extension ; columnas++){        
              if ((filas == 1 && columnas == 1)| (filas == 5 && columnas == 5)||(filas == 1 && columnas == 5)||(filas == 5 && columnas == 1) 
                  ||(filas == 3 && columnas == 1)||(filas == 3 && columnas == 5)||(filas == 1 && columnas == 3)||(filas == 5 && columnas == 3)){   
                  System.out.print( "* ");                        
              } else if ((filas == 1 && columnas == 2)| (filas == 1 && columnas == 4)||(filas == 2 && columnas == 1)||(filas == 2 && columnas == 5)
               ||(filas == 4 && columnas == 1)| (filas == 4 && columnas == 5)||(filas == 5 && columnas == 4)||(filas == 5 && columnas == 2)    ) {
                  System.out.print("+ ");                         
              } else {
                  System.out.print( "  ");
              }
          }
          System.out.println();    
      }
      System.out.println(" ");    
   } 
}

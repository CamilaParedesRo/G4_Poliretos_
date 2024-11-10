package Poli_retos.Figura;

public class Figura_17 {
   public void G4_Figuras_17() {
      int longitud = 5 ;
      System.out.println("Figura 17");    
       for (int filas = 1; filas <= longitud ; filas++) {                      
           for (int columnas = 1 ; columnas <= longitud ; columnas++){   
             if (filas == columnas || filas + columnas == longitud + 1) {
               if (filas % 2 == 1) {
                 System.out.print("1");
             } else {
                 System.out.print("0");
             }
         } else {
             System.out.print(" "); 
         }
       }
       System.out.println();
   } 
   System.out.println(" ");
   } 
}

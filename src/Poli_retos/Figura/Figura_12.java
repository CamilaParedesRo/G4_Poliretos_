package Poli_retos.Figura;

public class Figura_12 {
public void G4_Figuras_12(int extension) {

      System.out.println("Figura 12");    

       System.out.println( " ");

       for (int filas = 1; filas <= extension; filas++) {                      
           for (int columnas = 1 ; columnas <= extension; columnas++){   
               if (columnas <= extension - filas + 1){
                   System.out.print(columnas);
               } else { 
               System.out.print(" ");
               }  
       }
       System.out.println( " ");
   }  
   System.out.println(" ");
}
}

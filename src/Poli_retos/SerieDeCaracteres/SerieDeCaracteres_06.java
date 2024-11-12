package Poli_retos.SerieDeCaracteres;

public class SerieDeCaracteres_06 {
 
   public void G4_SeriesDeCaracteres_SC6_1(int extension){

      System.out.println("Serie de caractes 06");
      System.out.println(" La serie es la siguiente: ");
      for (int i = 0 ; i < extension; i++) {
          
          System.out.print((char)('a' + (i % 26)) + " "); // Codigo ASCII empieza de a es 97
      }
      System.out.println(" ");

   }

   public void G4_SeriesDeCaracteres_SC6_2 (int extension){
      System.out.println("Serie de caractes 06");
      System.out.println(" La serie es la siguiente: ");
      for (int i = 0 ; i < extension; i++) {
          if (i % 2 == 0) {          
              System.out.print((char)('a' + (i % 26))  + " ");
          }else if (i % 4 == 1) {
              System.out.print("+ ");
          }else{ 
              System.out.print("- ");
          }
      }
      System.out.println(" ");
  }

}

package Poli_retos.SerieDeCaracteres;

public class SerieDeCaracteres_01 {
public void G4_SeriesDeCaracteres_SC1 (int extension){
      System.out.println("Serie de caractes 01");
        System.out.println(" La serie es la siguiente: ");
        for (int i = 0 ; i < extension; i++) {
            if (i % 2 == 0) {
                System.out.print("+ ");
            } else {
                System.out.print("- ");
            }
        }
       System.out.println(" ");

   }
}

package Poli_retos.SerieNumerica;

public class SerieNumerica_6 {
 public void G4_SeriesNumericas_S6(int n){
      System.out.println(" ");
      System.out.println("Serie Numerica 06");
      int a = 1;
      System.out.println(" La serie es la siguiente: ");
      for (int i = 0; i < n; i++) {
          System.out.print(a + " ");
          a = a + (2*i) + 3;
      }
      System.out.println(" ");
  }


}

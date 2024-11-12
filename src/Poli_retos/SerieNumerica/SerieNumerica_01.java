package Poli_retos.SerieNumerica;
public class SerieNumerica_01 {
public void G4_SeriesNumericas_S1 (int extension){
      System.out.println("Serie Numerica 01");
      int a = 0, b =1, c = 0;
      System.out.println(" La serie es la siguiente: ");
      for (int i = 0; i < extension; i++) {
          System.out.print(a + " ");
          c = a + b;
          a = b;
          b = c;
       }
       System.out.println(" ");
}

}

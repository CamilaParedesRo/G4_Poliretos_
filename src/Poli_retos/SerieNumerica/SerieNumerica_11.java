package Poli_retos.SerieNumerica;


public class SerieNumerica_11 {
public void G4_SerieNumerica_11(int extension) {
        
      System.out.println("Serie numerica S11");
        int numero = 2;
        int incremento = 4;
        
        for (int i = 0; i < extension; i++) {
            System.out.print(numero + " ");
            numero += incremento;
            incremento += 2;
      }
   }
}


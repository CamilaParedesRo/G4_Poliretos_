package Poli_retos.Loading;

public class Loading_4 {
   public void G4_Loading_4() {
      System.out.print("Loading 4");
      try {
          for (int i = 0; i <= 100; i += 10) { 
              System.out.print("\r");
              if ( (i / 10) % 2 == 0 ){
                  System.out.print(  "o0o" + " " + i + "%");
              }else{
                  System.out.print(  "0o0" + " " + i + "%");
              }
              Thread.sleep(700); 
          }
          System.out.println("\r Cargando siguiente pantalla ... Espere ");
      } catch (InterruptedException e) {
          System.out.println("La señal esta siendo interrumpida");
      }
      System.out.print(" ");
  }
}

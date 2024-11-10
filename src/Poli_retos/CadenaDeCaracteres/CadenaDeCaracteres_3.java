package Poli_retos.CadenaDeCaracteres;

import java.util.Scanner;

public class CadenaDeCaracteres_3 {
public void G4_CadenadeCaracteres_3(Scanner scanner) {
     
  System.out.println("Cadena de caracteres 3"); 
    String frase = "";
    while (true) {
      System.out.println("Ingrese una frase: ");
      frase = scanner.nextLine();
      frase = frase.replace(" ", "");
      if (frase.matches("[a-zA-Z]+")) {
          break; 
      } else {
          System.out.println("El nombre solo puede contener letras.");
      }
  }
      String sinVocales = frase.replaceAll("[a,e,i,o,u,A,E,I,O,U]", " ");
      System.out.println(sinVocales);
      System.out.println(" "); 

   } 
}

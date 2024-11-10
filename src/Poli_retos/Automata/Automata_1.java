package Poli_retos.Automata;

import java.util.Scanner;

public class Automata_1 {
   public static boolean validarCadena_automata1(String cadena) {
      int estado = 0; 
      for (int i = 0; i < cadena.length(); i++) {
          char simbolo = cadena.charAt(i);
          switch (estado) {
              case 0:
                  if (simbolo == 'a') {
                      estado = 0;
                  } else if (simbolo == 'b') {
                      estado = 1;
                  } else {
                      return false;
                  }
                  break;

              case 1:
                  if (simbolo == 'b') {
                      estado = 1;
                  } else if (simbolo == 'c') {
                      estado = 2;
                  } else {
                      return false;
                  }
                  break;

              case 2:
                  return false;
          }
      }
      return estado == 2;
  }
  
  public void G4_Automata_1(Scanner scanner) {
   System.out.println("Automata 1 ");
   System.out.println("Escriba una cadena para validar: ");
   String cadena = scanner.nextLine();
      if (validarCadena_automata1(cadena)) {
          System.out.println("La cadena es válida");
      } else {
          System.out.println("La cadena no es válida");
      }
   System.out.println(" ");
  } 
}

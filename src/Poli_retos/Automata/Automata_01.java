package Poli_retos.Automata;

import java.util.Scanner;

public class Automata_01 {
    final String alfabeto = "a-b-c";
    final int error = -1;
    final int Resp = 3; // Estado de aceptación
    
    // Matriz de transiciones: q0, q1, q2, q3
    final int[][] maquina = {
        // a        b         c
        { 0,        1,    error },      // q0
        { error,    1,        3 },      // q1 
        { error,   error, error }   // q2
    };

    private int getIndexAlfabeto(String moneda) {
        Scanner scAlfa = new Scanner(alfabeto).useDelimiter("-");
        for (int indexAlfa = 0; scAlfa.hasNext(); indexAlfa++) {
            if (moneda.equals(scAlfa.next()))
                return indexAlfa;
        }
        return -1; 
    }
    
    public void G4_Automata_1() {
 
      Scanner scanner = new Scanner(System.in);
      System.out.print("Automata 1");
      System.out.println("Introduce una cadena para validar: ");
      String palabra = scanner.nextLine();
      int estadoActual = 0; // Estado inicial
      Scanner scannerPalabra = new Scanner(palabra).useDelimiter(""); 
      while (scannerPalabra.hasNext()) {
          String simbolo = scannerPalabra.next();
          int indexAlfa = getIndexAlfabeto(simbolo);
          if (indexAlfa == -1 || maquina[estadoActual][indexAlfa] == error) {
              System.out.println("Cadena no válida");
              return;
          }
          estadoActual = maquina[estadoActual][indexAlfa]; 
      }
      if (estadoActual == Resp) {
         System.out.println("Cadena válida");
      } else {
         System.out.println("Cadena no válida");
      }
     scanner.close();
     scannerPalabra.close();
    }       

 }


 
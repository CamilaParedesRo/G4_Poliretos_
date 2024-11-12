package Poli_retos.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array_05 {

   public void G4_Array_5() throws InterruptedException{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Array 5");

      String nombre = "";
      while (true) {
          System.out.print("Ingrese su nombre completo:: ");
          nombre = scanner.nextLine();
          nombre = nombre.replace(" ", "");
          if (nombre.matches("[a-zA-Z]+")) {
              break; 
          } else {
              System.out.println("El nombre solo puede contener letras.");
          }
      }

      int longitud = 13;
      char[][] matriz = new char[longitud][longitud];
      char[] nombreArray = nombre.toCharArray();
      
      List<int[]> posiciones = new ArrayList<>();
      for (int i = 0; i < longitud; i++) {
          for (int j = 0; j < longitud; j++) {
              posiciones.add(new int[]{i, j});
          }
      }
      Collections.shuffle(posiciones); // Desordenar posiciones aleatoriamente
  
      for (int i = 0; i < nombreArray.length; i++) {
          int[] posicion = posiciones.get(i % posiciones.size()); // Obtener una posición aleatoria
          int fila = posicion[0];
          int columna = posicion[1];
          if (matriz[fila][columna] != 0) {
              matriz[fila][columna] = '*';
          } else {
              matriz[fila][columna] = nombreArray[i];
          }
      }
  
      for (int i = 0; i < longitud; i++) {
          for (int j = 0; j < longitud; j++) {
              if (matriz[i][j] == 0) {
                  matriz[i][j] = ' '; 
              }
          }
      }
      imprimirMatriz(matriz);
  }

  private void imprimirMatriz(char[][] matriz) throws InterruptedException{
      for (char[] fila : matriz) {
          for (char c : fila) {
              System.out.print(c + " ");
              Thread.sleep(1000);
          }
          System.out.println();
      }
  }
 }
package Poli_retos.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array_5 {

   public void G4_Array_5(Scanner scanner) throws InterruptedException{
      System.out.println("Array 5");
      System.out.println("Ingrese su nombre completo: ");
      String nombre = scanner.nextLine();
      nombre = nombre.replace(" ", "");
      int longitud = 10;

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
          
          // Colocar la letra o un * si ya hay algo en la posición
          if (matriz[fila][columna] != 0) {
              matriz[fila][columna] = '*';
          } else {
              matriz[fila][columna] = nombreArray[i];
          }
      }
  
      // Llenar las posiciones vacías con letras aleatorias del nombre
      for (int i = 0; i < longitud; i++) {
          for (int j = 0; j < longitud; j++) {
              if (matriz[i][j] == 0) {
                  matriz[i][j] = ' '; // Dejar vacío para un formato más claro
              }
          }
      }
      
      // Imprimir la matriz final
      imprimirMatriz(matriz);

  }
  
  // Método para imprimir la matriz con formato de espacios
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
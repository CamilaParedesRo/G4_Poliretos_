package Poli_retos.Array;


public class Array_02 {
   // Método que dibuja las iniciales E y P
   public void GR4_generarArray(int tamano, char caracter) {
       System.out.println("\nMatriz de iniciales:");
       GR4_dibujarE(tamano, caracter);
       System.out.println(); // Espacio entre las letras
       GR4_dibujarP(tamano, caracter);
   }

   public static void GR4_dibujarE(int tamano, char caracter) {
       // Dibuja la letra "E" usando el tamaño y carácter dados
       for (int i = 0; i < tamano; i++) {
           for (int j = 0; j < tamano; j++) {
               if (i == 0 || i == tamano / 2 || i == tamano - 1 || j == 0) {
                   System.out.print(caracter);
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
   }

   public static void GR4_dibujarP(int tamano, char caracter) {
       // Dibuja la letra "P" usando el tamaño y carácter dados
       for (int i = 0; i < tamano; i++) {
           for (int j = 0; j < tamano; j++) {
               if (i == 0 || i == tamano / 2 || j == 0 || (j == tamano - 1 && i < tamano / 2)) {
                   System.out.print(caracter);
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
   }
}

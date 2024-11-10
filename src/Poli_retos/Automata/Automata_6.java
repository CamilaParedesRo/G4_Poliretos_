package Poli_retos.Automata;

import java.util.Scanner;

public class Automata_6 {
 public enum Estado {
   q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, qError
}

public static Estado transicion(Estado estadoActual, char c) {
   switch (estadoActual) {
       case q0:
           if (c == 'f') return Estado.q1;
           if (c == 'i') return Estado.q4;
           return Estado.qError;

       case q1:
           if (c == 'o') return Estado.q2;
           return Estado.qError;

       case q2:
           if (c == 'r') return Estado.q3;
           return Estado.qError;

       case q3: 
           if (c == '(') return Estado.q0;
           return Estado.qError;

       case q4:
           if (c == 'f') return Estado.q5;
           return Estado.qError;

       case q5:
           if (c == '(') return Estado.q0;
           if (c == 'e') return Estado.q6;
           return Estado.qError;

       case q6:
           if (c == 's') return Estado.q7;
           return Estado.qError;

       case q7:
           if (c == 'e') return Estado.q8;
           return Estado.qError;

       case q8: 
           if (c == '(') return Estado.q0;
           return Estado.qError;

       case q9:
           if (c == 'e') return Estado.q10;
           return Estado.qError;

       case q10:
           if (c == 'h') return Estado.q11;
           return Estado.qError;

       case q11: 
           if (c == '(') return Estado.q0;
           return Estado.qError;

       default:
           return Estado.qError;
   }
}

public static boolean validarCadena_automata6(String cadena) {
   Estado estadoActual = Estado.q0;

   for (char c : cadena.toCharArray()) {
       estadoActual = transicion(estadoActual, c);
       if (estadoActual == Estado.qError) {
           return false; 
       }
   }
   return estadoActual == Estado.q3 || estadoActual == Estado.q5 || estadoActual == Estado.q8 || estadoActual == Estado.q11;
}

// Método para ejecutar el autómata
public void G4_Automata_6(Scanner scanner) {
   System.out.print("Automata 6");
   System.out.print("Ingrese una palabra: ");
   String cadena = scanner.nextLine();

   if (validarCadena_automata6(cadena)) {
       System.out.println("La palabra es válida en el lenguaje L.");
   } else {
       System.out.println("La palabra no es válida en el lenguaje L.");
   }
   System.out.print(" ");
}
}


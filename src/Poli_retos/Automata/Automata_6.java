package Poli_retos.Automata;

import java.util.Scanner;

public class Automata_6 {
    public enum Estado {
        q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, qError
    }
    
    public static Estado transicion(Estado estadoActual, char c) {
        // Primero, ignoramos espacios y tabulaciones
        if (c == ' ' || c == '\t') {
            return estadoActual; // Si es espacio o tabulación, no cambiamos de estado
        }
        
        switch (estadoActual) {
            case q0:
                if (c == 'f') return Estado.q1;  // transicion de 'f' a q1
                if (c == 'i') return Estado.q4;  // transicion de 'i' a q4
                return Estado.qError;  // si el carácter no es 'f' ni 'i', error
    
            case q1:
                if (c == 'o') return Estado.q2;  // transicion de 'o' a q2
                return Estado.qError;  // error si no es 'o'
    
            case q2:
                if (c == 'r') return Estado.q3;  // transicion de 'r' a q3
                return Estado.qError;  // error si no es 'r'
    
            case q3:
                if (c == '(') return Estado.q0;  // transicion de '(' a q0
                return Estado.qError;  // error si no es '('
    
            case q4:
                if (c == 'f') return Estado.q5;  // transicion de 'f' a q5
                return Estado.qError;  // error si no es 'f'
    
            case q5:
                if (c == '(') return Estado.q0;  // transicion de '(' a q0
                if (c == 'e') return Estado.q6;  // transicion de 'e' a q6
                return Estado.qError;  // error si no es '(' ni 'e'
    
            case q6:
                if (c == 's') return Estado.q7;  // transicion de 's' a q7
                return Estado.qError;  // error si no es 's'
    
            case q7:
                if (c == 'e') return Estado.q8;  // transicion de 'e' a q8
                return Estado.qError;  // error si no es 'e'
    
            case q8:
                if (c == '(') return Estado.q0;  // transicion de '(' a q0
                return Estado.qError;  // error si no es '('
    
            case q9:
                if (c == 'e') return Estado.q10;  // transicion de 'e' a q10
                return Estado.qError;  // error si no es 'e'
    
            case q10:
                if (c == 'h') return Estado.q11;  // transicion de 'h' a q11
                return Estado.qError;  // error si no es 'h'
    
            case q11:
                if (c == '(') return Estado.q0;  // transicion de '(' a q0
                return Estado.qError;  // error si no es '('
    
            default:
                return Estado.qError;  // si el estado no es reconocido, error
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

   String respuesta;
   do {
    System.out.print("Automata 6");
       System.out.print("Ingrese una palabra: ");
       String cadena = scanner.nextLine();

       if (validarCadena_automata6(cadena)) {
           System.out.println("La palabra es válida en el lenguaje L.");
       } else {
           System.out.println("La palabra no es válida en el lenguaje L.");
       }

       System.out.println("¿Deseas validar otra cadena? (s/n)");
       respuesta = scanner.nextLine().trim().toLowerCase();  // Leemos la respuesta y la convertimos a minúsculas
       
    } while (respuesta.equals("s"));  // Si la respuesta es 's', seguimos validando más cadenas

    // Mensaje de despedida cuando el ciclo termina
    System.out.println("¡Hasta luego!");
}

}



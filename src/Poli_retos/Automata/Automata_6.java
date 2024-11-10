package Poli_retos.Automata;

import java.util.Scanner;

public class Automata_6 {
    public static boolean validarCadena_automata6(String input) {
        int estado = 0;
    
        // Recorrer cada carácter de la entrada
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
    
            switch (estado) {
                case 0: // Estado inicial, espera 'f', 'i', o 'e'
                    if (c == 'f') {
                        estado = 1; // Empezando la palabra "for"
                    } else if (c == 'i') {
                        estado = 10; // Empezando la palabra "if"
                    } else if (c == 'e') {
                        estado = 20; // Empezando la palabra "else"
                    } else {
                        return false; 
                    }
                    break;
    
               // "for"
                case 1: // Espera 'o'
                    if (c == 'o') {
                        estado = 2;
                    } else {
                        return false; 
                    }
                    break;
    
                case 2:
                    if (c == 'r') {
                        estado = 3;
                    } else if (c == 'e'){
                        estado = 25;
                    } else {
                        return false; 
                    }
                    break;
    
                case 3: 
                    if (c == '(') {
                        return true; // Cadena válida "for("
                    } else if (c == ' ') {
                        estado = 4; 
                    } else {
                        return false; 
                    }
                    break;
    
                case 4: 
                    if (c == '(') {
                        return true; // Cadena válida"for( "
                    } else if (c != ' ') {
                        return false; 
                    }
                    break;
    
                //"if"
                case 10: // Espera 'f'
                    if (c == 'f') {
                        estado = 11;
                    } else {
                        return false; 
                    }
                    break;
    
                case 11: 
                    if (c == '(') {
                        return true; // Cadena válida "if("
                    } else if (c == ' ') {
                        estado = 12; 
                    } else if (c == '{') {
                        return true; // Cadena válida "if {"
                    } else {
                        return false;
                    }
                    break;
    
                case 12: 
                    if (c == '{') {
                        return true; // Cadena válida  "if {"
                    } else if (c != ' ') {
                        return false; 
                    }
                    break;
    
                case 20: // Espera 'l'
                    if (c == 'l') {
                        estado = 21;
                    } else {
                        return false;
                    }
                    break;
    
                case 21: // Espera 's'
                    if (c == 's') {
                        estado = 22;
                    } else {
                        return false;
                    }
                    break;
    
                case 22: // Espera 'e'
                    if (c == 'e') {
                        estado = 23;
                    } else {
                        return false;
                    }
                    break;
    
                case 23: // else if
                    if (c == '{') {
                        return true; // Cadena válida  "else{"
                    } else if (c == ' ') {
                        estado = 24; 
                    } else if (c == 'i') {
                        estado = 10; 
                    } else {
                        return false; 
                    }
                    break;
    
                case 24: // Permite múltiples espacios antes de '{' o "if"
                    if (c == '{') {
                        return true; // Cadena válida "else {"
                    } else if (c == 'i') {
                        estado = 10; 
                    } else if (c != ' ') {
                        return false; 
                    }
                    break;
                case 25: // Espera 'l'
                    if (c == 'a') {
                        estado = 26;
                    } else {
                        return false;
                    }
                    break;
                case 26: // Espera 'l'
                    if (c == 'c') {
                        estado = 27;
                    } else {
                        return false;
                    }
                    break;
                 case 27: // Espera 'l'
                    if (c == 'h') {
                        return true;
                    }
                    break;
                default:
                    return false;
            }
        }
    
        return false; // Si termina sin alcanzar un estado de aceptación, es inválido
    }
    

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


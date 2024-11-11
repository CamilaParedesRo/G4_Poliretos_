import Poli_retos.SerieNumerica.Serie_02;
import Poli_retos.SerieNumerica.Serie_04;
import Poli_retos.SerieNumerica.Serie_07;
import Poli_retos.SerieNumerica.Serie_09;
import Poli_retos.SerieNumerica.Serie_12;
import Poli_retos.SerieDeCaracteres.SerieCara_02;
import Poli_retos.SerieDeCaracteres.SerieCara_04;
import Poli_retos.SerieDeCaracteres.SerieCara_07;
import Poli_retos.SerieDeCaracteres.SerieCara_09;
import Poli_retos.Loading.Loading_07;
import Poli_retos.Loading.Loading_12;
import Poli_retos.Recursion.Recursividad_05;
import Poli_retos.CadenaDeCaracteres.Cadena_01;
import Poli_retos.CadenaDeCaracteres.Cadena_06;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Serie_02 serie2 = new Serie_02();
        Serie_04 serie4 = new Serie_04();
        Serie_07 serie7 = new Serie_07();
        Serie_09 serie9 = new Serie_09();
        Serie_12 serie12 = new Serie_12();
        
        SerieCara_02 serieCara2 = new SerieCara_02();
        SerieCara_04 serieCara4 = new SerieCara_04();
        SerieCara_07 serieCara7 = new SerieCara_07();
        SerieCara_09 serieCara9 = new SerieCara_09();
        
        Loading_07 loading7 = new Loading_07();
        Loading_12 loading12 = new Loading_12();
        
        Recursividad_05 recursion = new Recursividad_05();
        
        Cadena_01 cadena1 = new Cadena_01();
        Cadena_06 cadena6 = new Cadena_06();
        
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Serie Numérica S2");
            System.out.println("2. Serie Numérica S4");
            System.out.println("3. Serie Numérica S7");
            System.out.println("4. Serie Numérica S9");
            System.out.println("5. Serie Numérica S12");
            System.out.println("6. Serie de Caracteres S2");
            System.out.println("7. Serie de Caracteres S4");
            System.out.println("8. Serie de Caracteres S7");
            System.out.println("9. Serie de Caracteres S9");
            System.out.println("10. Loading 7");
            System.out.println("11. Loading 12");
            System.out.println("12. Recursividad 5");
            System.out.println("13. Contar Vocales en Cadena");
            System.out.println("14. Invertir y Convertir a Mayúsculas en Cadena");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            
            if (opcion == 0) break;
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de términos para Serie Numérica S2: ");
                    int terminosS2 = scanner.nextInt();
                    serie2.GR4_generarSerieDos(terminosS2);
                    break;
                case 2:
                    System.out.print("Ingrese el número de términos para Serie Numérica S4: ");
                    int terminosS4 = scanner.nextInt();
                    serie4.GR4_generar(terminosS4);
                    break;
                case 3:
                    System.out.print("Ingrese el número de términos para Serie Numérica S7: ");
                    int terminosS7 = scanner.nextInt();
                    serie7.GR4_generarSerieSiete(terminosS7);
                    break;
                case 4:
                    System.out.print("Ingrese el número de términos para Serie Numérica S9: ");
                    int terminosS9 = scanner.nextInt();
                    serie9.GR4_generar(terminosS9);
                    break;
                case 5:
                    System.out.print("Ingrese el número de términos para Serie Numérica S12: ");
                    int terminosS12 = scanner.nextInt();
                    serie12.GR4_generar(terminosS12);
                    break;
                case 6:
                    System.out.print("Ingrese el número de términos para Secuencia de Caracteres S2: ");
                    int terminosCara2 = scanner.nextInt();
                    serieCara2.GR4_generarSecuenciaDos(terminosCara2);
                    break;
                case 7:
                    System.out.print("Ingrese el número de términos para Secuencia de Caracteres S4: ");
                    int terminosCara4 = scanner.nextInt();
                    serieCara4.GR4_generar(terminosCara4);
                    break;
                case 8:
                    System.out.print("Ingrese el número de términos para Secuencia de Caracteres S7: ");
                    int terminosCara7 = scanner.nextInt();
                    serieCara7.GR4_generarSecuenciaSiete(terminosCara7);
                    break;
                case 9:
                    System.out.print("Ingrese el número de términos para Secuencia de Caracteres S9: ");
                    int terminosCara9 = scanner.nextInt();
                    serieCara9.GR4_generar(terminosCara9);
                    break;
                case 10:
                    loading7.GR4_mostrar();
                    break;
                case 11:
                    loading12.GR4_mostrar();
                    break;
                case 12:
                    System.out.print("Ingrese el número hasta el cual contar progresivamente: ");
                    int nRecursion = scanner.nextInt();
                    recursion.GR4_contarProgresivo(nRecursion);
                    break;
                case 13:
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    System.out.print("Ingrese una frase para contar las vocales: ");
                    String frase = scanner.nextLine();
                    cadena1.GR4_contarVocales(frase);
                    break;
                case 14:
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    System.out.print("Ingrese una frase para invertir y convertir a mayúsculas: ");
                    String fraseInvertir = scanner.nextLine();
                    cadena6.GR4_invertirMayusculas(fraseInvertir);
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
        
        scanner.close();
        System.out.println("Programa finalizado.");
    }
}

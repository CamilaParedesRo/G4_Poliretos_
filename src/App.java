import Poli_retos.Start.Grupo4;
import Poli_retos.Array.Array2;
import Poli_retos.Automata.Automata4;
import Poli_retos.CadenaDeCaracteres.CadenaDeCaracteres;
import Poli_retos.Figura.Figura5;
import Poli_retos.Figura.Figura10;
import Poli_retos.Figura.Figura15;
import Poli_retos.Loading.Loading;
import Poli_retos.Recursion.Recursion;
import Poli_retos.SerieDeCaracteres.SerieDeCaracteres;
import Poli_retos.SerieNumerica.SerieNumerica;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Muestra la información del grupo
        Grupo4.mostrarInformacionGrupo();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Array");
            System.out.println("2. Automata");
            System.out.println("3. Cadena de Caracteres");
            System.out.println("4. Figura");
            System.out.println("5. Loading");
            System.out.println("6. Recursion");
            System.out.println("7. Serie de Caracteres");
            System.out.println("8. Serie Numérica");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejecutarArrays(scanner);
                    break;
                case 2:
                    ejecutarAutomatas();
                    break;
                case 3:
                    ejecutarCadenaDeCaracteres(scanner);
                    break;
                case 4:
                    ejecutarFigura(scanner);
                    break;
                case 5:
                    ejecutarLoading();
                    break;
                case 6:
                    ejecutarRecursion();
                    break;
                case 7:
                    ejecutarSerieDeCaracteres(scanner);
                    break;
                case 8:
                    ejecutarSerieNumerica(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void ejecutarArrays(Scanner scanner) {
        System.out.print("Ingrese el tamaño de la letra: ");
        int size = scanner.nextInt();
        System.out.print("Ingrese el carácter para dibujar: ");
        char caracter = scanner.next().charAt(0);
        Array2 array = new Array2();
        array.generarArray(size, caracter);
    }

    private static void ejecutarAutomatas() {
        Automata4 automata = new Automata4();
        String[] pruebas = {"123", "12.34", "0.5", ".5", "5.", "abc", "12..34"};
        automata.ejecutar(pruebas);
    }

    private static void ejecutarCadenaDeCaracteres(Scanner scanner) {
        System.out.println("1. Contar vocales en una frase");
        System.out.println("2. Invertir frase en mayúsculas");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (opcion == 1) {
            System.out.print("Ingrese una frase: ");
            String frase = scanner.nextLine();
            CadenaDeCaracteres cadena = new CadenaDeCaracteres();
            cadena.contarVocales(frase);
        } else if (opcion == 2) {
            System.out.print("Ingrese una frase: ");
            String frase = scanner.nextLine();
            CadenaDeCaracteres cadena = new CadenaDeCaracteres();
            cadena.invertirMayusculas(frase);
        } else {
            System.out.println("Opción no válida en Cadenas de Caracteres.");
        }
    }

    private static void ejecutarFigura(Scanner scanner) {
        System.out.print("Ingrese el número de filas para las figuras: ");
        int numeroFilas = scanner.nextInt();

        Figura5 figura5 = new Figura5();
        Figura10 figura10 = new Figura10();
        Figura15 figura15 = new Figura15();

        figura5.dibujar(numeroFilas);
        figura10.dibujar(numeroFilas);
        figura15.dibujar(numeroFilas);
    }

    private static void ejecutarLoading() {
        Loading loading = new Loading();
        loading.mostrarLoading7();
        loading.mostrarLoading12();
    }

    private static void ejecutarRecursion() {
        Recursion recursion = new Recursion();
        recursion.contarProgresivo(5); // Ejemplo de número para recursividad
    }

    private static void ejecutarSerieDeCaracteres(Scanner scanner) {
        System.out.print("Ingrese el número de términos: ");
        int numeroTerminos = scanner.nextInt();

        SerieDeCaracteres serie4 = new SerieDeCaracteres();
        serie4.generar(numeroTerminos);
    }

    private static void ejecutarSerieNumerica(Scanner scanner) {
        System.out.print("Ingrese el número de términos: ");
        int numeroTerminos = scanner.nextInt();

        SerieNumerica serieNumerica = new SerieNumerica();
        serieNumerica.generarSerieCuatro(numeroTerminos);
        serieNumerica.generarSerieNueve(numeroTerminos);
        serieNumerica.generarSerieDoce(numeroTerminos);
    }
}

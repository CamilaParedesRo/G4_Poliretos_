
import java.util.Scanner;

import Poli_retos.CadenaDeCaracteres.Cadena1;
import Poli_retos.CadenaDeCaracteres.Cadena6;
import Poli_retos.Loading.Loading7;
import Poli_retos.Loading.Loading12;
import Poli_retos.Recursion.Recursividad5;
import Poli_retos.SerieDeCaracteres.SerieCara4;
import Poli_retos.SerieDeCaracteres.SerieCara9;
import Poli_retos.SerieNumerica.Serie4;
import Poli_retos.SerieNumerica.Serie9;
import Poli_retos.SerieNumerica.Serie12;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción para ejecutar:");
            System.out.println("1. Contar vocales en una frase (Cadena1)");
            System.out.println("2. Invertir frase y convertir a mayúsculas (Cadena6)");
            System.out.println("3. Animación de barra de progreso (Loading7)");
            System.out.println("4. Animación de figura moviéndose (Loading12)");
            System.out.println("5. Contar progresivamente hasta N (Recursividad5)");
            System.out.println("6. Serie de caracteres: +, -, *, / (SerieCara4)");
            System.out.println("7. Serie de letras con repeticiones (SerieCara9)");
            System.out.println("8. Serie numérica Fibonacci / pares (Serie4)");
            System.out.println("9. Serie numérica potencias de 2 (Serie9)");
            System.out.println("10. Serie numérica incremento de pares (Serie12)");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    Cadena1 cadena1 = new Cadena1();
                    System.out.print("Ingrese una frase: ");
                    String frase1 = scanner.nextLine();
                    cadena1.contarVocales(frase1);
                    break;

                case 2:
                    Cadena6 cadena6 = new Cadena6();
                    System.out.print("Ingrese una frase: ");
                    String frase2 = scanner.nextLine();
                    cadena6.invertirMayusculas(frase2);
                    break;

                case 3:
                    Loading7 loading7 = new Loading7();
                    loading7.mostrar();
                    break;

                case 4:
                    Loading12 loading12 = new Loading12();
                    loading12.mostrar();
                    break;

                case 5:
                    Recursividad5 recursividad5 = new Recursividad5();
                    System.out.print("Ingrese un número para contar hasta él: ");
                    int numeroRecursivo = scanner.nextInt();
                    recursividad5.contarProgresivo(numeroRecursivo);
                    break;

                case 6:
                    SerieCara4 serieCara4 = new SerieCara4();
                    System.out.print("Ingrese el número de términos: ");
                    int numeroTerminosS4 = scanner.nextInt();
                    serieCara4.generar(numeroTerminosS4);
                    break;

                case 7:
                    SerieCara9 serieCara9 = new SerieCara9();
                    System.out.print("Ingrese el número de términos: ");
                    int numeroTerminosS9 = scanner.nextInt();
                    serieCara9.generar(numeroTerminosS9);
                    break;

                case 8:
                    Serie4 serie4 = new Serie4();
                    System.out.print("Ingrese el número de términos: ");
                    int numeroTerminosSerie4 = scanner.nextInt();
                    serie4.generar(numeroTerminosSerie4);
                    break;

                case 9:
                    Serie9 serie9 = new Serie9();
                    System.out.print("Ingrese el número de términos: ");
                    int numeroTerminosSerie9 = scanner.nextInt();
                    serie9.generar(numeroTerminosSerie9);
                    break;

                case 10:
                    Serie12 serie12 = new Serie12();
                    System.out.print("Ingrese el número de términos: ");
                    int numeroTerminosSerie12 = scanner.nextInt();
                    serie12.generar(numeroTerminosSerie12);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

            System.out.println(); // Espacio entre ejecuciones
        } while (opcion != 0);

        scanner.close();
    }
}

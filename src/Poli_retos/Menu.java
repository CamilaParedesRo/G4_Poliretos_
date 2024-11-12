package Poli_retos;

import java.util.Random;
import java.util.Scanner;

import Poli_retos.Array.Array_02;
import Poli_retos.Array.Array_04;
import Poli_retos.Array.Array_05;
import Poli_retos.Array.Array_3;
import Poli_retos.Array.Arreglo_01;
import Poli_retos.Automata.Automata_01;
import Poli_retos.Automata.Automata_02;
import Poli_retos.Automata.Automata_03;
import Poli_retos.Automata.Automata_03_1;
import Poli_retos.Automata.Automata_04;
import Poli_retos.Automata.Automata_06;
import Poli_retos.Automata.Grafo_5;
import Poli_retos.CadenaDeCaracteres.CadenaDeCaracter_04;
import Poli_retos.CadenaDeCaracteres.CadenaDeCaracter_05;
import Poli_retos.CadenaDeCaracteres.CadenaDeCaracteres_03;
import Poli_retos.CadenaDeCaracteres.CadenaDeCaracteres_08;
import Poli_retos.CadenaDeCaracteres.Cadena_01;
import Poli_retos.CadenaDeCaracteres.Cadena_06;
import Poli_retos.CadenaDeCaracteres.Cadena_2;
import Poli_retos.CadenaDeCaracteres.Cadena_7;
import Poli_retos.CadenaDeCaracteres.Cadena_9;
import Poli_retos.Figura.Figura_02;
import Poli_retos.Figura.Figura_03;
import Poli_retos.Figura.Figura_04;
import Poli_retos.Figura.Figura_05;
import Poli_retos.Figura.Figura_07;
import Poli_retos.Figura.Figura_08;
import Poli_retos.Figura.Figura_09;
import Poli_retos.Figura.Figura_1;
import Poli_retos.Figura.Figura_10;
import Poli_retos.Figura.Figura_11;
import Poli_retos.Figura.Figura_12;
import Poli_retos.Figura.Figura_13;
import Poli_retos.Figura.Figura_14;
import Poli_retos.Figura.Figura_15;
import Poli_retos.Figura.Figura_16;
import Poli_retos.Figura.Figura_17;
import Poli_retos.Figura.Figura_18;
import Poli_retos.Figura.Figura_19;
import Poli_retos.Figura.Figura_6;
import Poli_retos.Loading.Loading_01;
import Poli_retos.Loading.Loading_04;
import Poli_retos.Loading.Loading_05;
import Poli_retos.Loading.Loading_06;
import Poli_retos.Loading.Loading_07;
import Poli_retos.Loading.Loading_09;
import Poli_retos.Loading.Loading_10;
import Poli_retos.Loading.Loading_11;
import Poli_retos.Loading.Loading_12;
import Poli_retos.Loading.Loading_3;
import Poli_retos.Loading.Loading_8;
import Poli_retos.Recursion.Recursion_02;
import Poli_retos.Recursion.Recursion_03;
import Poli_retos.Recursion.Recursion_04;
import Poli_retos.Recursion.Recursion_1;
import Poli_retos.Recursion.Recursion_6;
import Poli_retos.Recursion.Recursividad_05;
import Poli_retos.SerieDeCaracteres.SerieCara_02;
import Poli_retos.SerieDeCaracteres.SerieCara_04;
import Poli_retos.SerieDeCaracteres.SerieCara_07;
import Poli_retos.SerieDeCaracteres.SerieCara_09;
import Poli_retos.SerieDeCaracteres.SerieDeCaracter_03;
import Poli_retos.SerieDeCaracteres.SerieDeCaracter_05;
import Poli_retos.SerieDeCaracteres.SerieDeCaracter_08;
import Poli_retos.SerieDeCaracteres.SerieDeCaracteres_01;
import Poli_retos.SerieDeCaracteres.SerieDeCaracteres_06;
import Poli_retos.SerieNumerica.SerieNumerica_01;
import Poli_retos.SerieNumerica.SerieNumerica_03;
import Poli_retos.SerieNumerica.SerieNumerica_06;
import Poli_retos.SerieNumerica.SerieNumerica_08;
import Poli_retos.SerieNumerica.SerieNumerica_11;
import Poli_retos.SerieNumerica.SerieNumerica_5;
import Poli_retos.SerieNumerica.Serie_02;
import Poli_retos.SerieNumerica.Serie_04;
import Poli_retos.SerieNumerica.Serie_07;
import Poli_retos.SerieNumerica.Serie_09;
import Poli_retos.SerieNumerica.Serie_12;

import Poli_retos.SerieNumerica.SerieaNumerica_10;
import Poli_retos.Start.Grupo_04;

public class Menu {
   public void MenuG4 () throws InterruptedException {

 Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Series Nuemricas 
        SerieNumerica_01 serieNumerica = new SerieNumerica_01();
        Serie_02 serie2 = new Serie_02();
        SerieNumerica_03 serieNumerica3 = new SerieNumerica_03();
        Serie_04 serie4 = new Serie_04();
        SerieNumerica_5 serienumerica_5 = new SerieNumerica_5();
        SerieNumerica_06 serieNumerica6 = new SerieNumerica_06();
        Serie_07 serie7 = new Serie_07();
        SerieNumerica_08 serieNumerica8 = new SerieNumerica_08();
        Serie_09 serie9 = new Serie_09();
        SerieaNumerica_10 serie10 = new SerieaNumerica_10();
        SerieNumerica_11 serie11 = new SerieNumerica_11();
        Serie_12 serie12 = new Serie_12();

        //Series de Caracteres
        SerieDeCaracteres_01 serieDeCaracteres = new SerieDeCaracteres_01();
        SerieCara_02 serieCara2 = new SerieCara_02();
        SerieDeCaracter_03 serieDeCaracter3 = new SerieDeCaracter_03();
        SerieCara_04 serieCara4 = new SerieCara_04();
        SerieDeCaracter_05 serieDeCaracter5 = new SerieDeCaracter_05();
        SerieDeCaracteres_06 serieDeCaracteres6 = new SerieDeCaracteres_06();
        SerieCara_07 serieCara7 = new SerieCara_07();
        SerieDeCaracter_08 serieDeCaracter8 = new SerieDeCaracter_08();
        SerieCara_09 serieCara9 = new SerieCara_09();
        
        //Figuras
        Figura_1 figura1 = new Figura_1();
        Figura_02 figura2 = new Figura_02();
        Figura_03 figura3 = new Figura_03();
        Figura_04 figura4 = new Figura_04();
        Figura_05 figura5 = new Figura_05();
        Figura_6 figura6 = new Figura_6();
        Figura_07 figura7 = new Figura_07();
        Figura_08 figura8 = new Figura_08();
        Figura_09 figura9 = new Figura_09();
        Figura_10 figura10 = new Figura_10();
        Figura_11 figura11 = new Figura_11();
        Figura_12 figura_12 = new Figura_12();
        Figura_13 figura13 = new Figura_13();
        Figura_14 figura_14 = new Figura_14();
        Figura_15 figura_15 = new Figura_15();
        Figura_16 figura16 = new Figura_16();
        Figura_17 figura_17 = new Figura_17();
        Figura_18 figura_18 = new Figura_18();
        Figura_19 figura_19 = new Figura_19();
        
        //Cadena de caracteres
        Cadena_01 cadena1 = new Cadena_01();
        Cadena_2 cadena2 = new Cadena_2();
        Cadena_06 cadena6 = new Cadena_06();
        CadenaDeCaracteres_03 cadenaDeCaracteres_03 = new CadenaDeCaracteres_03();
        CadenaDeCaracter_04 cadenaDeCaracter_04 = new CadenaDeCaracter_04();
        CadenaDeCaracter_05 cadenaDeCaracter_05 = new CadenaDeCaracter_05();
        Cadena_7 cadena7 = new Cadena_7();
        CadenaDeCaracteres_08 cadenaDeCaracteres_08 = new CadenaDeCaracteres_08();
        Cadena_9 cadena9 = new Cadena_9();

        //Arrays
        Arreglo_01 arreglo_01 = new Arreglo_01();
        Array_02 array2 = new Array_02();
        Array_3 array3 = new Array_3();
        Array_04 array_04 = new Array_04();
        Array_05 array_05 = new Array_05();

        //Loading
        Loading_01 loading1 = new Loading_01();
        Loading_3 loading3 = new Loading_3();
        Loading_04 loading4 = new Loading_04();
        Loading_05 loading5 = new Loading_05();
        Loading_06 loading6 = new Loading_06();
        Loading_07 loading7 = new Loading_07();
        Loading_8 loading8 = new Loading_8();
        Loading_09 loading9 = new Loading_09();
        Loading_10 loading10 = new Loading_10();
        Loading_11 loading11 = new Loading_11();
        Loading_12 loading12 = new Loading_12();
        
        //Recursividad
        Recursion_1 recursion1 = new Recursion_1();
        Recursion_02 recursion2 = new Recursion_02();
        Recursion_03 recursion3 = new Recursion_03();
        Recursion_04 recursion4 = new Recursion_04();
        Recursividad_05 recursion = new Recursividad_05();
        Recursion_6 recursion6 = new Recursion_6();

        //Automatas
        Automata_01 automata1 = new Automata_01();
        Automata_02 automata2 = new Automata_02();
        Automata_03 automata3 = new Automata_03();
        Automata_03_1 automata3_1 = new Automata_03_1();
        Automata_04 automata4 = new Automata_04();
        Grafo_5 automata5 = new Grafo_5();
        Automata_06 automata6 = new Automata_06();
       
        Grupo_04 grupo = new Grupo_04();
        grupo.GR4_mostrarInformacionGrupo();

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Serie Numérica");
            System.out.println("2. Serie de caracteres");
            System.out.println("3. Figuras");
            System.out.println("4. Cadena de caracteres");
            System.out.println("5. Arrays");
            System.out.println("6. Loading");
            System.out.println("7. Recursividad");
            System.out.println("8. Automatas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            
            // Verificación de entrada para prevenir errores al leer
            int opcion;
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor ingresa un número.");
                scanner.nextLine(); 
                continue; 
            }

            if (opcion == 0) break;
            System.out.print("Ingrese la extensión para la serie: ");
            int extension;
            try {
                extension = scanner.nextInt();
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Entrada inválida para la extensión. Intente de nuevo.");
                scanner.nextLine(); 
                continue; 
            }


            switch (opcion) {
                case 1:
                
                    Thread.sleep(500); 
                    serieNumerica.G4_SeriesNumericas_S1(extension);
                   System.out.println();
                    serie2.G4_SerieNumerica_S2(extension);
                    System.out.println();
                    serieNumerica3.G4_SerieNumerica_S3(extension);
                   System.out.println();
                    serie4.G4_SerieNumerica_S4(extension);
                   System.out.println();
                   serienumerica_5.G4_SeriesNumericas_S5(extension);
                   System.out.println();
                   serieNumerica6.G4_SeriesNumericas_S6(extension);
                   System.out.println();
                   serie7.G4_SerieNumerica_S7(extension);
                   System.out.println();
                   serieNumerica8.G4_SerieNumerica_S8(extension);
                   System.out.println();
                   serie9.G4_SerieNumerica_S9(extension);
                   System.out.println();
                   serie10.G4_SeriesNumericas_S10(extension);
                   System.out.println();
                   serie11.G4_SerieNumerica_11(extension);
                   System.out.println();
                   serie12.G4_SerieNumerica_S12(extension);
                    break;

                case 2:
                    Thread.sleep(500); 
                   System.out.println();
                    serieDeCaracteres.G4_SeriesDeCaracteres_SC1(extension);
                   System.out.println();
                   serieCara2.GR4_generarSecuenciaDos(extension);
                   System.out.println();
                   serieDeCaracter3.G4_Secuencia_CaracterS3(extension);
                   System.out.println();
                   serieCara4.GR4_generar(extension);
                   System.out.println();
                   serieDeCaracter5.G4_SeriesDeCaracteres_SC5(extension);
                   System.out.println();
                   serieDeCaracteres6.G4_SeriesDeCaracteres_SC6_1(extension);
                   System.out.println();
                   serieDeCaracteres6.G4_SeriesDeCaracteres_SC6_2(extension);
                   System.out.println();
                   serieCara7.GR4_generarSecuenciaSiete(extension);
                   System.out.println();
                   serieDeCaracter8.G4_SerieDeCaracter08(extension);
                   System.out.println();
                   serieCara9.GR4_generar(extension);
                    
                    break;
                case 3:
                    Thread.sleep(500); 
                   System.out.println();
                   figura1.G4_Figuras_1(extension);
                   System.out.println();
                   figura2.G4_Figuras_2(extension);
                   System.out.println();
                    figura3.G4_Figuras_3(extension);
                    System.out.println();
                    figura4.G4_Figura_4(extension);
                    System.out.println();
                    figura5.G4_Figura_5(extension);
                    System.out.println();
                    figura6.G4_Figuras_6(extension);
                    System.out.println();
                    figura7.G4_Figuras_7(extension);
                    System.out.println();
                    figura8.G4_Figuras_8(extension);
                    System.out.println();
                    figura9.G4_Figura_09(extension);
                    System.out.println();
                    figura10.G4_Figura_10(extension);
                    System.out.println();
                    figura11.G4_Figuras_11(extension);
                    System.out.println();
                    figura_12.G4_Figuras_12(extension);
                    System.out.println();
                    figura13.G4_Figuras_13(extension);
                    System.out.println();
                    figura_14.G4_Figura_14(extension);
                    System.out.println();
                    figura_15.G4_Figura_15(extension);
                    System.out.println();
                    figura16.G4_Figuras_16(extension);
                    System.out.println();
                    figura_17.G4_Figuras_17(extension);
                    System.out.println();
                    figura_18.G4_Figuras_18(extension);
                    System.out.println();
                    figura_19.G4_Figura_19(extension);
                    
                    break;
                case 4:
                    Thread.sleep(500); 
                    cadena1.G4_CadenadeCaracteres_1(scanner);
                    System.out.println();
                    cadena2.G4_CadenadeCaracteres_2(scanner);
                    System.out.println();
                    cadenaDeCaracteres_03.G4_CadenadeCaracteres_3(scanner);
                    System.out.println();
                    cadenaDeCaracter_04.G4_CadenaDeCaracter04(scanner);
                    System.out.println();
                    cadenaDeCaracter_05.G4_CadenadeCaracteres_5(scanner);
                    System.out.println();
                    cadena6.G4_CadenadeCaracteres_6(scanner);
                    System.out.println();
                    cadena7.G4_CadenadeCaracteres_7(scanner);
                    System.out.println();
                    cadenaDeCaracteres_08.G4_CadenadeCaracteres_8(scanner);
                    System.out.println();
                    cadena9.G4_CadenadeCaracteres_9(scanner);

                    break;
                case 5:
                    Thread.sleep(500); 
                    arreglo_01.G4_Areglo_01(scanner);
                    System.out.println();
                    System.out.print("Introduce el tamaño de las iniciales: ");
                    int tamano = scanner.nextInt();
                    System.out.print("Introduce el carácter para dibujar las iniciales: ");
                    char caracter = scanner.next().charAt(0);
                    array2.GR4_generarArray(tamano, caracter);
                    System.out.println();
                    array3.G4_Array_3();
                    System.out.println();
                    array_04.G4_Array_4();
                    System.out.println();
                    array_05.G4_Array_5();

                    break;
                case 6:
                    Thread.sleep(500); 
                    loading1.G4_Loading_01();
                    System.out.println();
                    loading3.G4_Loading_3();
                    System.out.println();
                    loading4.G4_Loading_4();
                    System.out.println();
                    loading5.G4_Loading05();
                    System.out.println();
                    loading6.G4_Loading_6();
                    System.out.println();
                    loading7.G4_Loading07();
                    System.out.println();
                    loading8.G4_Loading_8(scanner);
                    System.out.println();
                    loading9.G4_Loading_9(scanner);
                    System.out.println();
                    loading10.G4_Loading_10();
                    System.out.print("Introduce la cantidad de señales a dibujar: ");
                    int cantidad = scanner.nextInt();
                    loading11.G4_Loading_11(cantidad, random);
                    System.out.println();
                    loading12.G4_Loading_12();

                    break;
                case 7:
                    Thread.sleep(500); 
                    System.out.print("Introduce un número para calcular su factorial: ");
                    int numero = scanner.nextInt();
                    recursion1.G4_Recursion_1(numero);

                    recursion2.G4_Recursion_2();
                    System.out.println();
                    recursion3.G4_Recursion_3();
                    System.out.println();
                    recursion4.G4_Recursion_4(scanner);

                    System.out.print("Ingrese el número hasta el cual contar progresivamente: ");
                    int nRecursion = scanner.nextInt();
                    recursion.G4_Recursividad_5(nRecursion);

                    System.out.print("Introduce un número para iniciar el conteo regresivo: ");
                    int numero_re = scanner.nextInt();
                    recursion6.G4_Recursion_6(numero_re);
                    
                    break;
                case 8:
                    Thread.sleep(500); 
                    automata1.G4_Automata_1();
                    System.out.println();
                    automata2.G4_Automata02(scanner);
                    System.out.println();
                    automata3.G4_Automata03(scanner);
                    System.out.println();
                    automata3_1.G4_Automata03_1(scanner);
                    System.out.println();
                    automata4.G4_Automata_4(scanner);
                    System.out.println();
                    automata5.G4_Automata_5(scanner);
                    System.out.println();
                    automata6.G4_Automata_6(scanner);

                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
        
        scanner.close();
        System.out.println("Programa finalizado.");
    }


    public static int validarNumeros(){
        Scanner scanner = new Scanner(System.in);
             int extension;
        while (true) {
           System.out.println("Ingrese la extensión de las series: ");
           if (scanner.hasNextInt()) {
               extension = scanner.nextInt();
               if (extension > 0) {
                break; 
            } else {
                System.out.println("Error: Por favor, ingrese un número entero positivo.");
            } 
           } else {
               System.out.println("Error: Por favor, ingrese un número entero válido.");
               scanner.next(); 
           }
        }
        scanner.close();
         return extension;
       } 
}

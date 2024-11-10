import java.util.Scanner;

import Poli_retos.Array.Arreglo_01;
import Poli_retos.CadenaDeCaracteres.CadenaDeCaracter_04;
import Poli_retos.CadenaDeCaracteres.CadenaDeCaracter_05;
import Poli_retos.SerieDeCaracteres.SerieDeCaracter_08;




public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SerieDeCaracter_08 serie= new SerieDeCaracter_08();
        serie.G4_SerieDeCaracter08(scanner);
        System.out.println();
        CadenaDeCaracter_04 cadena = new CadenaDeCaracter_04();
        CadenaDeCaracter_05 cadena_= new CadenaDeCaracter_05();

        cadena.G4_CadenaDeCaracter04(scanner);
        cadena_.G4_Cadena_5(scanner);
       Arreglo_01 array = new Arreglo_01();
       array.G4_Areglo_01(scanner);
        
       
}
}
